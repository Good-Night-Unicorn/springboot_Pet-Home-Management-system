package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
import com.entity.TokenEntity;
import com.utils.ValidatorUtils;
import com.utils.DeSensUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YuangongEntity;
import com.entity.view.YuangongView;

import com.service.YuangongService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.EncryptUtil;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 员工
 * 后端接口
 * @author 
 * @email 
 * @date 2025-03-28 22:48:34
 */
@RestController
@RequestMapping("/yuangong")
public class YuangongController {
    @Autowired
    private YuangongService yuangongService;






    
	@Autowired
	private TokenService tokenService;
	
	/**
	 * 登录
	 */
	@IgnoreAuth
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		// 根据登录查询用户信息
        YuangongEntity u = yuangongService.selectOne(new EntityWrapper<YuangongEntity>().eq("yuangonggonghao", username));
        // 当用户不存在或md5方式验证密码不通过时
        if(u==null || !u.getMima().equals(EncryptUtil.md5(password))) {
            //账号或密码不正确提示
			return R.error("账号或密码不正确");
		}
        // 获取登录token
		String token = tokenService.generateToken(u.getId(), username,"yuangong",  "管理员" );
        //返回token
		return R.ok().put("token", token);
	}


	
	/**
     * 注册
     */
	@IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody YuangongEntity yuangong){
    	//ValidatorUtils.validateEntity(yuangong);
        //根据登录账号获取用户信息判断是否存在该用户，否则返回错误信息
    	YuangongEntity u = yuangongService.selectOne(new EntityWrapper<YuangongEntity>().eq("yuangonggonghao", yuangong.getYuangonggonghao()));
		if(u!=null) {
			return R.error("注册用户已存在");
		}
        //判断是否存在相同员工工号，否则返回错误信息
        if(yuangongService.selectCount(new EntityWrapper<YuangongEntity>().eq("yuangonggonghao", yuangong.getYuangonggonghao()))>0) {
            return R.error("员工工号已存在");
        }
		Long uId = new Date().getTime();
		yuangong.setId(uId);
        //设置登录密码md5方式加密
        yuangong.setMima(EncryptUtil.md5(yuangong.getMima()));
        //保存用户
        yuangongService.insert(yuangong);
        return R.ok();
    }

	
	/**
	 * 退出
	 */
	@RequestMapping("/logout")
	public R logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return R.ok("退出成功");
	}
	
	/**
     * 获取用户的session用户信息
     */
    @RequestMapping("/session")
    public R getCurrUser(HttpServletRequest request){
    	Long id = (Long)request.getSession().getAttribute("userId");
        YuangongEntity u = yuangongService.selectById(id);
        return R.ok().put("data", u);
    }
    
    /**
     * 密码重置
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	//根据登录账号判断是否存在用户信息，否则返回错误信息
        YuangongEntity u = yuangongService.selectOne(new EntityWrapper<YuangongEntity>().eq("yuangonggonghao", username));
    	if(u==null) {
    		return R.error("账号不存在");
    	}
        //重置密码为123456，并使用md5方式加密
        u.setMima(EncryptUtil.md5("123456"));
        yuangongService.updateById(u);
        return R.ok("密码已重置为：123456");
    }



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YuangongEntity yuangong,
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<YuangongEntity> ew = new EntityWrapper<YuangongEntity>();


        //查询结果
		PageUtils page = yuangongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuangong), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YuangongEntity yuangong, 
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<YuangongEntity> ew = new EntityWrapper<YuangongEntity>();

        //查询结果
		PageUtils page = yuangongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuangong), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YuangongEntity yuangong){
       	EntityWrapper<YuangongEntity> ew = new EntityWrapper<YuangongEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yuangong, "yuangong")); 
        return R.ok().put("data", yuangongService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YuangongEntity yuangong){
        EntityWrapper< YuangongEntity> ew = new EntityWrapper< YuangongEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yuangong, "yuangong")); 
		YuangongView yuangongView =  yuangongService.selectView(ew);
		return R.ok("查询员工成功").put("data", yuangongView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YuangongEntity yuangong = yuangongService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(yuangong,deSens);
        return R.ok().put("data", yuangong);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YuangongEntity yuangong = yuangongService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(yuangong,deSens);
        return R.ok().put("data", yuangong);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YuangongEntity yuangong, HttpServletRequest request){
        //验证字段唯一性，否则返回错误信息
        if(yuangongService.selectCount(new EntityWrapper<YuangongEntity>().eq("yuangonggonghao", yuangong.getYuangonggonghao()))>0) {
            return R.error("员工工号已存在");
        }
        //ValidatorUtils.validateEntity(yuangong);
        //验证账号唯一性，否则返回错误信息
        YuangongEntity u = yuangongService.selectOne(new EntityWrapper<YuangongEntity>().eq("yuangonggonghao", yuangong.getYuangonggonghao()));
        if(u!=null) {
            return R.error("用户已存在");
        }
    	yuangong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
		yuangong.setId(new Date().getTime());
        //密码使用md5方式加密
        yuangong.setMima(EncryptUtil.md5(yuangong.getMima()));
        yuangongService.insert(yuangong);
        return R.ok().put("data",yuangong.getId());
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YuangongEntity yuangong, HttpServletRequest request){
        //验证字段唯一性，否则返回错误信息
        if(yuangongService.selectCount(new EntityWrapper<YuangongEntity>().eq("yuangonggonghao", yuangong.getYuangonggonghao()))>0) {
            return R.error("员工工号已存在");
        }
        //ValidatorUtils.validateEntity(yuangong);
        //验证账号唯一性，否则返回错误信息
        YuangongEntity u = yuangongService.selectOne(new EntityWrapper<YuangongEntity>().eq("yuangonggonghao", yuangong.getYuangonggonghao()));
        if(u!=null) {
            return R.error("用户已存在");
        }
    	yuangong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
		yuangong.setId(new Date().getTime());
        //密码使用md5方式加密
        yuangong.setMima(EncryptUtil.md5(yuangong.getMima()));
        yuangongService.insert(yuangong);
        return R.ok().put("data",yuangong.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YuangongEntity yuangong, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yuangong);
        //验证字段唯一性，否则返回错误信息
        if(yuangongService.selectCount(new EntityWrapper<YuangongEntity>().ne("id", yuangong.getId()).eq("yuangonggonghao", yuangong.getYuangonggonghao()))>0) {
            return R.error("员工工号已存在");
        }
	    YuangongEntity yuangongEntity = yuangongService.selectById(yuangong.getId());
        //如果密码不为空，则判断是否和输入密码一致，不一致则重新设置
        if(StringUtils.isNotBlank(yuangong.getMima()) && !yuangong.getMima().equals(yuangongEntity.getMima())) {
            //密码使用md5方式加密
            yuangong.setMima(EncryptUtil.md5(yuangong.getMima()));
        }
        //全部更新
        yuangongService.updateById(yuangong);
        if(null!=yuangong.getYuangonggonghao())
        {
            // 修改token
            TokenEntity tokenEntity = new TokenEntity();
            tokenEntity.setUsername(yuangong.getYuangonggonghao());
            tokenService.update(tokenEntity, new EntityWrapper<TokenEntity>().eq("userid", yuangong.getId()));
        }
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yuangongService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    








}

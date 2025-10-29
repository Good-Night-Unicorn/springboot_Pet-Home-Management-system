package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
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

import com.entity.ChongwufenleiEntity;
import com.entity.view.ChongwufenleiView;

import com.service.ChongwufenleiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.EncryptUtil;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 宠物分类
 * 后端接口
 * @author 
 * @email 
 * @date 2025-03-28 22:48:34
 */
@RestController
@RequestMapping("/chongwufenlei")
public class ChongwufenleiController {
    @Autowired
    private ChongwufenleiService chongwufenleiService;






    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChongwufenleiEntity chongwufenlei,
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<ChongwufenleiEntity> ew = new EntityWrapper<ChongwufenleiEntity>();


        //查询结果
		PageUtils page = chongwufenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwufenlei), params), params));
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
    public R list(@RequestParam Map<String, Object> params,ChongwufenleiEntity chongwufenlei, 
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<ChongwufenleiEntity> ew = new EntityWrapper<ChongwufenleiEntity>();

        //查询结果
		PageUtils page = chongwufenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwufenlei), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChongwufenleiEntity chongwufenlei){
       	EntityWrapper<ChongwufenleiEntity> ew = new EntityWrapper<ChongwufenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chongwufenlei, "chongwufenlei")); 
        return R.ok().put("data", chongwufenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChongwufenleiEntity chongwufenlei){
        EntityWrapper< ChongwufenleiEntity> ew = new EntityWrapper< ChongwufenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chongwufenlei, "chongwufenlei")); 
		ChongwufenleiView chongwufenleiView =  chongwufenleiService.selectView(ew);
		return R.ok("查询宠物分类成功").put("data", chongwufenleiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChongwufenleiEntity chongwufenlei = chongwufenleiService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(chongwufenlei,deSens);
        return R.ok().put("data", chongwufenlei);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChongwufenleiEntity chongwufenlei = chongwufenleiService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(chongwufenlei,deSens);
        return R.ok().put("data", chongwufenlei);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChongwufenleiEntity chongwufenlei, HttpServletRequest request){
        //验证字段唯一性，否则返回错误信息
        if(chongwufenleiService.selectCount(new EntityWrapper<ChongwufenleiEntity>().eq("chongwufenlei", chongwufenlei.getChongwufenlei()))>0) {
            return R.error("宠物分类已存在");
        }
        //ValidatorUtils.validateEntity(chongwufenlei);
        chongwufenleiService.insert(chongwufenlei);
        return R.ok().put("data",chongwufenlei.getId());
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChongwufenleiEntity chongwufenlei, HttpServletRequest request){
        //验证字段唯一性，否则返回错误信息
        if(chongwufenleiService.selectCount(new EntityWrapper<ChongwufenleiEntity>().eq("chongwufenlei", chongwufenlei.getChongwufenlei()))>0) {
            return R.error("宠物分类已存在");
        }
        //ValidatorUtils.validateEntity(chongwufenlei);
        chongwufenleiService.insert(chongwufenlei);
        return R.ok().put("data",chongwufenlei.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChongwufenleiEntity chongwufenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chongwufenlei);
        //验证字段唯一性，否则返回错误信息
        if(chongwufenleiService.selectCount(new EntityWrapper<ChongwufenleiEntity>().ne("id", chongwufenlei.getId()).eq("chongwufenlei", chongwufenlei.getChongwufenlei()))>0) {
            return R.error("宠物分类已存在");
        }
        //全部更新
        chongwufenleiService.updateById(chongwufenlei);
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chongwufenleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    








}

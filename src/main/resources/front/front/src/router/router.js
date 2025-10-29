import VueRouter from 'vue-router'
//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import AddrList from '../pages/shop-address/list'
import AddrAdd from '../pages/shop-address/addOrUpdate'
import Order from '../pages/shop-order/list'
import OrderConfirm from '../pages/shop-order/confirm'
import Cart from '../pages/shop-cart/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import yuangongList from '../pages/yuangong/list'
import yuangongDetail from '../pages/yuangong/detail'
import yuangongAdd from '../pages/yuangong/add'
import chongwufenleiList from '../pages/chongwufenlei/list'
import chongwufenleiDetail from '../pages/chongwufenlei/detail'
import chongwufenleiAdd from '../pages/chongwufenlei/add'
import chongwushangchengList from '../pages/chongwushangcheng/list'
import chongwushangchengDetail from '../pages/chongwushangcheng/detail'
import chongwushangchengAdd from '../pages/chongwushangcheng/add'
import chongwubaikeList from '../pages/chongwubaike/list'
import chongwubaikeDetail from '../pages/chongwubaike/detail'
import chongwubaikeAdd from '../pages/chongwubaike/add'
import chargerecordList from '../pages/chargerecord/list'
import chargerecordDetail from '../pages/chargerecord/detail'
import chargerecordAdd from '../pages/chargerecord/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'
import discusschongwushangchengList from '../pages/discusschongwushangcheng/list'
import discusschongwushangchengDetail from '../pages/discusschongwushangcheng/detail'
import discusschongwushangchengAdd from '../pages/discusschongwushangcheng/add'
import discusschongwubaikeList from '../pages/discusschongwubaike/list'
import discusschongwubaikeDetail from '../pages/discusschongwubaike/detail'
import discusschongwubaikeAdd from '../pages/discusschongwubaike/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'storeup',
					component: Storeup
				},
                {
                    path: 'shop-address/list',
                    component: AddrList
                },
                {
                    path: 'shop-address/addOrUpdate',
                    component: AddrAdd
                },
				{
					path: 'shop-order/order',
					component: Order
				},
				{
					path: 'cart',
					component: Cart
				},
				{
					path: 'shop-order/orderConfirm',
					component: OrderConfirm
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'yuangong',
					component: yuangongList
				},
				{
					path: 'yuangongDetail',
					component: yuangongDetail
				},
				{
					path: 'yuangongAdd',
					component: yuangongAdd
				},
				{
					path: 'chongwufenlei',
					component: chongwufenleiList
				},
				{
					path: 'chongwufenleiDetail',
					component: chongwufenleiDetail
				},
				{
					path: 'chongwufenleiAdd',
					component: chongwufenleiAdd
				},
				{
					path: 'chongwushangcheng',
					component: chongwushangchengList
				},
				{
					path: 'chongwushangchengDetail',
					component: chongwushangchengDetail
				},
				{
					path: 'chongwushangchengAdd',
					component: chongwushangchengAdd
				},
				{
					path: 'chongwubaike',
					component: chongwubaikeList
				},
				{
					path: 'chongwubaikeDetail',
					component: chongwubaikeDetail
				},
				{
					path: 'chongwubaikeAdd',
					component: chongwubaikeAdd
				},
				{
					path: 'chargerecord',
					component: chargerecordList
				},
				{
					path: 'chargerecordDetail',
					component: chargerecordDetail
				},
				{
					path: 'chargerecordAdd',
					component: chargerecordAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
				{
					path: 'discusschongwushangcheng',
					component: discusschongwushangchengList
				},
				{
					path: 'discusschongwushangchengDetail',
					component: discusschongwushangchengDetail
				},
				{
					path: 'discusschongwushangchengAdd',
					component: discusschongwushangchengAdd
				},
				{
					path: 'discusschongwubaike',
					component: discusschongwubaikeList
				},
				{
					path: 'discusschongwubaikeDetail',
					component: discusschongwubaikeDetail
				},
				{
					path: 'discusschongwubaikeAdd',
					component: discusschongwubaikeAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})

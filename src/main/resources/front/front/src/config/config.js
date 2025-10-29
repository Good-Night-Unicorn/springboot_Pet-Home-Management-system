export default {
	baseUrl: 'http://localhost:8080/springboota7e2182m/',
	name: '/springboota7e2182m',
	indexNav: [
		{
			name: '宠物商城',
			url: '/index/chongwushangcheng',
		},
		{
			name: '宠物百科',
			url: '/index/chongwubaike',
		},
		{
			name: '通知公告',
			url: '/index/news'
		},
	],
	cateList: [
		{
			name: '通知公告',
			refTable: 'newstype',
			refColumn: 'typename',
		},
	]
}

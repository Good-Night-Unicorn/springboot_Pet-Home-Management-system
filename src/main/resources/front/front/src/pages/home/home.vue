<template>
	<div class="home-preview">




		<!-- 新闻资讯 -->
		<div id="animate_newsnews" class="news animate__animated">
			<div class="news_title_box">
				<span class="news_title">通知公告</span>
				<span class="news_subhead">{{'news'.toUpperCase()}}</span>
			</div>
			<!-- 样式五 -->
			<div v-if="newsList.length" class="list list5 index-pv1">
				<div @click="toDetail('newsDetail', newsList[0])" v-if="newsList.length>0" class="list-item animation-box">
					<img :src="baseUrl + newsList[0].picture" alt="">
					<div class="infoBox">
						<div class="name line1">{{newsList[0].title}}</div>
						<div class="desc line3">{{newsList[0].introduction}}</div>
						<div class="time_item">
							<span class="icon iconfont icon-shijian21"></span>
							<span class="label">发布时间：</span>
							<span class="text">{{newsList[0].addtime}}</span>
						</div>
						<div class="publisher_item">
							<span class="icon iconfont icon-geren16"></span>
							<span class="label">发布人：</span>
							<span class="text">{{newsList[0].name}}</span>
						</div>
						<div class="like_item">
							<span class="icon iconfont icon-zan10"></span>
							<span class="label">点赞数：</span>
							<span class="text">{{newsList[0].thumbsupnum}}</span>
						</div>
						<div class="collect_item">
							<span class="icon iconfont icon-shoucang10"></span>
							<span class="label">收藏量：</span>
							<span class="text">{{newsList[0].storeupnum}}</span>
						</div>
						<div class="view_item">
							<span class="icon iconfont icon-chakan9"></span>
							<span class="label">点击量：</span>
							<span class="text">{{newsList[0].clicknum}}</span>
						</div>
					</div>
				</div>
				<div class="list-body">
					<div @click="toDetail('newsDetail', newsList[1])" v-if="newsList.length>1" class="list-item1 animation-box">
						<div class="name line1">{{newsList[1].title}}</div>
						<div class="desc line3">{{newsList[1].introduction}}</div>
						<div class="time_item">
							<span class="icon iconfont icon-shijian21"></span>
							<span class="label">发布时间：</span>
							<span class="text">{{newsList[1].addtime.split(' ')[0]}}</span>
						</div>
						<div class="publisher_item">
							<span class="icon iconfont icon-geren16"></span>
							<span class="label">发布人：</span>
							<span class="text">{{newsList[1].name}}</span>
						</div>
						<div class="like_item">
							<span class="icon iconfont icon-zan10"></span>
							<span class="label">点赞数：</span>
							<span class="text">{{newsList[1].thumbsupnum}}</span>
						</div>
						<div class="collect_item">
							<span class="icon iconfont icon-shoucang10"></span>
							<span class="label">收藏量：</span>
							<span class="text">{{newsList[1].storeupnum}}</span>
						</div>
						<div class="view_item">
							<span class="icon iconfont icon-chakan9"></span>
							<span class="label">点击量：</span>
							<span class="text">{{newsList[1].clicknum}}</span>
						</div>
					</div>
					<div @click="toDetail('newsDetail', newsList[2])" v-if="newsList.length>2" class="list-item2 animation-box">
						<div class="name line1">{{newsList[2].title}}</div>
						<div class="desc line3">{{newsList[2].introduction}}</div>
						<div class="time_item">
							<span class="icon iconfont icon-shijian21"></span>
							<span class="label">发布时间：</span>
							<span class="text">{{newsList[2].addtime}}</span>
						</div>
						<div class="publisher_item">
							<span class="icon iconfont icon-geren16"></span>
							<span class="label">发布人：</span>
							<span class="text">{{newsList[2].name}}</span>
						</div>
						<div class="like_item">
							<span class="icon iconfont icon-zan10"></span>
							<span class="label">点赞数：</span>
							<span class="text">{{newsList[2].thumbsupnum}}</span>
						</div>
						<div class="collect_item">
							<span class="icon iconfont icon-shoucang10"></span>
							<span class="label">收藏量：</span>
							<span class="text">{{newsList[2].storeupnum}}</span>
						</div>
						<div class="view_item">
							<span class="icon iconfont icon-chakan9"></span>
							<span class="label">点击量：</span>
							<span class="text">{{newsList[2].clicknum}}</span>
						</div>
					</div>
					<div @click="toDetail('newsDetail', newsList[3])" v-if="newsList.length>3" class="list-item3 animation-box">
						<div class="name line1">{{newsList[3].title}}</div>
						<div class="desc line3">{{newsList[3].introduction}}</div>
						<div class="time_item">
							<span class="icon iconfont icon-shijian21"></span>
							<span class="label">发布时间：</span>
							<span class="text">{{newsList[3].addtime}}</span>
						</div>
						<div class="publisher_item">
							<span class="icon iconfont icon-geren16"></span>
							<span class="label">发布人：</span>
							<span class="text">{{newsList[3].name}}</span>
						</div>
						<div class="like_item">
							<span class="icon iconfont icon-zan10"></span>
							<span class="label">点赞数：</span>
							<span class="text">{{newsList[3].thumbsupnum}}</span>
						</div>
						<div class="collect_item">
							<span class="icon iconfont icon-shoucang10"></span>
							<span class="label">收藏量：</span>
							<span class="text">{{newsList[3].storeupnum}}</span>
						</div>
						<div class="view_item">
							<span class="icon iconfont icon-chakan9"></span>
							<span class="label">点击量：</span>
							<span class="text">{{newsList[3].clicknum}}</span>
						</div>
					</div>
				</div>
			</div>
			<div class="moreBtn" @click="moreBtn('news')">
				<span class="text">查看更多</span>
				<i class="icon iconfont icon-gengduo1"></i>
			</div>
		</div>
		<!-- 新闻资讯 -->
		<!-- 商品推荐 -->
		<div id="animate_recommendchongwushangcheng" class="recommend animate__animated">
			<div class="recommend_title_box">
				<span class="recommend_title">宠物商城推荐</span>
				<span class="recommend_subhead">{{'chongwushangcheng'.toUpperCase()}} RECOMMEND</span>
			</div>
			<div class="list list20 index-pv1">
				<div class="list-body">
					<div class="list-item" v-for="(item,index) in chongwushangchengRecommend" :key="index" @click="toDetail('chongwushangchengDetail', item)">
						<div class="img">
							<img v-if="preHttp(item.tupian)" :src="item.tupian.split(',')[0]" alt="" />
							<img v-else :src="baseUrl + (item.tupian?item.tupian.split(',')[0]:'')" alt="" />
						</div>
						<div class="infoBox">
							<div class="name">{{item.biaoti}}</div>
							<div class="name">{{item.chongwufenlei}}</div>
							<div class="name">{{item.chongwupinzhong}}</div>
							<div class="price">￥{{item.price}}</div>
							<div class="time_item">
								<span class="icon iconfont icon-shijian21"></span>
								<span class="label">发布时间：</span>
								<span class="text">{{item.addtime}}</span>
							</div>
							<div class="collect_item">
								<span class="icon iconfont icon-shoucang10"></span>
								<span class="label">收藏量：</span>
								<span class="text">{{item.storeupnum}}</span>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="moreBtn" @click="moreBtn('chongwushangcheng')">
				<span class="text">查看更多</span>
				<i class="icon iconfont icon-gengduo1"></i>
			</div>
		</div>
		<!-- 商品推荐 -->
		<!-- 商品推荐 -->
		<div id="animate_recommendchongwubaike" class="recommend animate__animated">
			<div class="recommend_title_box">
				<span class="recommend_title">宠物百科推荐</span>
				<span class="recommend_subhead">{{'chongwubaike'.toUpperCase()}} RECOMMEND</span>
			</div>
			<div class="list list20 index-pv1">
				<div class="list-body">
					<div class="list-item" v-for="(item,index) in chongwubaikeRecommend" :key="index" @click="toDetail('chongwubaikeDetail', item)">
						<div class="img">
							<img v-if="preHttp(item.tupian)" :src="item.tupian.split(',')[0]" alt="" />
							<img v-else :src="baseUrl + (item.tupian?item.tupian.split(',')[0]:'')" alt="" />
						</div>
						<div class="infoBox">
							<div class="name">{{item.biaoti}}</div>
							<div class="name">{{item.chongwufenlei}}</div>
							<div class="time_item">
								<span class="icon iconfont icon-shijian21"></span>
								<span class="label">发布时间：</span>
								<span class="text">{{item.addtime}}</span>
							</div>
							<div class="collect_item">
								<span class="icon iconfont icon-shoucang10"></span>
								<span class="label">收藏量：</span>
								<span class="text">{{item.storeupnum}}</span>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="moreBtn" @click="moreBtn('chongwubaike')">
				<span class="text">查看更多</span>
				<i class="icon iconfont icon-gengduo1"></i>
			</div>
		</div>
		<!-- 商品推荐 -->
	</div>
</template>

<script>
import 'animate.css'
import Swiper from "swiper";

	export default {
		//数据集合
		data() {
			return {
				baseUrl: '',
				newsList: [],
				chongwushangchengRecommend: [],
				chongwubaikeRecommend: [],





			}
		},
		created() {
			this.baseUrl = this.$config.baseUrl;
			this.getNewsList();
			this.getList();
		},
		mounted() {
			window.addEventListener('scroll', this.handleScroll)
			setTimeout(()=>{
				this.handleScroll()
			},100)
			
			this.swiperChanges()
		},
		beforeDestroy() {
			window.removeEventListener('scroll', this.handleScroll)
		},
		//方法集合
		methods: {
			swiperChanges() {
				setTimeout(()=>{
				},750)
			},

			listClick14(index, name) {
				this['listIndex14' + name] = index
			},

			handleScroll() {
				let arr = [
					{id:'about',css:'animate__'},
					{id:'system',css:'animate__'},
					{id:'animate_recommendchongwushangcheng',css:'animate__'},
					{id:'animate_recommendchongwubaike',css:'animate__'},
					{id:'animate_newsnews',css:'animate__'},
				]
			
				for (let i in arr) {
					let doc = document.getElementById(arr[i].id)
					if (doc) {
						let top = doc.offsetTop
						let win_top = window.innerHeight + window.pageYOffset
						// console.log(top,win_top)
						if (win_top > top && doc.classList.value.indexOf(arr[i].css) < 0) {
							// console.log(doc)
							doc.classList.add(arr[i].css)
						}
					}
				}
			},
			preHttp(str) {
				return str && str.substr(0,4)=='http';
			},
			preHttp2(str) {
				return str && str.split(',w').length>1;
			},
			getNewsList() {
				let data = {
					page: 1,
					limit: 4,
					sort: 'addtime',
					order: 'desc'
				}
				this.$http.get('news/list', {params: data}).then(res => {
					if (res.data.code == 0) {
						this.newsList = res.data.data.list;
					
					}
				});
			},
			getList() {
				let autoSortUrl = "";
				let data = {}
				autoSortUrl = "chongwushangcheng/autoSort";
				if(localStorage.getItem('frontToken')) {
					autoSortUrl = "chongwushangcheng/autoSort2";
				}
				data = {
					page: 1,
					limit: 8,
					onshelves: 1,
				}
				this.$http.get(autoSortUrl, {params: data}).then(res => {
					if (res.data.code == 0) {
						this.chongwushangchengRecommend = res.data.data.list;
					}
				});
				autoSortUrl = "chongwubaike/autoSort";
				if(localStorage.getItem('frontToken')) {
					autoSortUrl = "chongwubaike/autoSort2";
				}
				data = {
					page: 1,
					limit: 8,
				}
				this.$http.get(autoSortUrl, {params: data}).then(res => {
					if (res.data.code == 0) {
						this.chongwubaikeRecommend = res.data.data.list;
					}
				});
			
			},
			toDetail(path, item) {
				this.$router.push({path: '/index/' + path, query: {id: item.id}});
			},
			moreBtn(path) {
				this.$router.push({path: '/index/' + path});
			}
		}
	}
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.home-preview {
		padding: 0;
		margin: 0;
		flex-direction: column;
		display: flex;
		width: 100%;
		.news {
			padding: 125px calc(50% - 600px);
			margin: 0;
			overflow: hidden;
			background: url(http://codegen.caihongy.cn/20250206/d31467423f6042a49685a0cdd7ad1599.png) no-repeat center / 100% 100%;
			width: 100%;
			position: relative;
			order: 2;
			height: 990px;
			.news_title_box {
				padding: 0;
				margin: 0 0 30px 0;
				background: url(http://codegen.caihongy.cn/20250206/a81e02b96be0420c8ac89333a8ef7c3e.png) no-repeat center;
				width: 100%;
				line-height: 80px;
				text-align: center;
				.news_title {
					color: #56857A;
					font-weight: 600;
					font-size: 24px;
				}
				.news_subhead {
					margin: 0 0 10px;
					color: #999;
					display: none;
					width: 100%;
					font-size: 20px;
					line-height: 1.5;
					text-align: center;
				}
			}
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 10px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1.1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
			.list5 {
				padding: 0;
				background: none;
				width: 100%;
				height: auto;
				.list-item {
					margin: 0 0 20px;
					background: #fff;
					display: flex;
					width: 100%;
					align-items: center;
					height: 275px;
					img {
						object-fit: cover;
						width: 50%;
						height: 100%;
						order: 1;
					}
					.infoBox {
						padding: 10px 30px;
						background: #fff;
						display: flex;
						gap: 10px;
						width: 50%;
						align-items: center;
						flex-wrap: wrap;
						height: auto;
						.name {
							padding: 0 0 10px 0;
							color: #000000;
							font-weight: 600;
							width: 100%;
							font-size: 16px;
							border-color: #C4C4C4;
							border-width: 0 0 1px 0;
							line-height: 24px;
							border-style: solid;
						}
						.desc {
							padding: 0;
							max-height: 60px;
							overflow: hidden;
							color: #8B8B8B;
							width: 100%;
							font-size: 14px;
							border-color: #C4C4C4;
							border-width: 0 0 1px 0;
							line-height: 20px;
							border-style: solid;
						}
						.time_item {
							padding: 0;
							width: 100%;
							.icon {
								margin: 0 2px 0 0;
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.label {
								color: #286A5A;
								font-size: 12px;
								line-height: 1.5;
							}
							.text {
								color: #286A5A;
								font-size: 12px;
								line-height: 1.5;
							}
						}
						.publisher_item {
							padding: 0;
							.icon {
								margin: 0 2px 0 0;
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.label {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.text {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
						}
						.like_item {
							padding: 0;
							.icon {
								margin: 0 2px 0 0;
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.label {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.text {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
						}
						.collect_item {
							padding: 0;
							.icon {
								margin: 0 2px 0 0;
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.label {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.text {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
						}
						.view_item {
							padding: 0;
							.icon {
								margin: 0 2px 0 0;
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.label {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.text {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
						}
					}
				}
				.list-body {
					background: none;
					display: flex;
					gap: 30px;
					width: 100%;
					justify-content: flex-start;
					flex-wrap: wrap;
					height: 275px;
					.list-item1 {
						padding: 10px;
						background: #fff;
						width: calc(33.33% - 20px);
						position: relative;
						height: 100%;
						.name {
							padding: 0 0 10px 0;
							color: #000000;
							font-weight: 600;
							width: 100%;
							font-size: 16px;
							border-color: #C4C4C4;
							border-width: 0 0 1px 0;
							line-height: 24px;
							border-style: solid;
						}
						.desc {
							padding: 0;
							max-height: 60px;
							margin: 10px 0 0;
							overflow: hidden;
							color: #8B8B8B;
							width: 100%;
							font-size: 14px;
							border-color: #C4C4C4;
							border-width: 0 0 1px 0;
							line-height: 20px;
							border-style: solid;
						}
						.time_item {
							padding: 0;
							.icon {
								margin: 0 2px 0 0;
								color: #286A5A;
								font-size: 12px;
								line-height: 1.5;
							}
							.label {
								color: #286A5A;
								font-size: 12px;
								line-height: 1.5;
							}
							.text {
								color: #286A5A;
								font-size: 12px;
								line-height: 1.5;
							}
						}
						.publisher_item {
							padding: 0 10px 0 0;
							.icon {
								margin: 0 2px 0 0;
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.label {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.text {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
						}
						.like_item {
							padding: 0 10px 0 0;
							.icon {
								margin: 0 2px 0 0;
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.label {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.text {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
						}
						.collect_item {
							padding: 0 10px 0 0;
							.icon {
								margin: 0 2px 0 0;
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.label {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.text {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
						}
						.view_item {
							padding: 0 10px 0 0;
							.icon {
								margin: 0 2px 0 0;
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.label {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.text {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
						}
					}
					.list-item2 {
						padding: 10px;
						background: #fff;
						width: calc(33.33% - 20px);
						position: relative;
						height: 100%;
						.name {
							padding: 0 0 10px 0;
							color: #000000;
							font-weight: 600;
							width: 100%;
							font-size: 16px;
							border-color: #C4C4C4;
							border-width: 0 0 1px 0;
							line-height: 24px;
							border-style: solid;
						}
						.desc {
							padding: 0;
							max-height: 60px;
							margin: 10px 0 0;
							overflow: hidden;
							color: #8B8B8B;
							width: 100%;
							font-size: 14px;
							border-color: #C4C4C4;
							border-width: 0 0 1px 0;
							line-height: 20px;
							border-style: solid;
						}
						.time_item {
							padding: 0 10px 0 0;
							.icon {
								margin: 0 2px 0 0;
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.label {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.text {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
						}
						.publisher_item {
							padding: 0 10px 0 0;
							.icon {
								margin: 0 2px 0 0;
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.label {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.text {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
						}
						.like_item {
							padding: 0 10px 0 0;
							.icon {
								margin: 0 2px 0 0;
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.label {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.text {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
						}
						.collect_item {
							padding: 0 10px 0 0;
							.icon {
								margin: 0 2px 0 0;
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.label {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.text {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
						}
						.view_item {
							padding: 0 10px 0 0;
							.icon {
								margin: 0 2px 0 0;
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.label {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.text {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
						}
					}
					.list-item3 {
						padding: 10px;
						background: #fff;
						width: calc(33.33% - 20px);
						position: relative;
						height: 100%;
						.name {
							padding: 0 0 10px 0;
							color: #000000;
							font-weight: 600;
							width: 100%;
							font-size: 16px;
							border-color: #C4C4C4;
							border-width: 0 0 1px 0;
							line-height: 24px;
							border-style: solid;
						}
						.desc {
							padding: 0;
							max-height: 60px;
							margin: 10px 0 0;
							overflow: hidden;
							color: #8B8B8B;
							width: 100%;
							font-size: 14px;
							border-color: #C4C4C4;
							border-width: 0 0 1px 0;
							line-height: 20px;
							border-style: solid;
						}
						.time_item {
							padding: 0 10px 0 0;
							.icon {
								margin: 0 2px 0 0;
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.label {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.text {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
						}
						.publisher_item {
							padding: 0 10px 0 0;
							.icon {
								margin: 0 2px 0 0;
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.label {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.text {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
						}
						.like_item {
							padding: 0 10px 0 0;
							.icon {
								margin: 0 2px 0 0;
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.label {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.text {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
						}
						.collect_item {
							padding: 0 10px 0 0;
							.icon {
								margin: 0 2px 0 0;
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.label {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.text {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
						}
						.view_item {
							padding: 0 10px 0 0;
							.icon {
								margin: 0 2px 0 0;
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.label {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
							.text {
								color: #666;
								font-size: 12px;
								line-height: 1.5;
							}
						}
					}
				}
			}
			.moreBtn {
				border: 5px solid #fff;
				cursor: pointer;
				margin: 20px auto 0;
				color: #fff;
				background: #56857A;
				display: block;
				width: 160px;
				line-height: 43px;
				text-align: center;
				.text {
					color: inherit;
					font-size: 12px;
				}
				.icon {
					color: inherit;
					font-size: 12px;
				}
			}
		}
		.recommend {
			padding: 40px calc(50% - 600px);
			margin: 0;
			background: url(http://codegen.caihongy.cn/20250206/4bc5fc8b2adf4dc2b6b47a852f8d93b2.png) no-repeat center / 100% 100%;
			width: 100%;
			position: relative;
			order: 3;
			.recommend_title_box {
				padding: 0;
				margin: 0 0 30px 0;
				background: url(http://codegen.caihongy.cn/20250206/913c65e0ee3248549258d770e7c33614.png) no-repeat center;
				width: 100%;
				line-height: 80px;
				text-align: center;
				.recommend_title {
					color: #fff;
					font-weight: 600;
					font-size: 22px;
				}
				.recommend_subhead {
					margin: 0 0 10px;
					color: #999;
					display: none;
					width: 100%;
					font-size: 20px;
					line-height: 1.5;
					text-align: center;
				}
			}
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 10px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
			.list20 {
				margin: 0 auto;
				overflow: hidden;
				background: none;
				width: 100%;
				clear: both;
				.list-body {
					margin: 0 auto;
					display: flex;
					width: 100%;
					justify-content: space-between;
					position: relative;
					flex-wrap: wrap;
					.list-item {
						border: 10px solid #fff;
						margin: 0 0 15px;
						z-index: 99;
						overflow: hidden;
						width: calc(25% - 10px);
						position: relative;
						height: 300px;
						.img {
							border: 10px solid #fff;
							width: 100%;
							height: 100%;
							img {
								object-fit: cover;
								width: 100%;
								height: 100%;
							}
						}
						.infoBox {
							padding: 10px 0px;
							bottom: -100%;
							display: flex;
							transition: all 0.5s;
							flex-wrap: wrap;
							flex-direction: column;
							left: 0px;
							background: rgba(255, 255, 255, .8);
							width: 100%;
							justify-content: center;
							align-items: center;
							position: absolute;
							text-align: center;
							.name {
								padding: 0px 10px;
								overflow: hidden;
								color: #fff;
								white-space: nowrap;
								display: block;
								font-size: 16px;
								text-overflow: ellipsis;
							}
							.price {
								padding: 0px 10px;
								color: #f00;
								font-size: 16px;
							}
							.time_item {
								padding: 0;
								.icon {
									margin: 0 2px 0 0;
									color: #fff;
									font-size: 12px;
									line-height: 1.5;
								}
								.label {
									color: #fff;
									font-size: 12px;
									line-height: 1.5;
								}
								.text {
									color: #fff;
									font-size: 12px;
									line-height: 1.5;
								}
							}
							.publisher_item {
								padding: 0;
								.icon {
									margin: 0 2px 0 0;
									color: #fff;
									font-size: 12px;
									line-height: 1.5;
								}
								.label {
									color: #fff;
									font-size: 12px;
									line-height: 1.5;
								}
								.text {
									color: #fff;
									font-size: 12px;
									line-height: 1.5;
								}
							}
							.like_item {
								padding: 0;
								.icon {
									margin: 0 2px 0 0;
									color: #fff;
									font-size: 12px;
									line-height: 1.5;
								}
								.label {
									color: #fff;
									font-size: 12px;
									line-height: 1.5;
								}
								.text {
									color: #fff;
									font-size: 12px;
									line-height: 1.5;
								}
							}
							.collect_item {
								padding: 0;
								.icon {
									margin: 0 2px 0 0;
									color: #fff;
									font-size: 12px;
									line-height: 1.5;
								}
								.label {
									color: #fff;
									font-size: 12px;
									line-height: 1.5;
								}
								.text {
									color: #fff;
									font-size: 12px;
									line-height: 1.5;
								}
							}
							.view_item {
								padding: 0;
								.icon {
									margin: 0 2px 0 0;
									color: #fff;
									font-size: 12px;
									line-height: 1.5;
								}
								.label {
									color: #fff;
									font-size: 12px;
									line-height: 1.5;
								}
								.text {
									color: #fff;
									font-size: 12px;
									line-height: 1.5;
								}
							}
						}
					}
					.list-item:hover {
						border: 10px solid #339933;
						.img {
							border: 10px solid #68bf68;
							img {
								transform: scale(0.96);
								transition: all 0.5s ease-out;
							}
						}
						.infoBox {
							bottom: 0px;
							background: rgba(0, 0, 0, .5);
							height: 100%;
						}
					}
				}
			}
			.moreBtn {
				border: 5px solid #56857A;
				cursor: pointer;
				margin: 20px auto 0;
				color: #56857A;
				background: #fff;
				display: block;
				width: 160px;
				line-height: 43px;
				text-align: center;
				.text {
					color: inherit;
					font-size: 12px;
				}
				.icon {
					color: inherit;
					font-size: 12px;
				}
			}
		}
	}
</style>

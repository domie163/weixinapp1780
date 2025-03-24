<template>
	<view class="content">
		<form class="app-update-pv">
			
			<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(204, 153, 204, 1)","margin":"0 0 20rpx 0","borderWidth":"4rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(204, 153, 204, 1)","textAlign":"left"}' class="title">车牌号码</view>
				<input :style='{"boxShadow":"0 0 10rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(204, 153, 204, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.chepaihaoma" v-model="ruleForm.chepaihaoma" placeholder="车牌号码"></input>
			</view>
			<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(204, 153, 204, 1)","margin":"0 0 20rpx 0","borderWidth":"4rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(204, 153, 204, 1)","textAlign":"left"}' class="title">车辆名称</view>
				<input :style='{"boxShadow":"0 0 10rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(204, 153, 204, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.cheliangmingcheng" v-model="ruleForm.cheliangmingcheng" placeholder="车辆名称"></input>
			</view>
			<view :style='{"boxShadow":"0 0 10rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(204, 153, 204, 1)","margin":"0 0 20rpx 0","borderWidth":"4rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group" @tap="cheliangzhaopianTap" :class='left == "left"?"":"active"'>
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(204, 153, 204, 1)","textAlign":"left"}' class="title">车辆照片</view>
				<view class="right-input" :style='{textAlign:"left"}' style="padding:0">
					<image :style='{"width":"88rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"88rpx"}' class="avator" v-if="ruleForm.cheliangzhaopian" :src="ruleForm.cheliangzhaopian" mode="aspectFill"></image>
					<image :style='{"width":"88rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"88rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
			<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(204, 153, 204, 1)","margin":"0 0 20rpx 0","borderWidth":"4rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(204, 153, 204, 1)","textAlign":"left"}' class="title">座位数量</view>
				<input :style='{"boxShadow":"0 0 10rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(204, 153, 204, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.zuoweishuliang" v-model="ruleForm.zuoweishuliang" placeholder="座位数量"></input>
			</view>
			<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(204, 153, 204, 1)","margin":"0 0 20rpx 0","borderWidth":"4rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(204, 153, 204, 1)","textAlign":"left"}' class="title">司机</view>
				<input :style='{"boxShadow":"0 0 10rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(204, 153, 204, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.siji" v-model="ruleForm.siji" placeholder="司机"></input>
			</view>
			<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(204, 153, 204, 1)","margin":"0 0 20rpx 0","borderWidth":"4rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(204, 153, 204, 1)","textAlign":"left"}' class="title">发车时间</view>
				<input :style='{"boxShadow":"0 0 10rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(204, 153, 204, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.facheshijian" placeholder="发车时间" @tap="toggleTab('facheshijian')"></input>
			</view>
			<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(204, 153, 204, 1)","margin":"0 0 20rpx 0","borderWidth":"4rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(204, 153, 204, 1)","textAlign":"left"}' class="title">到达时间</view>
				<input :style='{"boxShadow":"0 0 10rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(204, 153, 204, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.daodashijian" placeholder="到达时间" @tap="toggleTab('daodashijian')"></input>
			</view>
			
			<!-- 否 -->
 

			<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(204, 153, 204, 1)","margin":"0 0 20rpx 0","borderWidth":"4rpx","borderStyle":"solid","height":"308rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(204, 153, 204, 1)","textAlign":"left"}' class="title">车辆详情</view>
				<textarea :style='{"boxShadow":"0 0 10rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(204, 153, 204, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"280rpx"}' v-model="ruleForm.cheliangxiangqing" placeholder="车辆详情"></textarea>
			</view>
			
			
			<view class="btn">
				<button :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"rgba(204, 153, 204, 1)","borderColor":"rgba(204, 153, 204, 1)","borderRadius":"8rpx","color":"#fff","borderWidth":"1","width":"80%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="facheshijianConfirm" ref="facheshijian" themeColor="#333333"></w-picker>
		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="daodashijianConfirm" ref="daodashijian" themeColor="#333333"></w-picker>
			
	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				ruleForm: {
				chepaihaoma: '',
				cheliangmingcheng: '',
				cheliangzhaopian: '',
				zuoweishuliang: '',
				cheliangxiangqing: '',
				siji: '',
				facheshijian: '',
				daodashijian: '',
				thumbsupnum: '',
				crazilynum: '',
				},
				// 登陆用户信息
				user: {},
                                ro:{
                                   chepaihaoma : false,
                                   cheliangmingcheng : false,
                                   cheliangzhaopian : false,
                                   zuoweishuliang : false,
                                   cheliangxiangqing : false,
                                   siji : false,
                                   facheshijian : false,
                                   daodashijian : false,
                                   thumbsupnum : false,
                                   crazilynum : false,
                                },
			}
		},
		components: {
			wPicker
		},
		computed: {
			
			
			
			
			
			
			
			
			
			
		},
		async onLoad(options) {
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取


			// 如果有登陆，获取登陆后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`cheliangxinxi`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='chepaihaoma'){
					this.ruleForm.chepaihaoma = obj[o];
					this.ro.chepaihaoma = true;
					continue;
					}
					if(o=='cheliangmingcheng'){
					this.ruleForm.cheliangmingcheng = obj[o];
					this.ro.cheliangmingcheng = true;
					continue;
					}
					if(o=='cheliangzhaopian'){
					this.ruleForm.cheliangzhaopian = obj[o];
					this.ro.cheliangzhaopian = true;
					continue;
					}
					if(o=='zuoweishuliang'){
					this.ruleForm.zuoweishuliang = obj[o];
					this.ro.zuoweishuliang = true;
					continue;
					}
					if(o=='cheliangxiangqing'){
					this.ruleForm.cheliangxiangqing = obj[o];
					this.ro.cheliangxiangqing = true;
					continue;
					}
					if(o=='siji'){
					this.ruleForm.siji = obj[o];
					this.ro.siji = true;
					continue;
					}
					if(o=='facheshijian'){
					this.ruleForm.facheshijian = obj[o];
					this.ro.facheshijian = true;
					continue;
					}
					if(o=='daodashijian'){
					this.ruleForm.daodashijian = obj[o];
					this.ro.daodashijian = true;
					continue;
					}
					if(o=='thumbsupnum'){
					this.ruleForm.thumbsupnum = obj[o];
					this.ro.thumbsupnum = true;
					continue;
					}
					if(o=='crazilynum'){
					this.ruleForm.crazilynum = obj[o];
					this.ro.crazilynum = true;
					continue;
					}
				}
			}
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv .cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},

			// 多级联动参数


			// 日长控件选择日期时间
			facheshijianConfirm(val) {
				console.log(val)
				this.ruleForm.facheshijian = val.result;
				this.$forceUpdate();
			},
			// 日长控件选择日期时间
			daodashijianConfirm(val) {
				console.log(val)
				this.ruleForm.daodashijian = val.result;
				this.$forceUpdate();
			},


			cheliangzhaopianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.cheliangzhaopian = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},

			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {
				if(this.ruleForm.zuoweishuliang&&(!this.$validate.isIntNumer(this.ruleForm.zuoweishuliang))){
					this.$utils.msg(`座位数量应输入整数`);
					return
				}
				if(this.ruleForm.thumbsupnum&&(!this.$validate.isIntNumer(this.ruleForm.thumbsupnum))){
					this.$utils.msg(`赞应输入整数`);
					return
				}
				if(this.ruleForm.crazilynum&&(!this.$validate.isIntNumer(this.ruleForm.crazilynum))){
					this.$utils.msg(`踩应输入整数`);
					return
				}
				if(this.ruleForm.id){
					await this.$api.update(`cheliangxinxi`, this.ruleForm);
				}else{
					await this.$api.add(`cheliangxinxi`, this.ruleForm);
				}
				this.$utils.msgBack('提交成功');
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
		background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}
	
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group+.cu-form-group {
		border: 0;
	}
	
	.cu-form-group uni-input {
		padding: 0 30upx;
	}
	
	.uni-input {
		padding: 0 30upx;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.cu-form-group uni-picker::after {
		line-height: 88rpx;
	}
	
	.select .uni-input {
		line-height: 88rpx;
	}
	
	.input .right-input {
		line-height: 88rpx;
	}
</style>

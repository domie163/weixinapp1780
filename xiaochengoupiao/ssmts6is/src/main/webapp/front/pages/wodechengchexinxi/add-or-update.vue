<template>
	<view class="content">
		<form class="app-update-pv">
			
			<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(204, 153, 204, 1)","margin":"0 0 20rpx 0","borderWidth":"4rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(204, 153, 204, 1)","textAlign":"left"}' class="title">车辆号码</view>
				<picker @change="chelianghaomaChange" :value="chelianghaomaIndex" :range="chelianghaomaOptions">
					<view :style='{"boxShadow":"0 0 10rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(204, 153, 204, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.chelianghaoma?ruleForm.chelianghaoma:"请选择车辆号码"}}</view>
				</picker>
			</view>
			<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(204, 153, 204, 1)","margin":"0 0 20rpx 0","borderWidth":"4rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(204, 153, 204, 1)","textAlign":"left"}' class="title">发车时间</view>
				<input :style='{"boxShadow":"0 0 10rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(204, 153, 204, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.facheshijian" placeholder="发车时间" @tap="toggleTab('facheshijian')"></input>
			</view>
			<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(204, 153, 204, 1)","margin":"0 0 20rpx 0","borderWidth":"4rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(204, 153, 204, 1)","textAlign":"left"}' class="title">到达时间</view>
				<input :style='{"boxShadow":"0 0 10rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(204, 153, 204, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.daodashijian" placeholder="到达时间" @tap="toggleTab('daodashijian')"></input>
			</view>
			<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(204, 153, 204, 1)","margin":"0 0 20rpx 0","borderWidth":"4rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(204, 153, 204, 1)","textAlign":"left"}' class="title">座位</view>
				<picker @change="zuoweiChange" :value="zuoweiIndex" :range="zuoweiOptions">
					<view :style='{"boxShadow":"0 0 10rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(204, 153, 204, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.zuowei?ruleForm.zuowei:"请选择座位"}}</view>
				</picker>
			</view>
			<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(204, 153, 204, 1)","margin":"0 0 20rpx 0","borderWidth":"4rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(204, 153, 204, 1)","textAlign":"left"}' class="title">学号</view>
				<input :style='{"boxShadow":"0 0 10rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(204, 153, 204, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.xuehao" v-model="ruleForm.xuehao" placeholder="学号"></input>
			</view>
			<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(204, 153, 204, 1)","margin":"0 0 20rpx 0","borderWidth":"4rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(204, 153, 204, 1)","textAlign":"left"}' class="title">学生姓名</view>
				<input :style='{"boxShadow":"0 0 10rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(204, 153, 204, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.xueshengxingming" v-model="ruleForm.xueshengxingming" placeholder="学生姓名"></input>
			</view>
			
			<!-- 否 -->
 

			
			
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
				chelianghaoma: '',
				facheshijian: '',
				daodashijian: '',
				zuowei: '',
				xuehao: '',
				xueshengxingming: '',
				userid: '',
				},
				chelianghaomaOptions: [],
				chelianghaomaIndex: 0,
				zuoweiOptions: [],
				zuoweiIndex: 0,
				// 登陆用户信息
				user: {},
                                ro:{
                                   chelianghaoma : false,
                                   facheshijian : false,
                                   daodashijian : false,
                                   zuowei : false,
                                   xuehao : false,
                                   xueshengxingming : false,
                                   userid : false,
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
			this.ruleForm.xuehao = this.user.xuehao
			this.ruleForm.xueshengxingming = this.user.xueshengxingming

			// 下拉框
			res = await this.$api.option(`cheliangxinxi`,`chepaihaoma`,{});
			this.chelianghaomaOptions = res.data;
			// 下拉框
			res = await this.$api.option(`zuoweiguanli`,`zuowei`,{});
			this.zuoweiOptions = res.data;

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
				res = await this.$api.info(`wodechengchexinxi`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='chelianghaoma'){
					this.ruleForm.chelianghaoma = obj[o];
					this.ro.chelianghaoma = true;
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
					if(o=='zuowei'){
					this.ruleForm.zuowei = obj[o];
					this.ro.zuowei = true;
					continue;
					}
					if(o=='xuehao'){
					this.ruleForm.xuehao = obj[o];
					this.ro.xuehao = true;
					continue;
					}
					if(o=='xueshengxingming'){
					this.ruleForm.xueshengxingming = obj[o];
					this.ro.xueshengxingming = true;
					continue;
					}
					if(o=='userid'){
					this.ruleForm.userid = obj[o];
					this.ro.userid = true;
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

			// 下拉变化
			chelianghaomaChange(e) {
				this.chelianghaomaIndex = e.target.value
				this.ruleForm.chelianghaoma = this.chelianghaomaOptions[this.chelianghaomaIndex]
			},
			// 下拉变化
			zuoweiChange(e) {
				this.zuoweiIndex = e.target.value
				this.ruleForm.zuowei = this.zuoweiOptions[this.zuoweiIndex]
			},


			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {
				if(this.ruleForm.id){
					await this.$api.update(`wodechengchexinxi`, this.ruleForm);
				}else{
					await this.$api.add(`wodechengchexinxi`, this.ruleForm);
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

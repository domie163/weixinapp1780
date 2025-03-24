const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmts6is/",
            name: "ssmts6is",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmts6is/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校车购票微信小程序"
        } 
    }
}
export default base

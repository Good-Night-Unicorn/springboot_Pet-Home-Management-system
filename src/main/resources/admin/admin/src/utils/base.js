const base = {
    get() {
        return {
            url : "http://localhost:8080/springboota7e2182m/",
            name: "springboota7e2182m",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboota7e2182m/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于SpringBoot的宠物之家管理系统的设计与实现"
        } 
    }
}
export default base

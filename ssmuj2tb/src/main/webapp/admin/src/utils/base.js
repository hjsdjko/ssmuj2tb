const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmuj2tb/",
            name: "ssmuj2tb",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmuj2tb/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "健身房私教预约小程序"
        } 
    }
}
export default base

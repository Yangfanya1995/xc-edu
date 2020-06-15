//导入
var {add1}=require("./model01")
var Vue=require("../js/vue/vue.min.js")
var VM = new Vue({
    el:"#app",
    data:{
        name:"传智播客",
        num1:0,
        num2:0,
        result:0,
        url:"http://www.xuecheng.com",
        list:[1,2,3,4,4],
        user:{uname:'itcast1',age:10},
        userList:[
            {user:{uname:'itcast2',age:11}},
            {user:{uname:'heima',age:12}}
        ]
    },
    methods:{
        change:function () {
            this.result=add1(Number.parseInt(this.num1),Number.parseInt(this.num2));
        }
    }
});
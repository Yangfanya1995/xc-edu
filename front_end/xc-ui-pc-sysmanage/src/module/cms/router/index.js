import Home from '@/module/home/page/home.vue';
import page_list from '@/module/cms/page/page_list';
import page_add from '@/module/cms/page/page_add';
export default [{
  path:'/cms',
  component:Home,
  name:'cms内容管理',
  hidden: false,
  children:[
    {path:'/cms/page/list',name:'页面列表',component: page_list,hidden: false},
    {path:'/cms/page/add',name:'添加页面',component: page_add,hidden: true}
  ]
}]

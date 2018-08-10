import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import { Button, Card, List, Avatar} from 'ant-design-vue'


Vue.component(Button.name, Button)
Vue.component(Card.name, Card)
Vue.component(List.name, List)
Vue.component(List.Item.name, List.Item)
Vue.component(List.Item.Meta.name, List.Item.Meta)
Vue.component(Avatar.name, Avatar)


Vue.config.productionTip = false

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')

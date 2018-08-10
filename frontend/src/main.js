import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import { Button, Card } from 'ant-design-vue'

Vue.component(Button.name, Button)
Vue.component(Card.name, Card)

Vue.config.productionTip = false

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')

import Vue from 'vue'
import App from './App.vue'

Vue.config.productionTip = false

new Vue({
  render: h => h(App), // 展示当前目录下的App.vue
}).$mount('#app') // 替换public下index里的<div id="app"></div>

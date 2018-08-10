<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/logo.png">
    <Posts msg="Welcome to Your Vue.js App"/>
      <a-button type="primary">Primary</a-button>
      <a-button>Default</a-button>
      <a-button type="dashed">Dashed</a-button>
      <a-button type="danger">Danger</a-button>
  </div>
</template>


<script>
// @ is an alias to /src
import Posts from '@/components/Posts.vue'

export default {
  name: 'home',
  components: {
    Posts
  }
}
</script>

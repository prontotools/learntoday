<template>
  <div class="home">
    <Posts :posts="posts" />
  </div>
</template>


<script>
// @ is an alias to /src
import Posts from '@/components/Posts.vue'
import { mapGetters } from 'vuex'

export default {
  name: 'home',
  components: {
    Posts
  },
  computed: {
    ...mapGetters({
      posts: 'getPosts'
    })
  }
}
</script>

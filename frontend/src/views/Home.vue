<template>
  <div class="home">
    <Posts :posts="posts" />
    <a-button type="primary">Primary</a-button>
    <a-button>Default</a-button>
    <a-button type="dashed">Dashed</a-button>
    <a-button type="danger">Danger</a-button>
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

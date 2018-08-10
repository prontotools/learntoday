<template>
  <div class="home">
    <Posts :posts="posts"/>
    <a-button type="primary">Primary</a-button>
    <a-button>Default</a-button>
    <a-button type="dashed">Dashed</a-button>
    <a-button type="danger">Danger</a-button>
  </div>
</template>


<script>
// @ is an alias to /src
import Posts from '@/components/Posts.vue'

const posts = [
  {
    author: 'Gatuk',
    tags: ['tag1', 'tag2'],
    timestamp: new Date(),
    message: 'wow'
  },
  {
    author: 'Human',
    tags: ['tag3', 'tag4'],
    timestamp: new Date(),
    message: 'woo'
  },
  {
    author: 'Phawin',
    tags: [],
    timestamp: new Date(),
    message: "I'm your father"
  }
]

export default {
  name: 'home',
  components: {
    Posts
  },
  data: () => ({
    posts
  })
}
</script>

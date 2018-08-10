<template>
  <div id="app">
    <div id="nav">
      <router-link to="/">Posts</router-link> |
    </div>
    <router-view/>
  </div>
</template>

<script>
import { mapMutations } from 'vuex'

const posts = [
  {
    id: 1,
    author: 'Gatuk',
    tags: ['tag1', 'tag2'],
    timestamp: new Date(),
    message: 'wow'
  },
  {
    id: 2,
    author: 'Human',
    tags: ['tag3', 'tag4'],
    timestamp: new Date(),
    message: 'woo'
  },
  {
    id: 3,
    author: 'Phawin',
    tags: [],
    timestamp: new Date(),
    message: "I'm your father"
  }
]

export default {
  methods: {
    ...mapMutations(['setPosts'])
  },
  created() {
    this.setPosts(posts)
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}
</style>

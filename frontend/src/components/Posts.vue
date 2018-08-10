<template>
  <div class="posts">
    <div v-for="(post, index) in posts" :key="index">
      <div>
        <h2>{{post.author}}</h2>
        <ul v-if="post.tags.length">
        <li class="tags" v-for="tag in post.tags" :key="tag">
          {{tag}}
        </li>
        </ul>
        <p>{{post.timestamp}}</p>
        <p>{{post.message}}</p>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    posts: Array
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.posts ul {
  list-style-type: none;
  padding: 0;
  display: flex;
}
.posts li {
  display: inline-block;
  margin: 0 10px;
}
</style>

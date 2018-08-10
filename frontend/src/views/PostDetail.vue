<template>
  <div class="grid">
    <a-card :loading="false">
      <div class="title-content">
        <div>
          <img src="https://www.w3schools.com/howto/img_avatar2.png" class="avatar" />
        </div>
        <div class="user-info">
          <h3>{{post.author}}</h3>
          <p>Pronto Tools</p>
        </div>
      </div>
      <p class="content">{{post.message}}</p>
      <p style="text-align: right;">{{post.timestamp}}</p>
    </a-card>
  </div>
</template>

<script>
import { mapGetters, mapState } from 'vuex'

export default {
  computed: mapState({
    post(state) {
      return state.posts.entities[this.$route.params.id]
    }
  })
}
</script>

<style scoped>
.content {
  margin-top: 50px;
  margin-bottom: 50px;
}
.grid {
  width: 80%;
  margin: auto;
  text-align: left;
}

.avatar {
  border-radius: 50%;
  width: 80px;
  height: 80px;
}

.title-content {
  display: flex;
  flex-direction: row;
}

.user-info {
  align-self: center;
  padding-left: 20px;
}

.user-info h3 {
  margin: 0;
}

.user-info p {
  margin: 0;
}
</style>

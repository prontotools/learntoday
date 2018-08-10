<template>
  <div class="posts grid">
    <a-card :loading="false">
      <a-list
      itemLayout="horizontal"
      :dataSource="posts"
      >
      <a-list-item slot="renderItem" slot-scope="item , index">
        <a-list-item-meta
          :description="item.message"
        >
          
          <a slot="title" :href="'/post/'+item.id">{{item.author}}</a>
          <a-avatar slot="avatar" src="https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png" />
        </a-list-item-meta>
          <div>{{Date(item.timestamp)}}</div>
      </a-list-item>
      </a-list>
    </a-card>
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

<style>
.posts {
  text-align: left;

}

.content {
  margin-top: 50px;
  margin-bottom: 50px;
}
.grid {
  width: 80%;
  margin: auto;
  text-align: left;
}
</style>



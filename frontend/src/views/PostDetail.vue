<template>
  <div class="grid">
      <a-card :loading="false">
        <div class="title-content">
          <div>
            <img src="https://www.w3schools.com/howto/img_avatar2.png" class="avatar"/>
          </div>
          <div class="user-info">
            <h3>Gatuk</h3>
            <p>Pronto Tools</p>
          </div>
        </div>
        <p class="content">
            Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
        </p>
        <p style="text-align: right;">
          10 Aug 2018
        </p>
      </a-card>
  </div>
</template>

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

.title-content{
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
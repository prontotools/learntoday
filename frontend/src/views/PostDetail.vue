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
      </a-card>
  </div>
</template>

<style scoped>
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
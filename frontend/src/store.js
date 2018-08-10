import Vue from 'vue'
import Vuex from 'vuex'
import * as R from 'ramda'
import keyBy from 'lodash/keyBy'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    posts: { entities: {}, allIds: [] }
  },
  getters: {
    getPosts: state => state.posts.allIds.map(id => state.posts.entities[id])
  },
  mutations: {
    setPosts(state, posts) {
      state.posts = {
        entities: keyBy(posts, R.prop('id')),
        allIds: R.map(R.prop('id'))(posts)
      }
    }
  },
  actions: {}
})

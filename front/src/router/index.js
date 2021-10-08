import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../components/Home.vue'
import Clues from '../components/Clues.vue'
import Complaints from '../components/Complaints.vue'
import Detective from '../components/Detective.vue'
import NavBarAdmin from '../components/NavBarAdmin.vue'
import NavBarLieux from '../components/NavBarLieux.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/complaints',
    name: 'Complaints',
    component: Complaints,
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../components/Complaints.vue')
  }, 
  {
    path: '/clues',
    name: 'Clues',
    component: Clues,
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../components/Clues.vue')
  },
  {
    path: '/detective',
    name: 'DetectivesOffice',
    component: Detective,
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../components/Detective.vue')
  },
  {
    path: '/navbar',
    name: 'NavBarLieux',
    component: NavBarLieux,

    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../components/NavBarLieux.vue')
  },
  {
  path: '/cellules',
  name: 'Cells',
  component: Cells,
  // route level code-splitting
  // this generates a separate chunk (about.[hash].js) for this route
  // which is lazy-loaded when the route is visited.
  component: () => import(/* webpackChunkName: "about" */ '../components/Cells.vue')
  }
]

const router = new VueRouter({
  routes
})

export default router

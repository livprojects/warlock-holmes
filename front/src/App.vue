<template>
  <div id="app">
    
    <header>
      <h1> Warlock Holmes</h1>
    </header>
    <main>

      <!-- Nav bar -->
      <div class="clues-left-nav">
        <NavBarAdmin></NavBarAdmin>
      </div>

      <!-- Centre de la page : Affiche le composant principal -->
      <div class="main-component">
        <router-view />
      </div>


      <div class="clues-right-nav">
        <NavBarLieux></NavBarLieux>
      </div>
    </main>

    <!-- Footer contact et CopyRight -->
    <Footer></Footer>
  </div>
</template>

<script>
  import NavBarAdmin from './components/NavBarAdmin.vue';
  import NavBarLieux from './components/NavBarLieux.vue';
  import Footer from'./components/Footer.vue';

  export default {
    name: 'App',
    components: {
      Footer, 
      NavBarAdmin,
      NavBarLieux
    }
  }
</script>

<style>
main {
	display: flex;
}

.clues-left-nav {
	
	width: 20%;
	
}


.clues-right-nav {
	
	width: 20%;
	
}

.button{
	background-color: red;
	color:white;
	padding: 15px 32px;
  text-align: center;
} 
</style>
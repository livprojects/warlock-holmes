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

@import url('https://fonts.googleapis.com/css2?family=Rubik:wght@300;400;600&family=Style+Script&display=swap');

body {
  font-family: 'Rubik', sans-serif;
  background-color: #F0BA09;
}

header {
  width: 30%;
  margin: 3rem auto 2rem 10rem;
}

h1 {
    color: white;
    font-family: 'Style Script', cursive;
    text-shadow: 5px 3px 2px rgb(51, 51, 51);
    font-size: xxx-large;
}

main {
  width: 80%;
  margin: 2rem auto;
	display: flex;
}

.clues-left-nav {
	
	width: 20%;
	
}


.clues-right-nav {
	
	width: 20%;
	
}

.main-component {
  padding: 2rem;
}
.button{
	background-color: red;
	color:white;
	padding: 15px 32px;
  text-align: center;
} 
</style>

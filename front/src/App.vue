<template>
  <div id="app">
    
    <header>
      <h1> Warlock Holmes</h1>
    </header>
    <main>

      <!-- Nav bar -->
      <div class="clues-left-nav">
        <!-- Insérer composant navigation admin -->
      </div>

      <!-- Centre de la page : Affiche le composant principal -->
      <div class="main-component">
        <router-view />
      </div>


      <div class="clues-right-nav">
        <!-- Insérer composant navigation lieux -->
      </div>
    </main>

    <!-- Footer contact et CopyRight -->
  </div>
</template>

<script>
  import Home from './components/Home.vue';
  import Footer from'./components/Footer.vue';

  export default {
    name: 'App',
    components: {
      Home,
      Footer
    }
  }
</script>

<style>
  @import '../assets/css/app.css';
</style>
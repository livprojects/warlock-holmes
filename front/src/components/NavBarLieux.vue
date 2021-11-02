<template>
 <div>
         <main>
             <nav class="navbar-places-right">
                 <!-- Début de la navigation des lieux -->
             

             <div class="heading">
                 <h4> Navigation </h4>
                
            </div>

            <ul class='nav-links'>

                <li class='nav-link'> <router-link to="/">Accueil</router-link> </li>
                <li class='nav-link'> <router-link to="/detective">Bureau du détective</router-link> </li>
                <li class='nav-link'> <router-link to="/complaints">Bureau des plaintes</router-link> </li>
                <li class='nav-link'> <router-link to="/clues"> Indices </router-link> </li>
                <li class='nav-link'> <router-link to="/cells"> Suspects </router-link> </li>
                <li class='nav-link'> <router-link to="/cases"> Affaires </router-link> </li>

            </ul>
     
     
         </nav>
         </main>
 </div>
</template>

<style>
@import '../assets/css/navbar.css';
</style>
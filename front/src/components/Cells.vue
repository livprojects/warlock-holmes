<template>
 <div>
     <header>
             <h1>Warlock Holmes</h1>  
             <h2>Cellules</h2>
         </header>
     
         <main>
             <div class="cells-left-nav">
                 <!-- Inclure la navigation administrative -->
             </div>
     
     
             <div class="cells-main-closet">
             <p>Tu es dans les Cellules, où tu peux voir les différents suspects. Attention, certains mordent !</p>   
                 <!-- <div v-for="suspect in listeSuspects" :key="suspect.name" class="suspects"> -->
                 <div v-for="suspect in listeTest" :key="suspect.name" class="suspects">
                     <!-- TODO : un générateur à la place du ", dit" avec des ", aussi appelé ", ", connu comme " etc-->
                     <p>Identité du suspect : {{suspect.name}}, dit {{suspect.surname}}</p>
                     <p>Occupation : {{suspect.occupation}} </p>		
                     <p>Alibi : {{suspect.alibi}} </p>
                      <img alt="Vous avez de la chance de ne pas voir sa sale tête" 
                          :src="suspect.urlPhoto"/>
                 </div>
             </div>
     
     
             <div class="suspects-right-nav">
                <!-- Inclure la navigation narrative -->
             </div>
         </main>
 </div>
</template>

<script>
export default {
  name: 'Suspects',
  data() {
    return {
        // TODO listeSuspects
    listeTest:[
        {
        name: "Toto", 
        surname: "la Fripouille",
        occupation: "huissier",
        alibi: "j'peux pas, j'ai piscine", 
        urlPhoto: "https://static.posters.cz/image/1300/posters-muraux/cute-kitten-i77094.jpg"
        }, 
                {
        name: "Tutu", 
        surname: "le Mordeur Fou",
        occupation: "goûteur",
        alibi: "mais c'était trop boooon !", 
        urlPhoto: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRJMvPpFn8ZPh19QDb2JnwuXvgmmEUyMlJoKg&usqp=CAU"
        }
        ],
    //   complaintsList: []
    }
  },
//   mounted() {
//     fetch("/api/complaints/")
//       .then((response) => response.text())
//       .then((data) => {
//           this.complaintsList = data;
//       });
//   },
    methods: {
    }
}
</script>

<style>
@import '../assets/css/complaints.css';
</style>
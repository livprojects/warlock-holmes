<template>
 <div>
     <header>
             <h1>Warlock Holmes</h1>  
             <h2>Le bureau des plaintes</h2>
         </header>
     
         <main>
             <div class="clues-left-nav">
                 <!-- Inclure la navigation administrative -->
             </div>
     
     
             <div class="clues-main-closet">
             <p>Tu es ici au point de départ de l'enquête. Sur ce tableau, tu trouveras toutes les affaires que nous avons enregistrées et qui n'ont pas encore été résolues à ce jour.</p>               
                 <div v-for="complaint in listeTest" :key="complaint.plaignant" class="plainte">
                     <p>Nom du ou de la plaignante : {{complaint.plaignant}}</p>
                     <p>Procès verbal : {{complaint.procesVerbal}} </p>		
                      <img :src="complaint.urlIllustration"/>  
                 </div>
             </div>
     
     
             <div class="clues-right-nav">
                <!-- Inclure la navigation narrative -->
             </div>
         </main>
 </div>
</template>

<script>
export default {
  name: 'Complaints',
  data() {
    return {
    listeTest:[
        {
        plaignant: "Toto", 
        procesVerbal:"Tatata", 
        urlIllustration: "https://static.posters.cz/image/1300/posters-muraux/cute-kitten-i77094.jpg"
        }, 
                {
        plaignant: "Ttutu", 
        procesVerbal:"patatati patatata", 
        urlIllustration: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRJMvPpFn8ZPh19QDb2JnwuXvgmmEUyMlJoKg&usqp=CAU"
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
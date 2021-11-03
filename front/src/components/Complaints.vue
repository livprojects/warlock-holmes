<template>
 <div id="complaints">
          
             <div class="clues-main-closet">
             <p>Tu es ici au point de départ de l'enquête. Sur ce tableau, tu trouveras toutes les affaires que nous avons enregistrées et qui n'ont pas encore été résolues à ce jour.</p>               
                 <div v-for="complaint in complaintsList" :key="complaint.plaintiveName" class="plainte">
                     <p>Nom du ou de la plaignante : {{complaint.plaintiveName}}</p>
                     <p>Procès verbal : {{complaint.report}} </p>		
                    <img :src="complaint.urlIllustration"/>  
                 </div>
             </div>
 </div>
</template>

<script>
export default {
  name: 'Complaints',
  data() {
    return {
       complaintsList: []
    }
  },
  mounted() {
    fetch("/api/cases/list")
      .then((response) => response.text())
      .then((data) => {
          console.log(data)
          //this.complaintsList = data;
      });
  },
    methods: {
    }
}
</script>

<style>
@import '../assets/css/complaints.css';
</style>
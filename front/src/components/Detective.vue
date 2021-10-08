<template>
    <div id="detective">
        <h2>Le bureau du détective</h2>
        <div>
            <p>Alors, tu penses avoir trouvé notre coupable ? Moi je pense que c'est le colonel Moutarde, avec le chandelier dans... pardon, je m'égare. Alors, dis-moi tout, je coffre qui ?!</p>
        </div>


        <div class="validation-form">
            <!-- Insérer composant validation formulaire -->
        </div>

        <img src="https://www.greenberg-art.com/.Illustrations/.Humorous/qq1sgMessyDesk.jpg" alt="Bureau de détective"/>
    </div>
</template>

<script>
    export default {
        name: 'Detective',
        //   mounted() {
        //     fetch("/api/complaints/")
        //       .then((response) => response.text())
        //       .then((data) => {
        //           this.complaintsList = data;
        //       });
        //   },
        methods: {}
    }
</script>

<style>
    @import '../assets/css/detective.css';
</style>
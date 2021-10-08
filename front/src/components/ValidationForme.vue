<template>
    <div id="validation-form">
        <form method="POST">
            <label for="complaint-select">Choisis ton affaire:</label>

            <select name="complaints" id="complaint-select">
                <option value="">-- Vas-y, choisis une affaire !--</option>
                <!-- Mettre une boucle  -->
            </select>

        </form>
        <button type="submit">Chef(fe), j'ai raison ?</button>
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
<template>
    <div id="validation-form">
        <form method="POST">
            <label for="complaint-select">L'affaire/la plainte:</label>

            <select name="complaints" id="complaint-select">
                <option value="">-- Vas-y, choisis une affaire !--</option>
                <!-- Mettre une boucle  -->
            </select>


            <label for="suspect-select">Le coupable:</label>

            <select name="suspects" id="suspect-select">
                <option value="">-- Alors, c'est qui ?--</option>
                <!-- Mettre une boucle  -->
            </select>

            <label for="suspect-select">L'arme du crime:</label>

            <select name="suspects" id="suspect-select">
                <option value="">-- Qu'est-ce que c'est que cette chose ?--</option>
                <!-- Mettre une boucle  -->
            </select>

        </form>
        <button type="submit">Chef(fe), j'ai raison ?</button>
    </div>
</template>

<script>
    export default {
        name: 'ValidationForm'
    }
</script>

<style>
    @import '../assets/css/validationform.css';
</style>
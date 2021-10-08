<template>
  <div id="home">
    <h2>Warlock Holmes : Un Cluedo revisit� super fun !</h2>
          
          
    
          <p class="welcome">Lorem ipsum dolor sit amet consectetur
            adipisicing elit. Perspiciatis non voluptatum laborum totam
            doloribus? Quam odio provident magnam veritatis numquam, quibusdam
            earum excepturi dolore voluptate! Quibusdam nisi fugit quo est.
            Lorem ipsum ad minim ven. Lorem ipsum dolor sit amet. Lorem ipsum
            dolor sit amet consectetur adipisicing elit. Perspiciatis non
            voluptatum laborum totam doloribus? Quam odio provident magnam
            veritatis numquam, quibusdam earum excepturi dolore voluptate!
            Quibusdam nisi fugit quo est. Lorem ipsum ad minim ven. Lorem ipsum
            dolor sit amet.</p>
    
          <p class="welcome">Lorem ipsum dolor sit amet consectetur
            adipisicing elit. Perspiciatis non voluptatum laborum totam
            doloribus? Quam odio provident magnam veritatis numquam, quibusdam
            earum excepturi dolore voluptate! Quibusdam nisi fugit quo est.
            Lorem ipsum ad minim ven. Lorem ipsum dolor sit amet. Lorem ipsum
            dolor sit amet consectetur adipisicing elit. Perspiciatis non
            voluptatum laborum totam doloribus? Quam odio provident magnam
            veritatis numquam, quibusdam earum excepturi dolore voluptate!
            Quibusdam nisi fugit quo est. Lorem ipsum ad minim ven. Lorem ipsum
            dolor sit amet.</p>
    
          <h3>D�butez votre enqu�te avec Warlock Holmes !</h3>
          
          <button onclick="/signup">Je m'inscris !</button>
          
          <h3> Vous �tes d�j� d�tective chez nous ? Connectez-vous !</h3>
          
          <button onclick="/login">Je m'identifie !</button>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data() {
    return {
      msg: ''
    }
  },
  mounted() {
    fetch("/api/clues/test")
      .then((response) => response.text())
      .then((data) => {
          this.msg = data;
      });
  }
}
</script>

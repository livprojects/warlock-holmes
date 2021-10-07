<template>
  <h1>{{ msg }}</h1>
</template>

<script>
export default {
  name: 'Complaints',
  data() {
    return {
      msg: ''
    }
  },
  mounted() {
    fetch("/api/complaints/")
      .then((response) => response.text())
      .then((data) => {
          this.msg = data;
      });
  }
}
</script>

<style>
@import '../assets/css/complaints.css';
</style>
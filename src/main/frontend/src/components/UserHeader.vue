<script setup>
import PopUpForm from "./PopUpForm.vue";
import PopUpLogin from "./PopUpLogin.vue";
</script>
<template>
  <header>
    <div class="header-content navbar navbar-expand-sm">
      <div class="col-md-2 p-2">
        <img
          src="../assets/resources/Upcomming-events-logo.png"
          class="img img-fluid"
          alt="Upcoming Events Logo"
          id="logoHeader"
        />
      </div>
      <button
        class="navbar-toggler"
        type="button"
        data-bs-toggle="collapse"
        data-bs-target="#opciones"
      >
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse justify-content-end" id="opciones">
        <div class="user-view-container" id="user-view">
          <button class="home-button" id="button-on">Home</button>
          <button class="my-events-button" id="button-off">My events</button>
          <p class="hi-user">Hi, Username</p>
        </div>
      </div>
    </div>
  </header>
</template>
<style scoped>
@import "../assets/css/NavBarComponent.css";
</style>

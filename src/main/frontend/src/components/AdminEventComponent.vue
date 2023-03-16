<script setup>
import PopUpEditForm from './PopUpEditForm.vue';

defineProps({
  available: {
    type: Boolean,
    default: null,
  },
  date: {
    type: String,
    default: null,
  },
  description: {
    type: String,
    default: null,
  },
  id: {
    type: Number,
    default: null,
  },
  image: {
    type: String,
    default: null,
  },
  max_users: {
    type: String,
    default: null,
  },
  signed_users: {
    type: String,
    default: null,
  },
  title: {
    type: String,
    default: null,
  },
});
</script>
<template>
  <div class="card mb" id="mainContainer">
    <div class="row g-0" id="childrenContainer">
      <div class="col-md" id="containerCheckbox-active">
        <div class="chekbox">
          <input
            class="form-check-input"
            type="checkbox"
            value=""
            id="flexCheckDefault"
          />
        </div>
      </div>
      <div class="col-md" id="imgContainer">
        <img :src="image" alt="Cometcon Image" />
      </div>
      <div class="col-md-9">
        <div class="card-body">
          <div class="d-flex" id="titleCard">
            <p class="card-title">{{ title }}</p>
            <p id="date">{{ date }}</p>
          </div>
          <p class="card-text">
            {{ description }}
          </p>
        </div>
      </div>
      <div class="col-sm-1" id="thirdColumn">
        <div class="card-body" id="btnmaxpeopleContainer">
          <div id="divBtnSign">
            <PopUpEditForm />
          </div>
          <div id="maxPeople">{{ signed_users }}/{{ max_users }}</div>
        </div>
      </div>
    </div>
  </div>
</template>
<style scoped>
@import "../assets/css/eventComponent.css";
</style>

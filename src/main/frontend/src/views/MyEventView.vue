<script setup>
import Header from "../components/Header.vue";
import MyEventComponent from "../components/MyEventComponent.vue";
import SliderComponent from "../components/SliderComponent.vue";
import { useMyEventsStore } from "../stores/SignEventStore";

const myEventsStore = useMyEventsStore();
</script>
<template>
  <Header />
  <SliderComponent />
  <div
    class="content__characters"
    v-for="signEvent in myEventsStore.showEvents()"
    :key="signEvent"
  >
    <MyEventComponent
      :available="signEvent.available"
      :date="signEvent.date"
      :description="signEvent.description"
      :id="signEvent.id"
      :image="signEvent.image"
      :max_users="signEvent.max_users"
      :signed_users="signEvent.signed_users"
      :title="signEvent.title"
    />
  </div>
</template>
<style scoped></style>

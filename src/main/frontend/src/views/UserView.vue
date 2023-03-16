<script setup>
import UserHeader from "../components/UserHeader.vue";
import SliderComponent from "../components/SliderComponent.vue";
import EventComponent from "../components/EventComponent.vue";
import { onBeforeMount } from "vue";
import { useEventsStore } from "../stores/EventsStore";

const store = useEventsStore();
onBeforeMount(async () => {
  await store.fetchEvents();
});
</script>

<template>
  <div class="about">
    <UserHeader />
    <SliderComponent />
    <div v-for="event in store.Events" :key="event">
      <EventComponent
        :available="event.available"
        :date="event.date"
        :description="event.description"
        :id="event.id"
        :image="event.image"
        :max_users="event.max_users"
        :signed_users="event.signed_users"
        :title="event.title"
      />
    </div>
  </div>
</template>

<style scoped></style>

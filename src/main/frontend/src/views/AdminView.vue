<script setup>
import AdminHeader from "../components/AdminHeader.vue";
import SliderChecking from "../components/SliderChecking.vue";
import AdminEventComponent from "../components/AdminEventComponent.vue";
import { onBeforeMount } from "vue";
import { useEventsStore } from "../stores/EventsStore";

const store = useEventsStore();
onBeforeMount(async () => {
  await store.fetchEvents();
});
</script>
<template>
  <AdminHeader />
  <SliderChecking />
  <div v-for="event in store.Events" :key="event">
    <AdminEventComponent
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
</template>
<style scoped></style>

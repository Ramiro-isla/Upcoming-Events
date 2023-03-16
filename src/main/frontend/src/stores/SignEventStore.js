import { defineStore } from "pinia";
import { ref } from "vue";
export const useMyEventsStore = defineStore({
  id: "useMyEventsStore",
  state: () => ({
    myEvents: ref([]),
  }),
  actions: {
    showEvents(events) {
      if (this.myEvents.indexOf(events) === -1) {
        this.myEvents.push(events);
      }
    },
  },
});

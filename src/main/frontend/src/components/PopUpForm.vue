<script setup>
import { useEventsStore } from '../stores/EventsStore';
import { onMounted,onBeforeMount } from 'vue';

const store = useEventsStore();
onBeforeMount(async()=>{
  await store.fetchEvents();
})

let newEvent = {
  title:"",
  date:"",
  max_users:"",
  description:"",
  image:""
}

async function save(){
  if(newEvent.title  == "") {
    alert("Se necesita un titulo para el evento")
    return
  } 
  if(newEvent.date == ""){
    alert("Se neceista una fecha")
    return
  }
  if(newEvent.max_users == ""){
    alert("Se necesita un número máximo de personas que puedan asistir al evento")
    return
  }
  if(newEvent.description == ""){
    alert("Se necesita una descripcion del evento")
    return
  }
  if(newEvent.image == ""){
  alert("Se necesita una URL para añadir una imagen")
  return
}


const payload = JSON.stringify(this.newEvent);
const url = "http://localhost:8080/api/events";
const r = await fetch(url,{
  method: "POST",
  body: payload,
  headers:{
    "Content-type": "application/json",
  }
});
const response = r;
if(response){
  alert("EVENTO AÑADIDO" + " " + newEvent.title);
  resetForm();
}else{
alert("Ha ocurrido un error. \nPor favor intente de nuevo en unos minutos");
}
location.reload();
}

function resetForm(){
  document.getElementById("addNewEvent").reset();
}

</script>
<template>
  <button
    type="button"
    class="add-event-button"
    data-bs-toggle="modal"
    data-bs-target="#staticBackdrop"
  >
    Add Event
  </button>

  <div
    class="modal fade"
    id="staticBackdrop"
    data-bs-backdrop="static"
    data-bs-keyboard="false"
    tabindex="-1"
    aria-labelledby="staticBackdropLabel"
    aria-hidden="true"
  >
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="staticBackdropLabel">ADD NEW EVENT</h5>
          <button
            type="button"
            class="btn-close"
            data-bs-dismiss="modal"
            aria-label="Close"
          ></button>
        </div>
        <div class="modal-body" id="formBody">

          <form class="row g-3" id="addNewEvent">
            <div class="col-md-12">
              <label for="inputTitle" class="form-label">Title</label>
              <input type="text" class="form-control" id="inputTitle" v-model="newEvent.title" />
            </div>

            <div class="col-12">
              <label for="inputDate" class="form-label">Date</label>
              <input type="date" class="form-control" id="inputDate" v-model="newEvent.date"/>
            </div>
            <div class="col-12">
              <label for="inputEntryMax" class="form-label">Max Entry</label>
              <input
                type="number"
                class="form-control"
                id="inputEntryMax"
                min="0"
                max="30"
                v-model="newEvent.max_users"
              />
            </div>
            <div class="col-md-12">

              <label for="inputDescription" class="form-label">Description</label>
              <input type="text" class="form-control" id="inputDescription" v-model="newEvent.description" />
            </div>
            <div class="col-md-12">
              <label for="inputImage" class="form-label">Image</label>
              <input type="text" class="form-control" id="inputImage" v-model="newEvent.image"/>
            </div>

            <div class="col-12 d-flex justify-content-center">
              <button type="button" class="btn btn-success" id="ADDbutton" @click="save()">
                ADD
              </button>
            </div>
            <div class="col-12 d-flex justify-content-center">
              <div class="">
                <button type="reset" class="btn btn-warning">RESET</button>
              </div>
              <div class="">
                <button
                  type="button"
                  class="btn btn-danger ms-2"
                  data-bs-dismiss="modal"
                >
                  CANCEL
                </button>
              </div>
            </div>
          </form>
        </div>
      </div>
    </div>
  </div>
</template>
<style scoped>
@import "../assets/css/styleForm.css";
@import "../assets/css/NavBarComponent.css";
</style>

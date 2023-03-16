<script setup></script>
<template>
  <button
    type="button"
    class="log-in-button"
    data-bs-toggle="modal"
    data-bs-target="#staticSignUp"
  >
    Sign Up
  </button>

  <div
    class="modal fade"
    id="staticSignUp"
    data-bs-backdrop="static"
    data-bs-keyboard="false"
    tabindex="-1"
    aria-labelledby="staticBackdropLabel"
    aria-hidden="true"
  >
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <h2 class="login-text">Sign Up</h2>
          <button
            type="button"
            class="btn-close"
            data-bs-dismiss="modal"
            aria-label="Close"
          ></button>
        </div>

        <div class="modal-body" id="formBody">
          <form>
            <!-- Email input -->
            <div class="form-outline mb-4">
              <input
                type="email"
                id="form2Example1"
                class="form-control"
                placeholder="Email Address"
              />
            </div>

            <!-- Password input -->
            <div class="form-outline mb-4">
              <input
                type="password"
                id="form2Example2"
                class="form-control"
                placeholder="Password"
              />
            </div>

            <!-- Submit button -->
            <div class="d-flex justify-content-center">
              <button
                type="button"
                id="button"
                class="btn btn-primary btn-block mb-4"
              >
                Sign up
              </button>
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

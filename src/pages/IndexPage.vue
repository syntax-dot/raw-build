<template>
  <q-page class="row items-center justify-evenly">
    <q-btn label="get device id" @click="onGetDeviceId" />
  </q-page>
</template>

<script setup lang="ts">
import DeviceId from 'app/plugins/get-device-id';

async function onGetDeviceId() {
  const {id} = await DeviceId.getId();
  console.warn('onGetDeviceId', id);
  alert(id)
}


// const todos = ref<Todo[]>([
//   {
//     id: 1,
//     content: 'ct1'
//   },
//   {
//     id: 2,
//     content: 'ct2'
//   },
//   {
//     id: 3,
//     content: 'ct3'
//   },
//   {
//     id: 4,
//     content: 'ct4'
//   },
//   {
//     id: 5,
//     content: 'ct5'
//   }
// ]);
// const meta = ref<Meta>({
//   totalCount: 1200
// });
</script>

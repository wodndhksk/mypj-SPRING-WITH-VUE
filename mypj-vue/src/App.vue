<template>
  <div id="app">
    <AppHeader></AppHeader>
    <AppBody></AppBody>
    <div>하위</div>
  </div>
</template>

<script>
import AppHeader from "@/components/common/AppHeader.vue";
import AppBody from "./components/common/AppBody.vue";
export default {
  // el: {},
  components: {
    AppHeader,
    AppBody,
  },
};
</script>

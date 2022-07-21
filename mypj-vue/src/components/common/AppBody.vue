<template>
  <div>
    <ul></ul>
  </div>
</template>

<script>
import axios from "axios";
import { getContentsList } from "@/api/index";

export default {
  data() {
    return {
      title: "",
      description: "",
    };
  },
  mounted() {
    this.getData();
  },
  methods: {
    async getContents() {
      const res = await getContentsList();
      console.log(res);
    },
    getData() {
      axios
        .get("/api/contents/find-by-title")
        .then(function (response) {
          console.log(response);
        })
        .catch(function (error) {
          console.log(error);
        });
    },
  },
};
</script>

<style></style>

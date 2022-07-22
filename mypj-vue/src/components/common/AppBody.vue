<template>
  <div class="container">
    <div class="row">
      <h1>데이터 : [ {{ contentItems }} ]</h1>
    </div>
    <div class="row">
      <ul>
        <li>제목</li>
        <li>내용</li>
        <li>이미지 URL</li>
      </ul>
    </div>
  </div>
</template>

<script>
import axios from "axios";
import { getContentsList } from "@/api/index";

export default {
  data() {
    return {
      contentItems: "",
    };
  },
  mounted() {
    // this.testString();
    // console.log("마운트", this.getData());
    // this.getContents();
    this.getData();
  },
  methods: {
    async getContents() {
      const list = await getContentsList();
      console.log("list", list);
    },
    getData() {
      axios
        .get("/api/contents/all")
        .then(function (response) {
          console.log("데이터", response.data);
          this.testString(response.data);
          // this.contentItems = "하이";
          //   console.log(this.contentItems[0]);
        })
        .catch(function (error) {
          console.log(error);
        });
    },

    testString(data) {
      // this.contentItems = data;
      console.log("testString", data);
    },
  },
};
</script>

<style></style>

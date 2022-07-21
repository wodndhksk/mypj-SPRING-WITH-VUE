import axios from "axios";

const instance = axios.create({
  baseURL: "http://localhost:8081/",
});

function getContentsList() {
  return instance.get("api/contents/find-by-title");
}

export { getContentsList };

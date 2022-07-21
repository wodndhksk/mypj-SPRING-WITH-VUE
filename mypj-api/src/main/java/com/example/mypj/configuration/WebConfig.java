package com.example.mypj.configuration;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
       registry.addMapping("/**")
               // * 로 모든 origin 허용
//               .allowedOrigins("*")
               .allowedOrigins("http://localhost:8080")
               .allowedMethods("GET", "POST")
               // 원하는 시간만큼 request를 cashing 함
               .maxAge(3000);
    }
}

package web.mvc.config;
import org.springframework.context.annotation.Configuration;
import 
org.springframework.web.servlet.config.annotation.CorsRegistry;
import 
org.springframework.web.servlet.config.annotation.EnableWebMvc;
import 
org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
* WebMvcConfigurer 를 이용해서 @CrossOrigin 글로벌 설정
* */
@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {
  @Override
  public void addCorsMappings(CorsRegistry registry) {
     registry.addMapping("/**")
    // .allowedOrigins("http://localhost:5173","http://localhost:4173")
     //.allowedOrigins("http://43.200.184.113:5173", "http://43.200.184.113:4173")
      .allowedOrigins("http://15.164.213.105", "http://15.164.213.105:80")
      .allowedOrigins("http://yourboard.kro.kr", "https://yourboard.kro.kr")
     .allowedMethods("OPTIONS","GET","POST","PUT","DELETE");
  }
}
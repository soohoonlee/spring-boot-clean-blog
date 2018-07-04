package me.ssoon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootCleanBlogApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootCleanBlogApplication.class, args);
  }

  @GetMapping
  public String hello() {
    return "Hello World!";
  }
}

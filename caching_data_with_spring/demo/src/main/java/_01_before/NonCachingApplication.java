package _01_before;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NonCachingApplication {

    public static void main(String[] args) {
        SpringApplication.run(NonCachingApplication.class, args);
    }

}

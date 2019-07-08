package tutorial.hotel;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class suntravelsApplication {
    public static void main(String[] args) {
        SpringApplication.run(suntravelsApplication.class, args);
    }
}

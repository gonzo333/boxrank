package pl.naapp.boxrank;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class BoxrankApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoxrankApplication.class, args);
    }

}

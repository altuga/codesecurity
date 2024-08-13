package jug.istanbul.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*@EnableJpaRepositories("com.eazybytes.repository")
@EntityScan("com.eazybytes.model")*/
public class BankBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankBackendApplication.class, args);
    }

}

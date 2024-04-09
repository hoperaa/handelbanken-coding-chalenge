package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(
        entityManagerFactoryRef = "ctrlEntityManagerFactory",
        transactionManagerRef = "ctrlTransactionManager")
@SpringBootApplication
public class HandelbankenCodingChalenge {
    public static void main(String[] args) {
        SpringApplication.run(HandelbankenCodingChalenge.class, args);
    }
}

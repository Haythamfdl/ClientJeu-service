package org.sid.clientservice;

import org.sid.clientservice.dao.ClientRepository;
import org.sid.clientservice.entities.Client;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ClientRepository clientRepository) {
        return args -> {
            clientRepository.save( new Client(null, "ab1","ab1@gmail.com","123"));
            clientRepository.save( new Client(null, "ab2","ab2@gmail.com","1234"));
        };
    }
}

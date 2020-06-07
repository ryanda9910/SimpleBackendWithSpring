package com.example.demo.payrolll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class
    );

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Employee("John Doe", "Staff IT Network")));
            log.info("Preloading " + repository.save(new Employee("Aldo Ryanda", "Associate Mobile Developer")));
            log.info("Preloading " + repository.save(new Employee("Ucup", "Ux Engineer")));
        };
    }
}

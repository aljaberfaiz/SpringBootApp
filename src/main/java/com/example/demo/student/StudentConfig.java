package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;
import java.util.List;


import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {

            Student cindy = new Student(
                    "cindy",
                    "cindy.sweens@gmail.com",
                    LocalDate.of(2000, JANUARY, 5)
            );

            Student alex = new Student(
                    "alex",
                    "alex.sweens@gmail.com",
                    LocalDate.of(2004  , JANUARY, 9)
            );

            repository.saveAll(
                    List.of(cindy, alex)
            );
        };
    }
}

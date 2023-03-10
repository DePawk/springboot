package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args-> {
            Student Bob =new Student(
                "Bob",
                "bob@gmail.com",
                LocalDate.of(2000, Month.APRIL,10)
        );
            Student Dor = new Student(
                    "Dor",
                    "Dor@gmail.com",
                    LocalDate.of(2000, Month.FEBRUARY,10)
            );
            repository.saveAll(
                    List.of(Bob, Dor)
            );
        };

    }
}

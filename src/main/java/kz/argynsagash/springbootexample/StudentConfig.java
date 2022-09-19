package kz.argynsagash.springbootexample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student argyn = new Student(
                    "Argyn",
                    "argyn.sagash@gmail.com",
                    LocalDate.of(1990, MARCH, 10)
            );
            Student mariam = new Student(
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(1995, APRIL, 13)
            );
            Student danil = new Student(
                    "Dariam",
                    "danil@gmail.com",
                    LocalDate.of(1988, MAY, 7)
            );

            studentRepository.saveAll(List.of(argyn, mariam,danil));


        };

    }
}

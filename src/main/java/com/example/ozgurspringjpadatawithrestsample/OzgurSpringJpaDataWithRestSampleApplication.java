package com.example.ozgurspringjpadatawithrestsample;

import com.example.ozgurspringjpadatawithrestsample.entity.Book;
import com.example.ozgurspringjpadatawithrestsample.repo.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OzgurSpringJpaDataWithRestSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(OzgurSpringJpaDataWithRestSampleApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(BookRepository repository) {
        return (args) -> {
            // save a few books
            repository.save(Book.builder().name("Book_1").build());
            repository.save(Book.builder().name("Book_2").build());
            repository.save(Book.builder().name("Book_3").build());
            repository.save(Book.builder().name("Book_4").build());
            repository.save(Book.builder().name("Book_5").build());
            repository.save(Book.builder().name("Book_6").build());
        };
    }
}

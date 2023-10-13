package com.example.coursedatah2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.coursedatah2.model.Book;
import com.example.coursedatah2.repo.IBookRepository;

@SpringBootApplication
public class CourseDataH2Application {

	public static void main(String[] args) {
		SpringApplication.run(CourseDataH2Application.class, args);
	}

	@Bean
	public CommandLineRunner run(IBookRepository repo) {
		return args -> {
			var book1 = new Book();
			repo.save(book1);
		};
	}
}

package com.example.coursejpa;

import java.util.stream.Collectors;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.metamodel.EntityType;

@SpringBootApplication
public class CourseJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseJpaApplication.class, args);
	}

	@Bean
	public RepositoryRestConfigurer repositoryRestConfigurer(EntityManager entityManager) {
		return RepositoryRestConfigurer.withConfig(config -> config.exposeIdsFor(
				entityManager.getMetamodel().getEntities().stream().map(EntityType::getJavaType)
						.collect(Collectors.toList()).toArray(Class[]::new)));
	}
}

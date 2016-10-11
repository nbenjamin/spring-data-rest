package com.nbenja.springboot.app;

import com.nbenja.springboot.domain.Customer;
import com.nbenja.springboot.repository.CustomerRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;
import java.util.List;
@EnableJpaRepositories(basePackages = "com.nbenja.springboot.repository")
@EntityScan("com.nbenja.springboot.*")
@SpringBootApplication
public class SpringDataRestApplication {

	private List<Customer> customers = Arrays.asList(
			new Customer("Ryan", "Adam"),
			new Customer("Tom", "Ross")
	);

	@Bean
	public CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
		return args -> {
			customers.forEach(c -> customerRepository.save(c));

			customerRepository.findAll().forEach(System.out:: print);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestApplication.class, args);
	}
}

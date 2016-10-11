package com.nbenja.springboot.repository;

import com.nbenja.springboot.app.SpringDataRestApplication;
import com.nbenja.springboot.domain.Customer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringDataRestApplication.class)
@EnableJpaRepositories(basePackages = "com.nbenja.springboot.repository")
@EntityScan("com.nbenja.springboot.*")
public class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void findByFirstName() throws Exception {
        Collection<Customer> acutal = customerRepository.findByFirstName("Ryan");
        assertThat(acutal, is(notNullValue()));
    }

    @Test
    public void findByLastName() throws Exception {
        Collection<Customer> acutal = customerRepository.findByFirstName("Adam");
        assertThat(acutal, is(notNullValue()));
    }

}
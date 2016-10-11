package com.nbenja.springboot.repository;


import com.nbenja.springboot.domain.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Collection<Customer> findByFirstName(@Param("firstName") String firstName);

    Collection<Customer> findByLastName(@Param("lastName") String firstName);
}

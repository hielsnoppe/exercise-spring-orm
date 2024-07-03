package de.nielshoppe.exercise_spring_orm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.nielshoppe.exercise_spring_orm.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
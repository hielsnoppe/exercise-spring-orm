package de.nielshoppe.exercise_spring_orm.controller;

import org.springframework.web.bind.annotation.RestController;

import de.nielshoppe.exercise_spring_orm.model.Customer;
import de.nielshoppe.exercise_spring_orm.model.Order;
import de.nielshoppe.exercise_spring_orm.repository.CustomerRepository;
import de.nielshoppe.exercise_spring_orm.repository.OrderRepository;
import de.nielshoppe.exercise_spring_orm.service.CustomerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    // POST localhost:8080/customers
    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    // POST localhost:8080/customers/{customerId}/orders
    @PostMapping("{customerId}/orders")
    public Order createOrder(@PathVariable Long customerId, @RequestBody Order order) {
        return customerService.createOrder(customerId, order);
    }

    // GET localhost:8080/customers
    @GetMapping
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }
}

package de.nielshoppe.exercise_spring_orm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.nielshoppe.exercise_spring_orm.model.Customer;
import de.nielshoppe.exercise_spring_orm.model.Order;
import de.nielshoppe.exercise_spring_orm.repository.CustomerRepository;
import de.nielshoppe.exercise_spring_orm.repository.OrderRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    
    @Autowired
    private OrderRepository orderRepository;

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Order createOrder(Long customerId, Order order) {
        Customer customer = customerRepository.findById(customerId).orElseThrow();
        order.setCustomer(customer);
        return orderRepository.save(order);
    }

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }
}

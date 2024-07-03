package de.nielshoppe.exercise_spring_orm.model;

import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @Column
    private String name;

    @OneToMany(mappedBy = "customer")
    private Set<Order> orders;

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    @JsonManagedReference
    public Set<Order> getOrders() {
        return orders;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addOrder(Order order) {
        order.setCustomer(this);
        this.orders.add(order);
    }
}

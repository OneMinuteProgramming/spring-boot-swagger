package com.live.code.spring_boot_swagger.controller;

import com.live.code.spring_boot_swagger.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class CustomerController {

    final private List<Customer> customers = List.of(
            Customer.builder().id("001").name("Live Code 1").email("abc1@gmail.com").build(),
            Customer.builder().id("002").name("Live Code 2").email("abc2@gmail.com").build()
    );

    @GetMapping("/customer/{id}")
    public ResponseEntity<Customer> getCustomerList(@PathVariable("id") String id) {
        List<Customer> customers = this.customers.stream().filter(customer -> customer.getId().equals(id)).toList();
        return ResponseEntity.ok(customers.get(0));
    }
}

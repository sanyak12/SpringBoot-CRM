package com.example.CRM.service;

import com.example.CRM.model.Customer;

import java.util.List;

public interface CustomerService {
    void saveCustomer(Customer customer);
    List<Customer> getAllCustomer();

    void deleteCustomerById(Integer id);

   Customer getCustomerById(Integer id);

   void updateCustomer(Customer customer);
}

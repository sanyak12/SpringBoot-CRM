package com.example.CRM.service;

import com.example.CRM.model.Customer;
import com.example.CRM.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public void deleteCustomerById(Integer id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer getCustomerById(Integer id) {
        Optional<Customer> opt= customerRepository.findById(id);
        if(opt.isEmpty()) {
            return null;
        }
        return opt.get();
    }

    // if data exists it will update otherwise will create new
    @Override
    public void updateCustomer(Customer customer) {
        customerRepository.save(customer);
    }


}

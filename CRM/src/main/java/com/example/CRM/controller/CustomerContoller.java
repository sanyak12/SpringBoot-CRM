package com.example.CRM.controller;
import org.springframework.ui.Model;

//import ch.qos.logback.core.model.Model;
import com.example.CRM.model.Customer;
import com.example.CRM.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerContoller {

    @Autowired
    private CustomerService customerService;

    //http:localhost:8080/customer/show
    @GetMapping("/show")
    public String show(){
        return "CustomerRegister";
    }
    @PostMapping("/register")
    public String saveCustomer(@ModelAttribute Customer customer){
        customerService.saveCustomer(customer);
        return "redirect:all";
    }
    @GetMapping("/all")
    public String showCustomer(Model model){
        List<Customer> list = customerService.getAllCustomer();
        model.addAttribute("list",list);
        return "CustomerData";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam Integer id){
        customerService.deleteCustomerById(id);
        return "redirect:all";
    }
    @GetMapping("/edit")
    public String editCustomer(@RequestParam Integer id,Model model){
        Customer customer=customerService.getCustomerById(id);
        model.addAttribute("customer",customer);
            return "CustomerUpdate";
    }
    @PostMapping("/update")
    public String updateCustomer(@ModelAttribute Customer customer){
        customerService.updateCustomer(customer);
        return "redirect:all";
    }
}


















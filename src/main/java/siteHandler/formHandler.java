package siteHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import java.sql.Connection;

@Controller
public class formHandler {

    private final CustomerService customerService;

    @Autowired
    public formHandler(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/main") // Allows you to map HTTP requests to specific controller methods
    public String customerForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "main";
    }

    @PostMapping("/main")
    public String customerSubmit(@ModelAttribute Customer customer, Model model) {
        customerService.createCustomer(customer);
        model.addAttribute("customers", customerService.getAllCustomers());
        return "customers";
    }
}

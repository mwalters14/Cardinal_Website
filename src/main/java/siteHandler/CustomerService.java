package siteHandler;

import java.util.List;

public interface CustomerService {
    Customer createCustomer(Customer customer);
    Customer getCustomer(Long id);
    Customer editCustomer(Customer customer);
    void deleteCustomer(Customer customer);
    void deleteCustomer(Long id);
    List<Customer> getAllCustomers(int pageNumber, int pageSize);
    List<Customer> getAllCustomers();
}

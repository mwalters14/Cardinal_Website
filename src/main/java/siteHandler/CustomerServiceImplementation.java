package siteHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImplementation implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomer(Long id) {
        Optional<Customer> customer = this.customerRepository.findById(id);
        if (customer.isPresent()) {
            return customer.get();
        } else {
            return null;
        }
    }

    @Override
    public Customer editCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        customerRepository.delete(customer);
    }

    @Override
    public void deleteCustomer(Long id) {
        Optional<Customer> customer = this.customerRepository.findById(id);
        if (customer.isPresent()) {
            customerRepository.delete(customer.get());
        }
    }

    @Override
    @Deprecated
    public List<Customer> getAllCustomers(int pageNumber, int pageSize) {
        return customerRepository.findAll(new PageRequest(pageNumber, pageSize)).getContent();
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}

package ml.service;

import ml.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl() {
	}

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Autowired 
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public int getFibonacciElementVal() {
		return fibonacci(customerRepository.getFibonacciElementIndex());
	}
	
	public void setFibonacciElementIndex(int index) {
		customerRepository.setFibonacciElementIndex(index);
	}
	
	private int fibonacci(int index) {
		if(index==0)
			return 0;
		if(index==1 || index==2)
			return 1;
		return fibonacci(index-1) + fibonacci(index-2);		
	}
}

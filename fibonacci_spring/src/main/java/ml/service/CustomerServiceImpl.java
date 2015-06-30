package ml.service;

import ml.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	
	@Autowired 
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public int findFibonacciElementVal(int index) {
		return customerRepository.findFibonacciElementVal(index);
	}
	
	public void saveFibonacciElementIndex(int index) {
		if(customerRepository.saveFibonacciElementIndex(index)) {
			customerRepository.saveFibonacciElementVal(fibonacci(index));			
		}
	}
	
	private int fibonacci(int index) {
		if(index==0)
			return 0;
		if(index==1 || index==2)
			return 1;
		return fibonacci(index-1) + fibonacci(index-2);		
	}
}

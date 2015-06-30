package ml.repository;

import java.util.ArrayList;
import java.util.List;

import ml.model.Customer;

import org.springframework.stereotype.Repository;

@Repository("customerRepository")
public class CustomerRepositoryImpl implements CustomerRepository {
	
	private List<Customer> mCustomers = new ArrayList<Customer>();

	public boolean saveFibonacciElementIndex(int index) {
		if(!ifAlreadyExists(index)) {
			mCustomers.add(new Customer(index));
			return true;
		}
		return false;
	}
	
	private boolean ifAlreadyExists(int index) {
		for(Customer customer : mCustomers) {
			if(customer.getIndex() == index) {
				return true;
			}
		}
		return false;
	}

	public void saveFibonacciElementVal(int val) {
		mCustomers.get(mCustomers.size()-1).setValue(val);
	}

	public int findFibonacciElementVal(int index) {
		for(Customer customer : mCustomers) {
			if(customer.getIndex() == index)
				return customer.getValue();
		}
		return 0;
	}
}

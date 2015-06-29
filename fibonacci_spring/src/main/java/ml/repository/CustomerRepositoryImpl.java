package ml.repository;

import ml.model.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("customerRepository")
public class CustomerRepositoryImpl implements CustomerRepository {
	
	private Customer mCustomer;
	
	@Autowired 
	public void setCustomer(Customer customer) {
		this.mCustomer = customer;
	}

	public void setFibonacciElementIndex(int index) {
		mCustomer.setIndex(index);
	}

	public int getFibonacciElementIndex() {
		return mCustomer.getIndex();
	}
}

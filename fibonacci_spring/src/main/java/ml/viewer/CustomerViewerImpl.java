package ml.viewer;

import java.util.Scanner;

import ml.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("customerViewer")
public class CustomerViewerImpl implements  CustomerViewer {
	
	CustomerService customerService;
	
	@Autowired 
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	public void setData() {
		System.out.print("Enter fibonacci element number for evaluation: ");
		Scanner input = new Scanner(System.in);
		customerService.setFibonacciElementIndex(input.nextInt());
//		input.close(); // closing scanner closes Sytem.in stream
		//TODO Extend BufferedInputStream and override close() so that closing scanner doesn't close in stream.
	}

	public void prtData() {
		System.out.println(customerService.getFibonacciElementVal());
	}
}

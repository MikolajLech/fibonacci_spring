package ml.viewer;

import java.util.Scanner;

import ml.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("customerViewer")
public class CustomerViewerImpl implements  CustomerViewer {
	
	CustomerService customerService;
	private int lastChoice;
	
	@Autowired 
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	public void setData() {
		System.out.print("Enter fibonacci element number for evaluation: ");
		Scanner input = new Scanner(System.in);
		lastChoice = input.nextInt();
		customerService.saveFibonacciElementIndex(lastChoice);
//		input.close(); // closing scanner closes Sytem.in stream
		//TODO Extend BufferedInputStream and override close() so that closing scanner doesn't close in stream.
	}

	public void prtData() {
		System.out.println(customerService.findFibonacciElementVal(lastChoice));
	}
}

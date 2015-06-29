package ml.model;

import org.springframework.stereotype.Component;

@Component("customer")
public class Customer {
	private int mIndex;
	
	public void setIndex(int index) {
		this.mIndex = index;
	}
	
	public int getIndex() {
		return mIndex;
	}
}

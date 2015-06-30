package ml.model;


public class Customer {
	private int mIndex;
	private int mValue;
	
	public Customer() {
		
	}
	
	public Customer(int index) {
		mIndex = index;
	}
	
	public int getIndex() {
		return mIndex;
	}

	public int getValue() {
		return mValue;
	}

	public void setIndex(int index) {
		this.mIndex = index;
	}
	
	public void setValue(int mValue) {
		this.mValue = mValue;
	}
}

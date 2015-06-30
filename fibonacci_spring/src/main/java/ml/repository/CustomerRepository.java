package ml.repository;

public interface CustomerRepository {
	public abstract boolean saveFibonacciElementIndex(int index);
	public abstract void saveFibonacciElementVal(int index);
	public abstract int findFibonacciElementVal(int index);
}
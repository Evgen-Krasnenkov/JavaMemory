package SoftLeaks;

import java.util.concurrent.atomic.AtomicInteger;

public class Customer {

	private AtomicInteger id;
	private String name;
	
	public void setId(AtomicInteger id) {
		this.id = id;
	}
	
	public String toString() {
		return id + " : " + name;
	}
	
	public Customer(String name) {
		super();
		this.name = name;
	}

	
}


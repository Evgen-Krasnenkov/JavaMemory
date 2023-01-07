package SoftLeaks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class CustomerManager {

	private List<Customer> customers = Collections.synchronizedList(new ArrayList<Customer>());
	private AtomicInteger nextId = new AtomicInteger(0);

	public  void addCustomer(Customer customer) {
			customer.setId(nextId);
			nextId.incrementAndGet();
		customers.add(customer);
	}
	
	public Customer getNextCustomer() {
		//should do:
		//customers.remove(0);
		Customer result = null;
			if (customers.size() > 0) {
				result = customers.get(0);
			}
		return result;
	}

	public void howManyCustomers() {
		int size = 0;
		size = customers.size();
		System.out.println("# Customers in the list: " + new Date() + " : " + size);
	}
	public void howManyCustomersGenerated(){
		System.out.println("# Customers Generated: " + new Date() + " : " + this.nextId);
	}

	public void displayCustomers() {
		synchronized(customers){
			for (Customer c : customers) {
				System.out.println(c.toString());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}



}

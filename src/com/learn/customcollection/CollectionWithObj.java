package com.learn.customcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionWithObj {

	public static void main(String args[]) {
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer("Ram", 56));
		customers.add(new Customer("Shyam", 1));
		customers.add(new Customer("Vijay", 9));
		customers.add(new Customer("Sonu", 88));
		customers.add(new Customer("Monu", 55));
		customers.add(new Customer("Kalu", 57));
		customers.add(new Customer("Vinay", 89));
		customers.add(new Customer("Shiva", 25));
		customers.add(new Customer("Rajendra", 4));
		customers.add(new Customer("Ramesh", 98));
		customers.add(new Customer("Suresh", 22));
		System.err.println(customers);
		Collections.sort(customers,(i1,i2)->{return (i1.getEno()<i2.getEno()?-1:i1.getEno()>i2.getEno()?1:0);});
		System.err.println(customers);
		Collections.sort(customers,(i1,i2)->{return i1.getName().compareTo(i2.getName()); });
		System.err.println(customers);
	}
}

class Customer{
	String name;
	Integer eno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	@Override
	public String toString() {
		return "name=" + name + ": eno=" + eno;
	}
	public Customer(String name, Integer eno) {
		super();
		this.name = name;
		this.eno = eno;
	}
	
	
}

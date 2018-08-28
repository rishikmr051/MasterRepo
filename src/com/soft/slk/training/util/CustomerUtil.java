package com.soft.slk.training.util;

import java.util.List;
import com.google.common.collect.Lists;
import com.soft.slk.training.model.Customer;

public class CustomerUtil {
	private static List<Customer> customers = Lists.newArrayList();
	
	public static List<Customer> getAllCustomers() {
		return customers;
	}
	
	public static void addCustomer(Customer customer) {
		customers.add(customer);
	}
	
	public static void removeCustomer(Customer customer) {
		customers.remove(customer);
	}
	
}

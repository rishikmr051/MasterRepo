package com.soft.slk.training;

import com.soft.slk.training.model.Customer;
import com.soft.slk.training.model.OrganizationCustomer;
import com.soft.slk.training.model.PersonCustomer;
import com.soft.slk.training.util.CustomerUtil;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello !!!");
		
		
		for(Customer customer : CustomerUtil.getAllCustomers()) {
			System.out.println(customer.toString());
		}
		
		PersonCustomer pc = new PersonCustomer();
		pc.setFirstName("Rishi");
		pc.setLastName("Kumar");
		
		OrganizationCustomer oc = new OrganizationCustomer();
		oc.setOrgName("SLK");
		
		CustomerUtil.addCustomer(pc);
		for(Customer customer : CustomerUtil.getAllCustomers()) {
			System.out.println(customer.toString());
		}
		
		CustomerUtil.addCustomer(oc);
		for(Customer customer : CustomerUtil.getAllCustomers()) {
			System.out.println(customer.toString());
		}
		
		CustomerUtil.removeCustomer(oc);
		for(Customer customer : CustomerUtil.getAllCustomers()) {
			System.out.println(customer.toString());
		}
		
	}

}

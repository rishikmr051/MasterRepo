package com.soft.slk.training.design.patterns;

public class FactoryExample {
	
	public static Computer getComputer(String type, String ram, String hdd, String cpu){
		
		if("PC".equalsIgnoreCase(type)) {
			return new PC(ram, hdd, cpu);
		} else if("Server".equalsIgnoreCase(type)) {
			return new Server(ram, hdd, cpu);
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		Computer pc = FactoryExample.getComputer("pc","2 GB","500 GB","2.4 GHz");
		Computer server = FactoryExample.getComputer("server","16 GB","1 TB","2.9 GHz");
		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);
	}
	
}

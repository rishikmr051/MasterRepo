package com.soft.slk.training.design.patterns;

public class SingletonExample {
//	private static final SingletonExample onlyInstance = new SingletonExample();
	private static SingletonExample onlyInstance;
	
	private SingletonExample() {
		
	}
	
//	static {
//		try {
//			onlyInstance = new SingletonExample();
//		} catch (Exception e) {
//			System.out.println("Exception " + e.getMessage());
//		}
//	}
	
//	synchronized 
	
	public static SingletonExample getInstance() {
		if(onlyInstance == null){
			onlyInstance = new SingletonExample();
        }

		return onlyInstance;
	}
			
}

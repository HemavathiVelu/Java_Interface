package com.vsquare.shopping.impl_ordering;

import com.vsquare.shopping.interfacesample.Order;

public class MobileTools implements Order {
	
	private static MobileTools mobiletools=new MobileTools();
	
	
	public static MobileTools getMobiletools() {
		return mobiletools;
	}




	public static void setMobiletools(MobileTools mobiletools) {
		MobileTools.mobiletools = mobiletools;
	}




	private MobileTools() {
		
	}
		

	
	
	@Override
	  public void ordering() {
		System.out.println("I want to buy a bluetooth Headphone");
	}

}

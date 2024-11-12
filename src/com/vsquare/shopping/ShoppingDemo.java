package com.vsquare.shopping;
import com.vsquare.shopping.entity.*;
import com.vsquare.shopping.impl_ordering.ComputerTools;
import com.vsquare.shopping.impl_ordering.MobileTools;
import com.vsquare.shopping.interfacesample.*;

public class ShoppingDemo {
	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.setCid(25);
		c1.setCname("Hema");
		c1.setCity("Cuddalore");
		c1.setProduct("Computer  Tools");
		
		Order order;
		
		String choice=c1.getProduct();
		
		if(choice.equals("mobiletools")) {
			order=ComputerTools.getComputertools();
			//order=MobileTools.getMobiletools();
		}
		else {
			//order=ComputerTools.getComputertools();
			order=MobileTools.getMobiletools();
		
	}
		order.ordering();
	}

}

package com.vsquare.shopping.impl_ordering;

import com.vsquare.shopping.interfacesample.*;

public class ComputerTools implements Order{
	
	private static ComputerTools computertools=new ComputerTools();
	
	
	public static ComputerTools getComputertools() {
		return computertools;
	}

	public static void setComputertools(ComputerTools computertools) {
		ComputerTools.computertools = computertools;
	}

	private ComputerTools() {
		
	}
	
	@Override
	public void ordering() {
		System.out.println("I want to buy a hard disk and 8GB RAM");
	}

}

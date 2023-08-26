package com.tnsif.programs.demo.prg;

import java.util.Scanner;

class Test {
	
	private String carname;
	private int price;
	private String carmodel; 
	
	public void check() {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter your car name: ");
		carname = ob.nextLine();
		System.out.println("Enter your car model: ");
		carmodel = ob.nextLine();
		System.out.println("Enter your car price: ");
		price = ob.nextInt();
		System.out.println(carname);
		System.out.println(carmodel);
		System.out.println(price);
	}
}

public class encapsulation {
	public static void main(String[] args) {
		Test p = new Test();
		p.check();
	}
}

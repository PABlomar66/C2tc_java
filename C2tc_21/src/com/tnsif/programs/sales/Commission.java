package com.tnsif.programs.sales;



public class Commission {
	String name,address;
	int phone,sales_amount;
		
	void getDetails(String name,String address,int phone , int sales_amount) {		
		this.name=name;
		this.address=address;
		this.phone=phone;
		this.sales_amount=sales_amount;
	}
	void calculate() {
		
	}
	
	
	
	//Setters and Getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getSales_amount() {
		return sales_amount;
	}
	public void setSales_amount(int sales_amount) {
		this.sales_amount = sales_amount;
	}



	@Override
	public String toString() {
		return "Commission [name=" + name + ", address=" + address + ", phone=" + phone + ", sales_amount="
				+ sales_amount + "]";
	}
	
	

}
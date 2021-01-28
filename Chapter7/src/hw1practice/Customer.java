package hw1practice;

public class Customer {

	private int customerID;
	private String customerName;
	
	int bonusPoint;
	
	protected String customerLevel;
	
	public Customer()
	{
		;
	}
	public Customer(int customerID, String customerName)
	{
		this.customerID=customerID;
		this.customerName=customerName;
		customerLevel="SILVER";
	}
	
	public int calcPrice(int price)
	{
		bonusPoint+=price*0.01;
		return price;
		
	}
	public void showCustomerInfo()
	{
		System.out.println(customerName+"님의 등급은 "+ customerLevel+"이며, 적립된 보너스 포인트는 "+ bonusPoint+"점 입니다.");
	}
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	
}

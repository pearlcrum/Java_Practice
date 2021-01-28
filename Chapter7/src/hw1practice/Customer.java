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
		System.out.println(customerName+"���� ����� "+ customerLevel+"�̸�, ������ ���ʽ� ����Ʈ�� "+ bonusPoint+"�� �Դϴ�.");
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

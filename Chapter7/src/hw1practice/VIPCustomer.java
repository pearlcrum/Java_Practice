package hw1practice;

public class VIPCustomer extends Customer {

	private int call;
	public VIPCustomer(int customerID, String customerName,int call)
	{
		customerLevel="VIP";
		this.call=call;
	}
	public int calcPrice(int price)
	{
		bonusPoint+=price*0.05;
		int total;
		total=(int)(price*0.9);
		return total;
	}
	public void showCustomerInfo()
	{
		super.showCustomerInfo();
		System.out.println("담당 상담원 번호는"+ call+"입니다.");
	}
}

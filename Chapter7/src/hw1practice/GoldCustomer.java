package hw1practice;

public class GoldCustomer extends Customer{

	public GoldCustomer(int customerID, String customerName)
	{
		customerLevel="GOLD";
	}
	
	public int calcPrice(int price)
	{
		bonusPoint+=price*0.02;
		int total;
		total=(int)(price*0.9);
		return total;
	}
}

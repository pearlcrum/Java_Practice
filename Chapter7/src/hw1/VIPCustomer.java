package hw1;


public class VIPCustomer extends Customer{
	

	double salesRatio;
	private int agentID;

	/*public VIPCustomor()
	{
		//super(); // ���� Ŭ������ �޸� ��ġ
		customerGrade="VIP";
		bonusRatio =0.05;
		salesRatio=0.1;
		System.out.println("VIPCustomor() ������ ȣ��");

	}*/
	public VIPCustomer(int customerID, String customerName,int agentID) {
		super(customerID, customerName);
		
		customerGrade="VIP";
		bonusRatio =0.05;
		salesRatio=0.1;
		this.agentID=agentID;
		//System.out.println("VIPCustomor(int, String) ������ ȣ��");
	}

	@Override
	public int calcPrice(int price) {
		
		bonusPoint += price * bonusRatio;
		return price -(int)(price*salesRatio);
	}
	public String showCustomerInfo()
	{
		return super.showCustomerInfo() +"��� ���� ��ȣ�� "+ agentID +"�Դϴ�.";

	}
	public int getAgentID()
	{
		return agentID;
	}
	
}
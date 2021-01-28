package polymorphism;

public class VIPCustomor extends Customer{
	

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
	public VIPCustomor(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade="VIP";
		bonusRatio =0.05;
		salesRatio=0.1;
		System.out.println("VIPCustomor(int, String) ������ ȣ��");
	}

	@Override
	public int calcPrice(int price) {
		
		bonusPoint += price * bonusRatio;
		return price -(int)(price*salesRatio);
	}
	
	
	
}

package hw;

public class shop {

	public String shopNum;
	public String shopID;
	public String date;
	public String name;
	public String orderNum;
	public String address;
	
	public void showShopInfo()
	{
		System.out.println("�ֹ���ȣ: "+shopNum);
		System.out.println("�ֹ��� ���̵�: "+shopID);
		System.out.println("�ֹ� ��¥: "+date);

		System.out.println("�ֹ��� �̸�: "+name);
		System.out.println("�ֹ� ��ǰ ��ȣ: "+orderNum);
		System.out.println("��� �ּ�: "+address);
	}
}

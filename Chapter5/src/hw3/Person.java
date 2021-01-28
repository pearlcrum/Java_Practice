package hw3;

public class Person {
	private String name;
	private int personMoney;
	
	public Person(String name,int personMoney)
	{
		this.name=name;
		this.personMoney=personMoney;
	}

	public void buyCoffee(Cafe cafeName, int price)
	{
		System.out.print(name+"���� "+price+"���� ");
		if(cafeName.getCafeName()=="starCoffee")
		{
			System.out.print("�� �ٹ�");
			if(price==4000)
			{
				System.out.println("�Ƹ޸�ī��� �����߽��ϴ�.");
				this.personMoney-=Menu.STARMERICANO;
				cafeName.setCafeMoney(Menu.STARMERICANO);
				cafeName.setUserNum();
			}
			else
			{

				System.out.println("�󶼸� �����߽��ϴ�.");
				this.personMoney-=Menu.STARLATTE;
				cafeName.setCafeMoney(Menu.STARLATTE);
				cafeName.setUserNum();

			}
		}
		else
		{
			System.out.print("�� �ٹ�");
			if(price==4100)
			{
				System.out.println("�Ƹ޸�ī��� �����߽��ϴ�.");
				this.personMoney-=Menu.BEANARMERICANO;
				cafeName.setCafeMoney(Menu.BEANARMERICANO);
				cafeName.setUserNum();

			}
			else
			{

				System.out.println("�󶼸� �����߽��ϴ�.");
				this.personMoney-=Menu.BEANLATTE;
				cafeName.setCafeMoney(Menu.BEANLATTE);
				cafeName.setUserNum();

			}
		}
	}
	public void showPersonInfo()
	{
		System.out.println(name+"���� �� �ڻ���"+personMoney+"�� �Դϴ�.");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPersonMoney() {
		return personMoney;
	}

	public void setPersonMoney(int personMoney) {
		this.personMoney = personMoney;
	}
	
	
}

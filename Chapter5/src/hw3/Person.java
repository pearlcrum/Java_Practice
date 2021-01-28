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
		System.out.print(name+"님이 "+price+"으로 ");
		if(cafeName.getCafeName()=="starCoffee")
		{
			System.out.print("별 다방");
			if(price==4000)
			{
				System.out.println("아메리카노는 구입했습니다.");
				this.personMoney-=Menu.STARMERICANO;
				cafeName.setCafeMoney(Menu.STARMERICANO);
				cafeName.setUserNum();
			}
			else
			{

				System.out.println("라떼를 구입했습니다.");
				this.personMoney-=Menu.STARLATTE;
				cafeName.setCafeMoney(Menu.STARLATTE);
				cafeName.setUserNum();

			}
		}
		else
		{
			System.out.print("콩 다방");
			if(price==4100)
			{
				System.out.println("아메리카노는 구입했습니다.");
				this.personMoney-=Menu.BEANARMERICANO;
				cafeName.setCafeMoney(Menu.BEANARMERICANO);
				cafeName.setUserNum();

			}
			else
			{

				System.out.println("라떼를 구입했습니다.");
				this.personMoney-=Menu.BEANLATTE;
				cafeName.setCafeMoney(Menu.BEANLATTE);
				cafeName.setUserNum();

			}
		}
	}
	public void showPersonInfo()
	{
		System.out.println(name+"씨의 총 자산은"+personMoney+"원 입니다.");
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

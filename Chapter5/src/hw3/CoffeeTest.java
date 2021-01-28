package hw3;

public class CoffeeTest {

	public static void main(String[] args) {

		Person kim=new Person("Kim",10000);
		Person lee= new Person("Lee",10000);
		Cafe starCoffee= new Cafe("starCoffee");
		Cafe beanCoffee= new Cafe("beanCoffee");
		
		kim.buyCoffee(starCoffee,Menu.STARMERICANO);
		lee.buyCoffee(beanCoffee,Menu.BEANLATTE);
		
		kim.buyCoffee(beanCoffee,Menu.BEANLATTE);
		lee.buyCoffee(starCoffee,Menu.STARMERICANO);
		
		
		kim.showPersonInfo();
		lee.showPersonInfo();
		
		starCoffee.showCafeInfo();
		beanCoffee.showCafeInfo();
	}

}

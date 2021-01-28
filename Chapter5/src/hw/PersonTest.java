package hw;

public class PersonTest {

	public static void main(String[] args) {
		
		PersonInfo man=new PersonInfo();
		man.personAge=40;
		man.personName="James";
		man.married=true;
		man.children=3;
		
		man.showPersonInfo();
	}

}

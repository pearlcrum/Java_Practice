package hw;

public class PersonInfo {

	public int personAge;
	public String personName;
	public boolean married;
	public int children;
	
	public void showPersonInfo()
	{
		System.out.println(personAge+"살이며 이름은 "+personName+"이다. 결혼 여부는 "+married+"이며 자녀 수는"+children+"명 이다.");
	}
}

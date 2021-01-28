package hw2;

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate d=new MyDate(21,5,2012);
		if(d.isVaild()==true)
		{
			d.showDate();
		}
		else
		{
			System.out.println("Æ²¸²");
		}
		
	}

}

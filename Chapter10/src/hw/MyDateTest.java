package hw;
class MyDate
{
	public final static int ERROR =-999999;
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}

	@Override
	public int hashCode() {
		
		return this.day+this.month+this.year;
	}

	@Override
	public boolean equals(Object obj) {
		MyDate a=(MyDate)obj;
		if (this.day==a.day && this.month ==a.month && this.year==a.year)
		{
			return true;
		}
		else
			return false;
			
	}
	
	
}

public class MyDateTest {

	public static void main(String[] args)
	{
		MyDate date1 = new MyDate(10,12,2012);
		MyDate date2 = new MyDate(10,12,2012);
		
		System.out.println(date1.equals(date2));
	}
}

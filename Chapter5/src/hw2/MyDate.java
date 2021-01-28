package hw2;

public class MyDate {

	private int day;
	private int month;
	private int year;
	
	private boolean isVaild=true; 
	
	
	public MyDate(int day, int month, int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public boolean isVaild()
	{
		if(month<1||month>12)
		{
			isVaild=false;
		}
		else if(day<1&&day>31)
		{
			isVaild=false;
		}
		else if(year<1)
		{
			isVaild=false;
		}
		else
		{
			isVaild=true;
		}
		return isVaild;
		
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
	
			this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setDay(int day)
	{
		this.day=day;
	}
	public int getDay()
	{
		return day;
	}
	public void showDate()
	{
		if(isVaild) {
		System.out.println(this.year+"년 "+ this.month +"월 " + this.day+"일 입니다.");
		}
		else
		{
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}
}


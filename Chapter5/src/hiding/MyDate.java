package hiding;

public class MyDate {

	private int day;
	private int month;
	private int year;
	
	private boolean isVaild=true; 
	 
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month<1||month>12)
		{
			isVaild=false;
		}
		else
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
		System.out.println(year+"�� "+ month +"�� " + day+"�� �Դϴ�.");
		}
		else
		{
			System.out.println("��ȿ���� ���� ��¥�Դϴ�.");
		}
	}
}

package cooperation;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber)
	{
		this.lineNumber=lineNumber;
	}
	public void take(int money)
	{
		this.money+=money;
		passengerCount++;
	}
	public void showSubwayInfo()
	{
		System.out.println(lineNumber +" "+ passengerCount +" "+ money);
	}
}

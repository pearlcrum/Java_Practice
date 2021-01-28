package hw3;

public class Cafe {

	
	private String cafeName;
	private int cafeMoney;
	private int userNum;
	public Cafe(String cafeName)
	{
		this.cafeName=cafeName;
	}
	public Cafe(String cafeName, int cafeMoney)
	{
		this.cafeName=cafeName;
		this.cafeMoney=cafeMoney;
		this.userNum++;
	}
	
	public void showCafeInfo()
	{
		System.out.println(cafeName+"의 총 자산은 "+cafeMoney+"이며 이용자 수는"+userNum+"입니다.");
	}
	
	public String getCafeName() {
		return cafeName;
	}
	public void setCafeName(String cafeName) {
		this.cafeName = cafeName;
	}
	public int getCafeMoney() {
		return cafeMoney;
	}
	public void setCafeMoney(int cafeMoney) {
		this.cafeMoney += cafeMoney;
	}
	public int getUserNum() {
		return userNum;
	}
	public void setUserNum() {
		this.userNum++;
	}
	
}

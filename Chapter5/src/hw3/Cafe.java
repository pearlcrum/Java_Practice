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
		System.out.println(cafeName+"�� �� �ڻ��� "+cafeMoney+"�̸� �̿��� ����"+userNum+"�Դϴ�.");
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

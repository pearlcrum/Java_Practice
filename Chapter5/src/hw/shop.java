package hw;

public class shop {

	public String shopNum;
	public String shopID;
	public String date;
	public String name;
	public String orderNum;
	public String address;
	
	public void showShopInfo()
	{
		System.out.println("주문번호: "+shopNum);
		System.out.println("주문자 아이디: "+shopID);
		System.out.println("주문 날짜: "+date);

		System.out.println("주문자 이름: "+name);
		System.out.println("주문 상품 번호: "+orderNum);
		System.out.println("배송 주소: "+address);
	}
}

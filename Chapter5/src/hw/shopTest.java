package hw;

public class shopTest {

	public static void main(String[] args) {

			shop order= new shop();
			order.shopNum="201907210001";
			order.shopID="abc123";
			order.date="2019년 7월 21일";
			order.name="홍길순";
			order.orderNum="PD0345-12";
			order.address="서울시 영등포구 여의도동 20번지";
			
			order.showShopInfo();
	}

}

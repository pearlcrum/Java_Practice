package hw1;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		Customer VIPCustomer= new VIPCustomer(1,"LEE",1000);
		Customer GOLDCustomer1= new GoldCustomer(2,"KIM");
		Customer GOLDCustomer2= new GoldCustomer(3,"Chang");
		Customer SILVERCustomer1= new Customer(4,"You");
		Customer SILVERCustomer2= new Customer(5,"Park");
		
		ArrayList<Customer> list = new ArrayList<Customer>();
		list.add(VIPCustomer);
		list.add(GOLDCustomer1);
		list.add(GOLDCustomer2);
		list.add(SILVERCustomer1);
		list.add(SILVERCustomer2);
		
		for(Customer a : list)
		{
			int price=a.calcPrice(10000);
			System.out.println(a.showCustomerInfo());
			System.out.println("지불한 금액은"+ price +"원 입니다.");
			System.out.println("============================");

		}
		
	}

}

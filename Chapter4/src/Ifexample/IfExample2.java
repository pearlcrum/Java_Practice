package Ifexample;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		int age= scanner.nextInt();
		int charge =0;
		
		if(age<8)
		{
			charge=1000;
		}
		else if( age<14)
		{
			charge=1200;
		}
		else
		{
			charge=2000;
		}
		System.out.println(charge);
		
	}

}

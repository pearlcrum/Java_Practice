package Ifexample;

import java.util.Scanner;

public class dayCalander {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		int day=0;
		int month=scanner.nextInt();
		
		switch(month)
		{
			case 1,3,5,7,8,10,12: day=31;
				break;
			case 4,6,9,11: day=30;
				break;
			case 2: day=28;
				break;
		}
		
		System.out.println("해당되는"+month+"월의 일수는 "+day+"일 입니다.");
		
		
		
	
	}

}

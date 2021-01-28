package Ifexample;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int rank = scanner.nextInt();
		char medalColor;
		
		switch(rank)
		{
			case 1: medalColor='G';
				break;
			case 2: medalColor='S';
				break;
			default: medalColor='A';
			
		}
		
	}

}

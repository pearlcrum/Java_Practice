package Ifexample;

import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		int score;
		score=scanner.nextInt();
		
		if(score<60)
		{
			System.out.println("F �����Դϴ�.");
		}
		else if(score<70)
		{
			System.out.println("D �����Դϴ�.");
		}
		else if(score<80)
		{
			System.out.println("C �����Դϴ�.");
		}
		else if(score <90)
		{
			System.out.println("B �����Դϴ�.");
		}
		else
		{
			System.out.println("A �����Դϴ�.");
		}
		
		
	}

}

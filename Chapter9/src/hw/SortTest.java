package hw;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {

		System.out.println("정렬방식을 선택하세요.");
		System.out.println("B: bubbleSort");
		System.out.println("H: HeapSort");
		System.out.println("Q: QuickSort");
		int ch;
		ch =System.in.read();
		Sort sort=null;
		if(ch=='B'||ch=='b')
		{
			sort=new BubbleSort();
		}
		else if(ch=='H'||ch=='h')
		{
			sort=new HeapSort();

		}
		else if(ch=='Q'||ch=='q')
		{
			sort=new QuickSort();

		}
		else
		{
			System.out.println("Wrong input");
		}
		sort.ascending();
		sort.desending();
		Sort.description();
		
	}

}

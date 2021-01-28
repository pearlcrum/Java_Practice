package array;

public class CharArrayTest {

	public static void main(String[] args) {
		
		char[] arr= new char[26];
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=(char)(i+65);
		}
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}

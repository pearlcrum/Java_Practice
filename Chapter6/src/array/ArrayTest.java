package array;

public class ArrayTest {

	public static void main(String[] args) {

		/*nt[] arr= new int[10];
		int total=0;
		for(int i=0,num=1; i< arr.length; i++,num++)
		{
			arr[i]=num;
		}
		for(int i=0,num=1; i< arr.length; i++,num++)
		{
			total +=arr[i];
			System.out.println(total);
		}
		 */
		double[] dArr= new double[5];
		int count=0;
		dArr[0]=5.1; count ++;
		dArr[1]=1.1; count ++;
		dArr[2]=2.1; count ++;
		dArr[3]=3.1;
		dArr[4]=4.1;
		
		int mtotal=1;
		for(int i=0;i<count;i++)
		{
			mtotal *=dArr[i];
		}
		System.out.println(mtotal);
	}

}

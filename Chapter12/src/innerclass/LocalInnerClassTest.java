//package innerclass;
//
//import java.util.concurrent.RunnableFuture;
//
//class Outer{
//	
//	
//	int outNum=100;
//	static int sNum=200;
//	
//	RunnableFuture getRunnable(int i)
//	{
//		int num=100;
//		
//		class MyRunnable implements Runnable
//		{
//			public void run()
//			{
//				num +=10;
//				i=200;
//				System.out.println(outNum);
//				System.out.println(sNum);
//				System.out.println(Outer.sNum);
//			}
//		}
//		return new MyRunnable();
//	}
//	
//}
//
//public class LocalInnerClassTest {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

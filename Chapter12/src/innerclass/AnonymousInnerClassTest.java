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
//	Runnable getRunnable(int i)
//	{
//		int num=100;
//		return new Runnable()
//		{
//	
//		public void run()
//		{
//			num +=10;
//			i=200;
//			System.out.println(outNum);
//			System.out.println(sNum);
//			System.out.println(Outer.sNum);
//		}
//		
//		return new MyRunnable();
//	};
//	
//}
//public class AnonymousInnerClassTest {
//
//	public static void main(String[] args) {
//
//	}
//
//}

package string;

public class StringTest2 {

	public static void main(String[] args) {

		String java = new String("java");
		String andriod = new String("android");
		System.out.println(System.identityHashCode(java));
		java=java.concat(andriod);
		
		System.out.println(java);

		System.out.println(System.identityHashCode(java));
	}

}

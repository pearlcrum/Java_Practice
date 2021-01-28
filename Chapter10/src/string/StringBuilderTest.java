package string;

public class StringBuilderTest {

	public static void main(String[] args) {

		String java= new String("java");
		String andriod = new String("andriod");
		
		StringBuilder buffer= new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		buffer.append("andriod");
		System.out.println(System.identityHashCode(buffer));

		java= buffer.toString();
		
	}

}

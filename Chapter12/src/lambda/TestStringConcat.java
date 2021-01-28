package lambda;

public class TestStringConcat {

	public static void main(String[] args) {

		StringConImpl impl = new StringConImpl();
		impl.makeString("hello", "world");
		
		StringConcat concat = (s, v) -> System.out.println(s+","+v);
		concat.makeString("hello","world");
		
	}

}

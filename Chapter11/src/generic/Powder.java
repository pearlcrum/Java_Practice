package generic;

public class Powder extends Meterial{

	public String toString()
	{
		return "재료는 Powder입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("Powder로 프린팅합니다.");
	}
}

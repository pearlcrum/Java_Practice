package stream.coffee;

public class CoffeeTest {

	public static void main(String[] args) {

		
		Coffee americano = new KenyaAmericano();
		americano.brewing();
		
		Coffee KenyaLatte = new Latte(new KenyaAmericano());
		KenyaLatte.brewing();
		
		Coffee KenyaMocha = new Mocha(new Latte(new KenyaAmericano()));
		KenyaMocha.brewing();
		
		Coffee EthiophiMocha = new Mocha(new Latte(new EtiopiaAmericano()));
		EthiophiMocha.brewing();
		
	}

}

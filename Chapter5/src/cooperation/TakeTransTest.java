package cooperation;

public class TakeTransTest {

	public static void main(String[] args) {

		Student studentJ = new Student("James",5000);
		Student studentT = new Student("Tomas",10000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		Subway subwayGreen = new Subway(2);
		Subway subwayBlue = new Subway(4);

		Student studentE= new Student("Edward",15000);
		
		Taxi taxi1000=new Taxi(1000);
		
		//studentJ.takeBus(bus100);
		//studentT.takeSubway(subwayBlue);
		
		studentE.takeTaxi(taxi1000);
		
		/*studentJ.showInfo();
		studentT.showInfo();
		*/
		studentE.showInfo();
		
		taxi1000.showTaxiInfo();
		/*
		bus100.showBusInfo();
		bus500.showBusInfo();
		
		subwayGreen.showSubwayInfo();
		subwayBlue.showSubwayInfo();
		*/
	}

}

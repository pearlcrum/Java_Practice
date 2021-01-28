package hw4;

public class CardCompany {
	private static int theNum=10000;

	private CardCompany()
	{
		
	}
	private static CardCompany instance = new CardCompany();
	public static CardCompany getInstance()
	{
		if(instance == null)
		{
			instance=new CardCompany();
		}
		return instance;
	}
	
	public Card createCard()
	{
		
		Card inst=new Card();
		theNum++;
		inst.setCardNumber(theNum);
		return inst;
	}
}

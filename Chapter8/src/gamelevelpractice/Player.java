package gamelevelpractice;

public class Player {

	private PlayerLevel level;
	
	public Player(){
		
		level= new BeginnerLevel();
		level.showLevel();
	}
	public void upgradeLevel(PlayerLevel level)
	{
		this.level=level;
		level.showLevel();
	}
	public void play(int num)
	{
		level.go(num);
	}
}

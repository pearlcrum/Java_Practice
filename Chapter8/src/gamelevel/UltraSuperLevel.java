package gamelevel;

public class UltraSuperLevel extends PlayerLevel {
	
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	
	}

	@Override
	public void jump() {

		System.out.println("jump ��������");
	}

	@Override
	public void turn() {

		System.out.println("turn ��������");
	}

	@Override
	public void showLevelMessage() {

		System.out.println("****** �ʱ��� �����Դϴ�. ******");
	}
}

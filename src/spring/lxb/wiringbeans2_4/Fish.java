package spring.lxb.wiringbeans2_4;

public class Fish implements Animal{
	private String action="I'm swimming!!";
	private String sayWords="I can't say nothing..";
	public void move() {
		System.out.println(action);
	}

	@Override
	public void say() {
		System.out.println(sayWords);
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		
	}

}

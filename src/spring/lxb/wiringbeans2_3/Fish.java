package spring.lxb.wiringbeans2_3;

public class Fish implements Animal{
	private String action="I'm swimming!!";

	public void move() {
		System.out.println(action);
	}

}

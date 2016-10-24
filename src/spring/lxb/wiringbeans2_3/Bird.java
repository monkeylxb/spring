package spring.lxb.wiringbeans2_3;

import org.springframework.stereotype.Component;

@Component
public class Bird implements Animal {
	private String action="I'm flying~~~~";
	
	public Bird() {
		super();
	}

	public Bird(String action) {
		super();
		this.action = action;
	}

	@Override
	public void move() {
		System.out.println(action);
	}

}

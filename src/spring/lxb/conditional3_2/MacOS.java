package spring.lxb.conditional3_2;

public class MacOS implements Environment {

	@Override
	public void checkEnvironment() {
		System.out.println("This is MacOS");

	}

}

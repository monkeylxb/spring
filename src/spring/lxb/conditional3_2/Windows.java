package spring.lxb.conditional3_2;

public class Windows implements Environment {

	@Override
	public void checkEnvironment() {
		System.out.println("This is Windows");

	}

}

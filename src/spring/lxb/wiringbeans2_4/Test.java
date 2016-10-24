package spring.lxb.wiringbeans2_4;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="bean.xml")
public class Test {
	@Autowired
	private Animal animal;
	
	public Test() {
		super();
	}

	@org.junit.Test
	@Ignore
	public void test1(){
		animal.move();
	}
	@org.junit.Test
	@Ignore
	public void test2(){
		animal.say();
	}
	@org.junit.Test
	public void test3(){
		animal.sing();
	}
}

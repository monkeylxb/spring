package spring.lxb.wiringbeans2_3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * 通过xml启用组件扫描
 * @author liuxiaobao
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"applicationContext.xml"})
public class AnimalAutoConfigTest {
	@Autowired
	private Animal animal;
	@Test
	public void animalTest(){
		animal.move();
	}
}

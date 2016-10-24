package spring.lxb.wiringbeans2_3;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * 通过配置类启动组件扫描
 * @author liuxiaobao
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AnimalConfig.class)
public class SpringAutoConfig {
	@Autowired
	private Animal animal;
	@Test
	public void test(){
		animal.move();
		//assertNotNull(animal);
		//nimal.move();
	}
}

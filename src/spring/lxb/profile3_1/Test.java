package spring.lxb.profile3_1;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Configuration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=Config.class)
@ActiveProfiles("bana")
public class Test {
	@Autowired
	private Food food;
	@org.junit.Test
	public void text(){
		food.say();
	}
}

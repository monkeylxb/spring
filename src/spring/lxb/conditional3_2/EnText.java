package spring.lxb.conditional3_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EnText {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(EnvironmentConfig.class);
		Environment en=ac.getBean(Environment.class);
		en.checkEnvironment();
	}
}

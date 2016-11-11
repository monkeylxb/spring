package spring.lxb.conditional3_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnvironmentConfig {
	@Bean
	@Conditional(MacOSConditional.class)
	public Environment macOS(){
		return new MacOS();
	}
	@Bean
	@Conditional(WindowsConditional.class)
	public Environment windows(){
		return new Windows();
	}
}

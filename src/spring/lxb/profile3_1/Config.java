package spring.lxb.profile3_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Config {
	@Bean
	@Profile("app")
	public Food apple(){
		return new Apple();
	}
	@Bean
	@Profile("bana")
	public Food banana(){
		return new Banana();
	}
}

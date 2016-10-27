package spring.lxb.profile3_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Config {
	@Bean
	@Profile(value = { "app" })
	public Food food(){
		return new Apple();
	}
}

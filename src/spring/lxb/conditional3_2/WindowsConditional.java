package spring.lxb.conditional3_2;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WindowsConditional implements Condition{

	@Override
	public boolean matches(ConditionContext arg0, AnnotatedTypeMetadata arg1) {
		org.springframework.core.env.Environment kk= arg0.getEnvironment();
		return kk.getProperty("os.name").contains("Windows");
	}

}

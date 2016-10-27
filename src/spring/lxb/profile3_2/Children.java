package spring.lxb.profile3_2;

import javax.annotation.Resource;

public class Children {
	@Resource
	private Food food;
	public void lookAt(){
		food.say();
	}
	
}

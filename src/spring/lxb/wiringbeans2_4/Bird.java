package spring.lxb.wiringbeans2_4;

import java.util.List;

public class Bird implements Animal {
	/**
	 * 通过构造器注入
	 */
	private String action;
	/**
	 * 通过set方法注入
	 */
	private String sayWords;
	/**
	 * 使用set方法注入
	 */
	private List<String> songs;
	
	public Bird() {
		super();
	}
	
	public Bird(String sayWords, List<String> songs) {
		super();
		this.sayWords = sayWords;
		this.songs = songs;
	}

	public String getSayWords() {
		return sayWords;
	}

	public void setSayWords(String sayWords) {
		this.sayWords = sayWords;
	}
	
	public List<String> getSongs() {
		return songs;
	}

	public void setSongs(List<String> songs) {
		this.songs = songs;
	}

	public Bird(String action) {
		super();
		this.action = action;
	}

	@Override
	public void move() {
		System.out.println(action);
	}
	
	public void say(){
		System.out.println(sayWords);
	}

	@Override
	public void sing() {
		for(String kk:songs){
			System.out.println(kk);
		}
	}
}

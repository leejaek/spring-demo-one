package com.luv2code.springdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private List<String> fortuneList = Arrays.asList("Lucky", "Bad", "Try Again");
	
	@Override
	public String getFortune() {
		Random rand = new Random();
		String todaysFortune = this.fortuneList.get(rand.nextInt(this.fortuneList.size()));
		return todaysFortune;
	}

}

package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Coach coach1 = new BaseballCoach();
       System.out.println( coach1.getDailyWorkout());
       Coach coach2 = new TrackCoach();
       System.out.println( coach2.getDailyWorkout());
	}

}

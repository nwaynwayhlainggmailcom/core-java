package com.jdc.anno2;

public class UserService {
	
	@MinAge(18)
	public void watchMovie(int age) {
		System.out.println("Enjoy your movie.");
	}
	
	@MinAge(20)
	public void drinkAlcohol(int age) {
		System.out.println("Cheers");
	}
	

	public void playGame(int age) {
		System.out.println("Playing game");
	}

}

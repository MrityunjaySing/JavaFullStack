package Game_Project;

import java.util.Scanner;

public class Game {
@SuppressWarnings("resource")
//  here is using press button all handles Weapon
public Weapon pressButton(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the score:");
		int score = sc.nextInt();
		if(score<=400) {
			System.out.println("you get the knife");
			Knife k = new Knife();
			return k;
		}
		else if(score<=800) {
			System.out.println("Press 1 get Knife and 2 get Gun");
			int  x = sc.nextInt();
			switch(x) {
			case 1:
				System.out.println("you get the knife");
				Knife k = new Knife();
				return k;
			default:
				System.out.println("You get the Gun");
				Gun g = new Gun();
				return g;
			}
			
		}
		else {
			System.out.println("Press 1 get Knife and 2 get Gun and any other no to get Bomb");
		int  x = sc.nextInt();
		switch(x) {
		case 1:
			System.out.println("you get the knife");
			Knife k = new Knife();
			return k;
		case 2:
			System.out.println("You get the Gun");
			Gun g = new Gun();
			return g;
			default:
		System.out.println("you get the Bomb");
		Bomb b = new Bomb();
		return b;
		
		}
	
	
	}

 }

}
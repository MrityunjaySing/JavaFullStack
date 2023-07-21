package Game_Project;

import java.util.Scanner;

public class Player {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	char x;
	Game g = new Game();
	do {
	Weapon w = g.pressButton();
	w.use();
	System.out.println("do you want to change the weapen");
	System.out.println("Press Y/y to change and Press E/e to exit");
	x=sc.next().charAt(0);
	}while(x=='Y'||x=='y');
	sc.close();
}
}

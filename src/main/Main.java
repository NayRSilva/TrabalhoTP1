package main;
import sistema.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello");
		Cliente one = new Cliente("One", "one@one", 123, 321, 456, 789);
		System.out.println(one.getNome());

		Plataforma PS4 = new Plataforma("PS4", 50);
		System.out.println(PS4.getNome());
		
		Jogo The_Witcher = new Jogo("The Witcher", 129, 1,1,12345,PS4);
		System.out.println(The_Witcher.getNome());
		System.out.println(The_Witcher.getPlataforma());
		System.out.println(The_Witcher.getPlataforma().getNome());
		Console Playstation = new Console("Playstation", 200, 3, 3, 232323);
		System.out.println(Playstation.getNome());
		
	}
	
}

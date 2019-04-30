package main;
import sistema.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		// Exemplo de um cliente e seus métodos
		Cliente one = new Cliente("One", "one@one", 123, 321, 456, 789);
		System.out.println(one.getNome());

		
		// Exemplo de um console e seus métodos
		Console PS4 = new Console("PS4", 50, 5, 5, 000001);
		System.out.println(PS4.getNome());
		
		
		// Exemplo de um jogo e seus métodos
		Jogo The_Witcher = new Jogo("The Witcher", 15, 1,1,12345,PS4);
		System.out.println(The_Witcher.getNome());
		System.out.println(The_Witcher.getConsole());
		System.out.println(The_Witcher.getConsole().getNome());
		System.out.println(PS4.getNome());
		System.out.println(PS4.getJogosConsole());
		System.out.println(The_Witcher.getPreco());
		PS4.getJogosConsoleNomes();
		
		
		// Exemplo de um aluguel e seus métodos
		Aluguel um = new Aluguel(one, 4 ,2, 2);
		
		System.out.println(um.getPreco_aluguel());
		um.addConsoleAluguel(PS4);
		System.out.println(um.getPreco_aluguel());
		um.addJogoAluguel(The_Witcher);
		System.out.println(um.getPreco_aluguel());
	}
	
}

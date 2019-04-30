package main;
import sistema.*;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("Hello");
		
		Funcionario fun = new Funcionario("Fun", "Fun@Fun", 321, 213, 454, 666);
		System.out.println(fun.getNome());
		
		// Exemplo de um cliente e seus métodos
		Cliente one = new Cliente("One", "one@one", 123, 321, 456, 789);
		System.out.println(one.getNome());

		
		// Exemplo de um console e seus métodos
		Console PS4 = new Console("PS4", 50, 5, 000001);
		System.out.println(PS4.getNome());
		
		
		// Exemplo de um jogo e seus métodos
		Jogo The_Witcher = new Jogo("The Witcher", 10, 2,12345,PS4);
		System.out.println(The_Witcher.getNome());
		System.out.println(The_Witcher.getConsole());
		System.out.println(The_Witcher.getConsole().getNome());
		System.out.println(PS4.getNome());
		System.out.println(PS4.getJogosConsole());
		System.out.println(The_Witcher.getPreco());
		PS4.getJogosConsoleNomes();
		
		
		// Exemplo de um carrinho e seus métodos
		Carrinho um = new Carrinho(one, 4);
		
		System.out.println(um.getPreco_carrinho());
		um.addConsoleCarrinho(PS4);
		System.out.println(um.getPreco_carrinho());
		um.addJogoCarrinho(The_Witcher);
		um.addJogoCarrinho(The_Witcher);
		System.out.println(um.getPreco_carrinho());
		
		// Exemplo de um Aluguel e seus métodos
		Aluguel alugs = new Aluguel(um, fun);
		System.out.print(alugs.getDia() + "/");
		System.out.print(alugs.getMes() + "/");
		System.out.println(alugs.getAno());
		System.out.println(alugs.getPreco_aluguel());
		System.out.println(alugs.getNum_itens());
	
	}
	
}

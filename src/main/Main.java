package main;
import sistema.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		Funcionario Funcionario1 = new Funcionario("Funcionario1", "Funcionario1@Funcionario1", 321, 213, 454, 666);
		System.out.println(Funcionario1.getNome());
		
		// Exemplo de Carrinho1 cliente e seus métodos
		Cliente Cliente1 = new Cliente("Cliente1", "Cliente1@Cliente1", 123, 321, 456, 789);
		System.out.println(Cliente1.getNome());

		
		// Exemplo de Carrinho1 console e seus métodos
		Console PS4 = new Console("PS4", 50, 5, 000001);
		System.out.println(PS4.getNome());
		
		
		// Exemplo de Carrinho1 jogo e seus métodos
		Jogo The_Witcher = new Jogo("The Witcher", 10, 2,12345,PS4);
		System.out.println(The_Witcher.getNome());
		System.out.println(The_Witcher.getConsole());
		System.out.println(The_Witcher.getConsole().getNome());
		System.out.println(PS4.getNome());
		System.out.println(PS4.getJogosConsole());
		System.out.println(The_Witcher.getPreco());
		PS4.getJogosConsoleNomes();
		
		
		// Exemplo de Carrinho1 carrinho e seus métodos
		Carrinho Carrinho1 = new Carrinho(Cliente1, 4);
		
		System.out.println(Carrinho1.getPreco());
		Carrinho1.addConsoleCarrinho(PS4);
		System.out.println(Carrinho1.getPreco());
		Carrinho1.addJogoCarrinho(The_Witcher);
		Carrinho1.addJogoCarrinho(The_Witcher);
		Carrinho1.addJogoCarrinho(The_Witcher);
		Carrinho1.addJogoCarrinho(The_Witcher);
		System.out.println(Carrinho1.getNum_jogos());
		System.out.println(Carrinho1.getPreco());
		System.out.println(The_Witcher.getQuantidade_livre());
		
		
		Aluguel Aluguel1 = new Aluguel(Carrinho1, Funcionario1);
		Aluguel1.getStatus();
		System.out.println(The_Witcher.getQuantidade_livre());
		Carrinho1.rmvJogoCarrinho(The_Witcher, 2);
		System.out.println(The_Witcher.getQuantidade_livre());
		System.out.println(Carrinho1.getNum_jogos());
		Carrinho1.getJogosNomes();
		Aluguel Aluguel2 = new Aluguel(Carrinho1, Funcionario1);
		Aluguel2.getStatus();

			


	
	}
	
}

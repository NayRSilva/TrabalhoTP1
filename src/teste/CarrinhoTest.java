package teste;
import sistema.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarrinhoTest {
	
	// Funcionario
	String nomeFun = "Funcionario";
	String emailFun = "funcionario@funcionario";
	int telefoneFun = 66666666;
	int rgFun = 111110;
	int cpfFun = 11111101;
	int idFun = 11110;
	
	Funcionario _funcionario = new Funcionario (nomeFun, emailFun, telefoneFun,
			rgFun, cpfFun, idFun);
	
	// Cliente
	String nome = "Cliente";
	String email = "cliente@cliente";
	int telefone = 999999999;
	int rg = 000001;
	int cpf = 001000100;
	int id = 00001;
	
	Cliente _cliente = new Cliente (nome, email, telefone,
			rg, cpf, id);
	
	// Console
	String nomeConsole = "PS4";
	double precoConsole = 50;
	int quantidadeConsole = 5;
	int idConsole = 99999;
	
	Console _xbox = new Console (nomeConsole, 
			precoConsole, quantidadeConsole, idConsole);

	// Jogo
	String nomeJogo = "PS4";
	double precoJogo = 50;
	int quantidadeJogo = 5;
	int idJogo = 99999;
	
	Jogo _halo = new Jogo (nomeJogo, 
			precoJogo, quantidadeJogo, idJogo, _xbox);
	   
	int dias_alugado = 5;
	Carrinho _carrinho = new Carrinho (_cliente, dias_alugado);
	
	@Test
	void testCarrinho_getCliente() {
	   assertEquals(_cliente, _carrinho.getCliente());     
	}
	@Test
	void testCarrinho_getNumConsoles() {
	   assertEquals(0, _carrinho.getNum_consoles());     
	}
	@Test
	void testCarrinho_getNumJogos() {
	   assertEquals(0, _carrinho.getNum_jogos());     
	}
	@Test
	void testCarrinho_getNumItens() {
	   assertEquals(0, _carrinho.getNum_itens());     
	}
	@Test
	void testCarrinho_getDiasAlugado() {
	   assertEquals(dias_alugado, _carrinho.getDias_alugado());     
	}
	@Test
	void testCarrinho_getConsoles() {
	   assertTrue(_carrinho.getConsoles().isEmpty());	}
	@Test
	void testCarrinho_getJogos() {
	   assertTrue(_carrinho.getJogos().isEmpty());	
   }
	@Test
	void testCarrinho_getPreco() {
	   assertEquals(0, _carrinho.getPreco());     
   }
	@Test
	void testCarrinho_addJogo() {
		_carrinho.addJogoCarrinho(_halo);
	   assertFalse(_carrinho.getJogos().isEmpty());	
	   assertEquals(1, _carrinho.getNum_jogos()); 
	   assertEquals(_halo.getPreco() * dias_alugado,
			   		_carrinho.getPreco());
	   assertEquals(1, _carrinho.getNum_itens());
	   assertEquals(5, _halo.getQuantidade_livre());
   }	
	@Test
	void testCarrinho_addConsole() {
		_carrinho.addConsoleCarrinho(_xbox);
	   assertFalse(_carrinho.getConsoles().isEmpty());	
	   assertEquals(1, _carrinho.getNum_consoles()); 
	   assertEquals(_xbox.getPreco() * dias_alugado,
			   		_carrinho.getPreco());
	   assertEquals(1, _carrinho.getNum_itens());
	   assertEquals(5, _xbox.getQuantidade_livre());
   }
	@Test
	void testCarrinho_addJogosConsoles() {
		
		_carrinho.addJogoCarrinho(_halo);
		_carrinho.addConsoleCarrinho(_xbox);
		
	   assertFalse(_carrinho.getJogos().isEmpty());
	   
	   assertEquals(1, _carrinho.getNum_jogos());
	   
	   assertEquals((_halo.getPreco() + _xbox.getPreco())
			   					* dias_alugado,
			   		_carrinho.getPreco());
	   
	   assertEquals(2, _carrinho.getNum_itens());
	   
	   assertEquals(5, _halo.getQuantidade_livre());
	   
	   assertFalse(_carrinho.getConsoles().isEmpty());
	   
	   assertEquals(1, _carrinho.getNum_consoles()); 

	   assertEquals(5, _xbox.getQuantidade_livre());
   }
	@Test
	void testAluguel_rmvJogosConsoles() {	
		
		_carrinho.addJogoCarrinho(_halo);
		_carrinho.addConsoleCarrinho(_xbox);			
	   assertFalse(_carrinho.getJogos().isEmpty());	   
	   assertEquals(1, _carrinho.getNum_jogos());	   
	   assertEquals((_halo.getPreco() + _xbox.getPreco())
			   					* dias_alugado,
			   		_carrinho.getPreco());	   
	   assertEquals(2, _carrinho.getNum_itens());	   
	   assertEquals(5, _halo.getQuantidade_livre());	   
	   assertFalse(_carrinho.getConsoles().isEmpty());
	   assertEquals(1, _carrinho.getNum_consoles()); 
	   assertEquals(5, _xbox.getQuantidade_livre());
	   
	   _carrinho.rmvConsoleCarrinho(_xbox);
	   assertEquals(1, _carrinho.getNum_itens());	   ;	   
	   assertTrue(_carrinho.getConsoles().isEmpty());
	   assertEquals(0, _carrinho.getNum_consoles()); 
	   assertEquals(5, _xbox.getQuantidade_livre());
	   assertEquals((_halo.getPreco())
					* dias_alugado,
		_carrinho.getPreco());	
	   
	   _carrinho.rmvJogoCarrinho(_halo);
	   assertEquals(0, _carrinho.getNum_jogos());     
	   assertEquals(0, _carrinho.getNum_itens());     
	   assertEquals(dias_alugado, _carrinho.getDias_alugado());     
	   assertTrue(_carrinho.getConsoles().isEmpty());	
	   assertTrue(_carrinho.getJogos().isEmpty());	
	   assertEquals(0, _carrinho.getPreco());
	}
	
}



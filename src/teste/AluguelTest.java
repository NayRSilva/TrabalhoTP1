package teste;
import sistema.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*! \brief Brief description.
 *         Brief description continued.
 *
 *  Detailed description starts here.
 */

class AluguelTest {
	
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
	double precoConsole = 25;
	int quantidadeConsole = 5;
	int idConsole = 99999;
	
	Console _xbox = new Console (nomeConsole, 
			precoConsole, quantidadeConsole, idConsole);

	// Jogo
	String nomeJogo = "PS4";
	double precoJogo = 10;
	int quantidadeJogo = 5;
	int idJogo = 66666;
	
	Jogo _halo = new Jogo (nomeJogo, 
			precoJogo, quantidadeJogo, idJogo, _xbox);
	   
	int dias_alugado = 5;
	Carrinho _carrinho = new Carrinho (_cliente, dias_alugado);
	Aluguel _aluguel = new Aluguel(_carrinho,_funcionario);
	@Test
	void testAluguel_getCliente() {
	   assertEquals(_carrinho.getCliente(), _aluguel.getCliente());     
	}
	@Test
	void testAluguel_getNumConsoles() {
	   assertEquals(_carrinho.getNum_consoles(), _aluguel.getNum_consoles());     
	}
	@Test
	void testAluguel_getNumJogos() {
	   assertEquals(_carrinho.getNum_jogos(), _aluguel.getNum_jogos());     
	}
	@Test
	void testAluguel_getNumItens() {
	   assertEquals(_carrinho.getNum_itens(), _aluguel.getNum_itens());     
	}
	@Test
	void testAluguel_getDiasAlugado() {
	   assertEquals(_carrinho.getDias_alugado(), _aluguel.getDias_alugado());     
	}
	@Test
	void testAluguel_getConsoles() {
	   assertTrue(_aluguel.getConsoles().isEmpty());	}
	@Test
	void testAluguel_getJogos() {
	   assertTrue(_aluguel.getJogos().isEmpty());	
   }
	@Test
	void testAluguel_getPreco() {
	   assertEquals(0, _aluguel.getPreco()); 
   }
    @Test
	void testAluguel_Carrinho() {
    	_carrinho.addJogoCarrinho(_halo);
    	_carrinho.addJogoCarrinho(_halo);
    	_carrinho.addConsoleCarrinho(_xbox);
    	Aluguel _aluguel2 = new Aluguel (_carrinho,_funcionario);

	   assertEquals(_carrinho.getCliente(), _aluguel2.getCliente());     
	   assertEquals(_carrinho.getNum_consoles(), _aluguel2.getNum_consoles());     
	   assertEquals(_carrinho.getNum_jogos(), _aluguel2.getNum_jogos());     
	   assertEquals(_carrinho.getNum_itens(), _aluguel2.getNum_itens());     
	   assertEquals(_carrinho.getDias_alugado(), _aluguel2.getDias_alugado());     
	   assertFalse(_aluguel2.getConsoles().isEmpty());
	   assertFalse(_aluguel2.getJogos().isEmpty());	
	   assertEquals(((_halo.getPreco() * _carrinho.getNum_jogos()) 
			   + _xbox.getPreco() * (_carrinho.getNum_consoles())) 
			   * dias_alugado,
			   _aluguel2.getPreco()); 
 
    }
}

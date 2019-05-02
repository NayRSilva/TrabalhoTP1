package teste;
import sistema.Console;
import sistema.Jogo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ProdutoTest {
	
	// Console
	String nomeConsole = "PS4";
	double precoConsole = 50;
	int quantidadeConsole = 5;
	int idConsole = 99999;
	
	// Jogo
	String nomeJogo = "PS4";
	double precoJogo = 50;
	int quantidadeJogo = 5;
	int idJogo = 99999;
	
	Console _xbox = new Console (nomeConsole, 
			precoConsole, quantidadeConsole, idConsole);

	Jogo _halo = new Jogo (nomeJogo, 
			precoJogo, quantidadeJogo, idJogo, _xbox);
	   
	@Test
	public void testConsole_getnomeConsole() {	
	   assertEquals(nomeConsole, _xbox.getNome());     
	}
	@Test
	public void testConsole_getprecoConsole() {	
	   assertEquals(precoConsole, _xbox.getPreco());     
	}
	@Test
	public void testConsole_getQuantidade() {	
	   assertEquals(quantidadeConsole, _xbox.getQuantidade());     
	}
	@Test
	public void testConsole_getQuantidade_livre() {	
	   assertEquals(quantidadeConsole, _xbox.getQuantidade_livre());     
	}
	@Test
	public void testConsole_getJogosConsole() {	
	   assertFalse(_xbox.getJogosConsole().isEmpty());    
	}
	@Test
	public void testConsole_getId() {	
	   assertEquals(idConsole, _xbox.getId());     
	}
	@Test
	public void testJogo_getNome_jogo() {	
	   assertEquals(nomeJogo, _halo.getNome());     
	}
	@Test
	public void testJogo_getTaxa() {	
	   assertEquals(0.10, _halo.getTaxa());     
	}     
	@Test
	public void testJogo_getPreco_jogo() {	
	   assertEquals(precoConsole * 0.1 + precoJogo,
			   		_halo.getPreco());     
	}
	@Test
	public void testJogo_getQuantidade() {	
	   assertEquals(quantidadeJogo, _halo.getQuantidade());     
	}
	@Test
	public void testJogo_getQuantidade_livre() {	
	   assertEquals(quantidadeJogo, _halo.getQuantidade_livre());     
	}
	@Test
	public void testJogo_getConsole() {	
	assertEquals(_xbox, _halo.getConsole());     
	}
	@Test
	public void testJogo_getId() {	
	   assertEquals(idJogo, _halo.getId());     
	}

}

package sistema;
import java.util.*;

public class Aluguel {
	private Cliente cliente;
	private int num_itens;
	private int num_consoles;
	private int num_jogos;
	ArrayList<Console> consoles;
	ArrayList<Jogo> jogos;
	
	public Aluguel(Cliente cliente, int num_consoles, int num_jogos) {
		this.cliente = cliente;
		this.num_consoles = num_consoles;
		this.num_jogos = num_jogos;
		this.num_itens = numItens();
		consoles = new ArrayList<Console>(num_consoles);
		jogos = new ArrayList<Jogo>(10);
	}

	public int getNum_consoles() {
		return num_consoles;
	}

	public void setNum_consoles(int num_consoles) {
		this.num_consoles = num_consoles;
	}

	public int getNum_jogos() {
		return num_jogos;
	}

	public void setNum_jogos(int num_jogos) {
		this.num_jogos = num_jogos;
	}

	public void setConsoles(ArrayList<Console> consoles) {
		this.consoles = consoles;
	}

	public void setJogos(ArrayList<Jogo> jogos) {
		this.jogos = jogos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getNum_itens() {
		return num_itens;
	}

	public void setNum_itens(int num_itens) {
		this.num_itens = num_itens;
	}

	public ArrayList<Console> getConsoles() {
		return consoles;
	}

	public ArrayList<Jogo> getJogos() {
		return jogos;
	}

	public void addConsoleAluguel(Console console) {
			this.consoles.add(console);
	}
	
	public void addJogoAluguel(Jogo jogo) {
		this.jogos.add(jogo);
	}
	
	public void getConsoleNomes() {
	    for(Console x:this.getConsoles()){  
	        System.out.println(x.getNome());  
	    }
	}
	
	public void getJogosNomes() {
	    for(Jogo x:this.getJogos()){  
	        System.out.println(x.getNome());  
	    }
	}
	
	private int numItens() {
		return getNum_consoles() + getNum_jogos();
	}
}

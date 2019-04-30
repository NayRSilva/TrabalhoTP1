package sistema;
import java.util.*;

public class Aluguel {
	
	private Cliente cliente;
	private int num_itens;
	private int num_consoles;
	private int num_jogos;
	private int dias_alugado;
	private double preco_aluguel;
	private Calendar data;
	ArrayList<Console> consoles;
	ArrayList<Jogo> jogos;

	
	public Aluguel(Cliente cliente, int dias_alugado, int num_consoles, int num_jogos) {
		
		this.cliente = cliente;
		this.num_consoles = num_consoles;
		this.num_jogos = num_jogos;
		this.num_itens = numItens();
		this.dias_alugado = dias_alugado;
		this.data = Calendar.getInstance();
		consoles = new ArrayList<Console>(num_consoles);
		jogos = new ArrayList<Jogo>(num_jogos);
		this.preco_aluguel = calculaPreco();
	}
	
	public Aluguel(Cliente cliente, int dias_alugado, int num_consoles, int num_jogos, Console console) {
		
		this.cliente = cliente;
		this.num_consoles = num_consoles;
		this.num_jogos = num_jogos;
		this.num_itens = numItens();
		this.dias_alugado = dias_alugado;
		this.data = Calendar.getInstance();
		consoles = new ArrayList<Console>(num_consoles);
		jogos = new ArrayList<Jogo>(num_jogos);
		this.addConsoleAluguel(console);
	}
	
	public Aluguel(Cliente cliente, int dias_alugado, int num_consoles, int num_jogos, 
		   Console console, Jogo jogo) {
		
		this.cliente = cliente;
		this.num_consoles = num_consoles;
		this.num_jogos = num_jogos;
		this.num_itens = numItens();
		this.dias_alugado = dias_alugado;
		this.data = Calendar.getInstance();
		consoles = new ArrayList<Console>(num_consoles);
		jogos = new ArrayList<Jogo>(num_jogos);
		this.addConsoleAluguel(console);
		this.addJogoAluguel(jogo);
	}
	
	public Aluguel(Cliente cliente, int dias_alugado, int num_consoles, int num_jogos, 
		   ArrayList<Console> console, ArrayList<Jogo> jogo) {
		this.cliente = cliente;
		this.num_consoles = num_consoles;
		this.num_jogos = num_jogos;
		this.num_itens = numItens();
		this.dias_alugado = dias_alugado;
		this.data = Calendar.getInstance();
		this.consoles = console;
		this.jogos = jogo;
		this.preco_aluguel = calculaPreco();
	}

	public double getPreco_aluguel() {
		return preco_aluguel;
	}

	public void setPreco_aluguel(double preco_aluguel) {
		this.preco_aluguel = preco_aluguel;
	}

	public int getDia() {
		return data.get(Calendar.DAY_OF_MONTH);
	}
	public int getMes() {
		return data.get(Calendar.MONTH);
	}
	public int getAno() {
		return data.get(Calendar.YEAR);
	}
	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public int getDias_alugado() {
		return dias_alugado;
	}

	public void setDias_alugado(int dias_alugado) {
		this.dias_alugado = dias_alugado;
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
		this.atualizaPreco();
			
	}
	
	public void addJogoAluguel(Jogo jogo) {
		this.jogos.add(jogo);
		this.atualizaPreco();
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
	
	public double calculaPreco() {
		double total_concoles = 0;
		double total_jogos = 0;

	    for(Console x:this.getConsoles()){  
	    	total_concoles = total_concoles + x.getPreco();  
        
	    }
	    for(Jogo x:this.getJogos()){  
	    	total_jogos = total_jogos + x.getPreco();  
        
	    }
	    return this.dias_alugado * (total_jogos + total_concoles);
	}
	
	private void atualizaPreco() {
		double total_concoles = 0;
		double total_jogos = 0;
		double preco_atualizado = 0;
	    for(Console x:this.getConsoles()){  
	    	total_concoles = total_concoles + x.getPreco();  
        
	    }
	    for(Jogo x:this.getJogos()){  
	    	total_jogos = total_jogos + x.getPreco();  
        
	    }
	    preco_atualizado = this.dias_alugado * (total_jogos + total_concoles);
	    this.setPreco_aluguel(preco_atualizado);
	}
	
	private int numItens() {
		return getNum_consoles() + getNum_jogos();
	}
	
}

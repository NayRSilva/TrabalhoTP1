package sistema;
import java.util.*;

public class Carrinho {
	
	private Cliente cliente;
	private int num_itens;
	private int num_consoles;
	private int num_jogos;
	private int dias_alugado;
	private double preco_carrinho;
	private Calendar data;
	ArrayList<Console> consoles;
	ArrayList<Jogo> jogos;

	protected Carrinho() {
		
	}
	
	public Carrinho(Cliente cliente, int dias_alugado) {
		
		this.num_consoles = 0;
		this.num_jogos = 0;
		this.num_itens = 0;
		this.cliente = cliente;
		this.dias_alugado = dias_alugado;
		this.data = Calendar.getInstance();
		consoles = new ArrayList<Console>();
		jogos = new ArrayList<Jogo>();
		initPreco(preco_carrinho);
	}
	
	public Carrinho(Cliente cliente, int dias_alugado, Console console) {
		
		this.num_consoles = 0;
		this.num_jogos = 0;
		this.num_itens = 0;
		this.cliente = cliente;
		this.dias_alugado = dias_alugado;
		this.data = Calendar.getInstance();
		consoles = new ArrayList<Console>();
		jogos = new ArrayList<Jogo>();
		this.addConsoleCarrinho(console);
	}
	
	public Carrinho(Cliente cliente, int dias_alugado,
		   Console console, Jogo jogo) {
		
		this.num_consoles = 0;
		this.num_jogos = 0;
		this.num_itens = 0;
		this.cliente = cliente;
		this.dias_alugado = dias_alugado;
		this.data = Calendar.getInstance();
		consoles = new ArrayList<Console>();
		jogos = new ArrayList<Jogo>();
		this.addConsoleCarrinho(console);
		this.addJogoCarrinho(jogo);
	}

	public double getPreco_carrinho() {
		return preco_carrinho;
	}

	public void setPreco_carrinho(double preco_carrinho) {
		this.preco_carrinho = preco_carrinho;
	}

	public int getDia() {
		return this.getData().get(Calendar.DAY_OF_MONTH);
	}
	
	public int getMes() {
		return this.getData().get(Calendar.MONTH);
	}
	
	public int getAno() {
		return this.getData().get(Calendar.YEAR);
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

	public void addConsoleCarrinho(Console console) {
		if (console.getQuantidade_livre() <= 0) {
			System.out.println("Console Indisponível");
		} else {
			this.getConsoles().add(console);
			try {
				this.setNum_consoles(this.getNum_consoles() + 1);
				this.quantidadeItens();
				this.atualizaPreco();
			} catch (Exception execao) {
				System.out.println("Erro ao atualizar preco do carrinho");
			}
		}
	}
	
	public void addJogoCarrinho(Jogo jogo) {
		if (jogo.getQuantidade_livre() <= 0) {
			System.out.println("Jogo Indisponível");
		} else {
			this.getJogos().add(jogo);
			try {
				this.setNum_jogos(getNum_jogos() + 1);
				this.quantidadeItens();
				this.atualizaPreco();
			} catch (Exception execao) {
				System.out.println("Erro ao atualizar preco do carrinho");
			}
		}
	}
	
	public void rmvJogoCarrinho() {
		
	}
	
	public void rmvConsoleCarrinho() {
		
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
	
	private void initPreco(double preco_carrinho) {
		try {
			this.preco_carrinho = calculaPreco();
		} catch (Exception exeption){
			System.out.println("Erro ao calcular preço");
		}
	}
	
	
	private double calculaPreco() throws Exception{
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
	
	private void atualizaPreco() throws Exception{
		double total_concoles = 0;
		double total_jogos = 0;
		double preco_atualizado = 0;
	    for(Console x:this.getConsoles()){  
	    	total_concoles = total_concoles + x.getPreco();  
        
	    }
	    for(Jogo x:this.getJogos()){  
	    	total_jogos = total_jogos + x.getPreco();  
        
	    }
	    preco_atualizado = this.dias_alugado 
	    						* (total_jogos 
	    						+ total_concoles);
	    this.setPreco_carrinho(preco_atualizado);
	}
	
	private void quantidadeItens() {
		this.setNum_itens(getNum_consoles() + getNum_jogos());
	}
	
}

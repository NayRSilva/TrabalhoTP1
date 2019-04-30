package sistema;

import java.util.ArrayList;
import java.util.Calendar;

public class Aluguel extends Carrinho {
	
	private Carrinho compra;
	private Funcionario funcionario;
	private int id;
	private final Cliente cliente;
	private int num_itens;
	private final int num_consoles;
	private final int num_jogos;
	private final int dias_alugado;
	private final double preco_aluguel;
	private final Calendar data;
	private final ArrayList<Console> consoles;
	private final ArrayList<Jogo> jogos;
	private int devolvido;
	
	public Aluguel(Carrinho compra, Funcionario funcionario) throws Exception {
		super();
		this.funcionario    = funcionario;
		this.cliente 		= compra.getCliente(); 
		this.dias_alugado	= compra.getDias_alugado();
		this.num_consoles 	= compra.getNum_consoles();
		this.num_jogos 		= compra.getNum_jogos();
		this.num_itens 		= compra.getNum_itens();
		this.preco_aluguel	= compra.getPreco_carrinho();
		this.data			= compra.getData();
		this.consoles 		= compra.getConsoles();
		this.jogos 			= compra.getJogos();
		this.devolvido      = 0;
		this.atualizaQuantidades();
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public int getId() {
		return id;
	}

	public Carrinho getCompra() {
		return compra;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getNum_itens() {
		return num_itens;
	}

	public int getNum_consoles() {
		return num_consoles;
	}

	public int getNum_jogos() {
		return num_jogos;
	}

	public int getDias_alugado() {
		return dias_alugado;
	}

	public double getPreco_aluguel() {
		return preco_aluguel;
	}

	public Calendar getData() {
		return data;
	}

	public ArrayList<Console> getConsoles() {
		return consoles;
	}

	public ArrayList<Jogo> getJogos() {
		return jogos;
	}

	public int getDevolvido() {
		return devolvido;
	}

	public void setDevolvido(int devolvido) {
		this.devolvido = devolvido;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public void devolucao() {
		if (this.getConsoles().size() <= 0) {
			System.out.println("Não há consoles a serem devolvidos");
		} else {
		    for(Console x:this.getConsoles()){  
		          x.setQuantidade_livre(x.getQuantidade_livre() + 1);
		          System.out.println(x.getNome() +": Devolvido");
		    }
		}
		if (this.getJogos().size() <= 0) {
			System.out.println("Não há jogos a serem devolvidos");
		} else {
		    for(Jogo x:this.getJogos()){  
		          x.setQuantidade_livre(x.getQuantidade_livre() + 1);
		          System.out.println(x.getNome() +": Devolvido");
		    }
		}
		this.setDevolvido(1);
	}
	
	private void atualizaQuantidades() throws Exception {
		if (this.getConsoles().size() >= 0) {
		    for(Console x:this.getConsoles()){  
		    	  if (x.getQuantidade_livre() <= 0) {
		    		  throw new Exception("Console: "+ x.getNome() +" - Estoque Insuficiente OU "
			    		  		+ "Console Indisponível");
		    	  } else {
		          x.setQuantidade_livre(x.getQuantidade_livre() - 1);
		          System.out.println(x.getNome() +": Alugado");
		    	  }
		    }
		}
		if (this.getJogos().size() >= 0) {
		    for(Jogo x:this.getJogos()){  
		    	  if (x.getQuantidade_livre() <= 0) {
		    		  throw new Exception("Jogo: "+ x.getNome() +" - Estoque Insuficiente OU "
		    		  		+ "Jogo Indisponível");
		    		  
		    	  } else {
		    		  x.setQuantidade_livre(x.getQuantidade_livre() - 1);
		    		  System.out.println(x.getNome() +": Alugado");
		    	  }
		    }
		}
	}
	
}

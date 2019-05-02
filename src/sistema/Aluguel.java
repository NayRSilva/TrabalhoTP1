package sistema;

import java.util.ArrayList;
import java.util.Calendar;

public class Aluguel extends Carrinho {
	
	private Carrinho compra;
	private Funcionario funcionario;
	private int id;
	private Cliente cliente;
	private int num_itens;
	private int num_consoles;
	private int num_jogos;
	private int dias_alugado;
	private double preco_aluguel;
	private Calendar data;
	private ArrayList<Console> consoles;
	private ArrayList<Jogo> jogos;
	private int devolvido;
	private int cancelado;

	public Aluguel(Carrinho compra, Funcionario funcionario) {
		try {	
			this.funcionario    = funcionario;
			this.cliente 		= compra.getCliente(); 
			this.dias_alugado	= compra.getDias_alugado();
			this.num_consoles 	= compra.getNum_consoles();
			this.num_jogos 		= compra.getNum_jogos();
			this.num_itens 		= compra.getNum_itens();
			this.preco_aluguel	= compra.getPreco();
			this.data			= compra.getData();
			this.consoles 		= compra.getConsoles();
			this.jogos 			= compra.getJogos();
			this.devolvido      = 0;	
			this.atualizaQuantidades();
		} catch (Exception ex){
			this.cancelado = 1;
			System.out.println(ex.getMessage());
		}
	}
	public int getStatus() {
		if (this.getCancelado() == 1) {
			System.out.println("Aluguel Canelado");
			return -1;
		} 
		if (this.getDevolvido() == 1) {
			System.out.println("Aluguel Devolvido");
			return 0;

		} else {
			System.out.println("Aluguel em Andamento");
			return 1;
		}
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

	public double getPreco() {
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
	
	public int getCancelado() {
		return cancelado;
	}

	public void setCancelado(int cancelado) {
		this.cancelado = cancelado;
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
	
	private void atualizaQuantidades() throws Exception{
		int contaConsoles = 0;
		if (this.getConsoles().size() >= 0) {
		    for(Console x:this.getConsoles()){  
		    	  if (x.getQuantidade_livre() <= 0) {
		    		  x.setQuantidade_livre(x.getQuantidade_livre() + contaConsoles);
		    		  throw new Exception("Console: "+ x.getNome() +" - Estoque Insuficiente OU "
			    		  		+ "Console Indisponível - Aluguel Canelado");
		    	  } else {
		    	  contaConsoles++;
		          x.setQuantidade_livre(x.getQuantidade_livre() - 1);
		          System.out.println(x.getNome() +": Alugado");
		    	  }
		    }
		}
		if (this.getJogos().size() >= 0) {
			int contaJogos = 0;
		    for(Jogo x:this.getJogos()){  
		    	  if (x.getQuantidade_livre() <= 0) {
		    		  x.setQuantidade_livre(x.getQuantidade_livre() + contaJogos);
		    		  throw new Exception("Jogo: "+ x.getNome() +" - Estoque Insuficiente OU "
		    		  		+ "Jogo Indisponível - Aluguel Canelado");
		    		  
		    	  } else {
		    		  contaJogos++;
		    		  x.setQuantidade_livre(x.getQuantidade_livre() - 1);
		    		  System.out.println(x.getNome() +": Alugado");
		    	  }
		    }
		}
	}
	
}

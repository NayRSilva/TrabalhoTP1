package sistema;

import java.util.ArrayList;
import java.util.Calendar;

	/*! \brief A classe Aluguel implementa a funcionalidade.
	 /*   de um cliente alugar ou devolver um Jogo/Console.
	 *	
	 * Essa classe extende a classe Carrinho e possui como
	 * propósito implementar as funcionalidades de locação e 
	 * devolução dos jogos e consoles.
	 */

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

	//! O construtor de um objeto do tipo Aluguel.
    /*! O construtor dessa classe recebe um objeto do tipo Carrinho
     * e um objeto do tipo Funcionario. Esse construtor trata uma exceção
     * para cancelamento e retorna uma mensagem.
    */
	
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
	
	 //! Método que retorna o status do aluguel.
    /*!
     * Esse método verifica se o aluguel foi cancelado(-1), devolvido(0)
     * ou em andamento(1) e possui um valor de retorno específico
     * para cada situação.
    */
	
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

	 //! Método para retornar um funcionário.
    /*!
    */
	
	public Funcionario getFuncionario() {
		return funcionario;
	}

	 //! Método para retornar um id de aluguel.
    /*!
    */
	
	public int getId() {
		return id;
	}

	 //!Esse método retorna o objeto do tipo Carrinho 
    /*!	que está relacionado ao aluguel.
    */
	
	public Carrinho getCompra() {
		return compra;
	}

	 //!Retorna o objeto do tipo Cliente que está
    /*! relacionado ao aluguel.
    */
	
	public Cliente getCliente() {
		return cliente;
	}

	 //! Método que retorna número de itens no aluguel.
    /*!
    */
	
	public int getNum_itens() {
		return num_itens;
	}

	 //! Método que retorna o número de consoles no aluguel.
    /*!
    */
	
	public int getNum_consoles() {
		return num_consoles;
	}

	 //! Método que retorna número de jogos no aluguel.
    /*!
    */
	
	public int getNum_jogos() {
		return num_jogos;
	}

	 //!Método que retorna número de dias decorridos
    /*! do aluguel.
    */
	
	public int getDias_alugado() {
		return dias_alugado;
	}

	 //! Método que retorna o preço do aluguel.
    /*!
    */
	
	public double getPreco() {
		return preco_aluguel;
	}

	 //! Método que retorna uma data da classe Calendar.
    /*!
    */
	
	public Calendar getData() {
		return data;
	}

	 //! Método que retorna uma lista de consoles:
    /*!  ArrayList<Console>
    */
	
	public ArrayList<Console> getConsoles() {
		return consoles;
	}
	
	 //! Método que retorna uma lista de jogos:
    /*!  ArrayList<Jogo>
    */

	public ArrayList<Jogo> getJogos() {
		return jogos;
	}
	
	 //!Método que retorna o valor que indica
    /*! se o aluguem foi devolvido (1) ou não (0).
    */

	public int getDevolvido() {
		return devolvido;
	}

	 //!Método que atualiza se o aluguel foi
    /*! devolvido.
    */
	
	public void setDevolvido(int devolvido) {
		this.devolvido = devolvido;
	}

	 //!Método que atribui ao aluguel um funcionário
    /*! responsável.
    */
	
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	 //! Retorna se o item foi cancelado.
    /*!
    */
	
	public int getCancelado() {
		return cancelado;
	}

	 //!Método que atualiza se o aluguel
    /*! for cancelado.
    */
	
	public void setCancelado(int cancelado) {
		this.cancelado = cancelado;
	}
	
	 //!Método devolucao() atualiza o valor do
    /*! atributo "devolvido" para 1, indicando que
     *  a devolução foi feita. 
    */
	
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
	
	 //!Esse Método atualiza a quantidade dos itens
    /*! nos estoques.
     * 
     *  É feita a contagem dos consoles e dos jogos nos estoques e
     *  lança exceções para lidar com esses valores.
    */
	
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

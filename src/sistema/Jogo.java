package sistema;
import java.util.*;

/*! \ Classe Jogo extende a classe abstrata
 *   Produto
 *
 *  Essa classe é uma especialização da classe abstrata
 *  Produto, assim como é a classe Console. Dessa forma,
 *  ela faz Override do método abstrato getPreco() e 
 *  serve para representar os jogos para locação.
 */

public class Jogo extends Produto{
	private int id;
	private double preco_jogo;
	private Console console;
	private double taxa;
	
	 //! O construtor da classe Jogo herda os atributos 
    /*! gerais de Produto e também recebe um id e um console
     *  atribuído ao jogo.
     *
     * Quando um objeto do tipo Jogo é instanciado, automatica-
     * mente é adicionado à lista de jogos ArraiList<Jogo>
     * pelo método addToConsoleList().
    */
	
	public Jogo(String nome, double preco, int quantidade,
			int id, Console console) {
		
		super(nome, preco, quantidade);
		this.id = id;
		this.console = console;
		this.taxa = 0.10;
		addToConsoleList(this);
	}
	
	//! Método sobreposto da classe abstrata Produto.
    /*!
    */

	@Override
	public double getPreco() {
		return preco + getBasePrice();
	}
	
	//! Retorna o jogo.
    /*!
    */
	
	public Jogo getJogo() {
		return this;
	}

	//! Retorna o id do jogo.
    /*!
    */
	
	public int getId() {
		return id;
	}

	//! Dá ao jogo um id.
    /*!
    */
	
	public void setId(int id) {
		this.id = id;
	}

	//! Retorna o preço do jogo.
    /*!
    */
	
	public double getPreco_jogo() {
		return preco_jogo;
	}

	//! Atribui um valor ao preço do jogo.
    /*!
    */
	
	public void setPreco_jogo(double preco_jogo) {
		this.preco_jogo = preco_jogo;
	}
	
	//! Retorna o console ao qual pertence
    /*! o jogo.
    */
	
	public Console getConsole() {
		return console;
	}
	
	//! Define e retorna o preço base de um
    /*! jogo
     *
     * Calcula o preço base do jogo de acordo com
     * a taxa estabelecida pela loja e o preço do
     * console.
    */
	
	private double getBasePrice() {
		return (getConsole().getPreco() * this.getTaxa());
	}
	
	//! Retorna a taxa que a loja coloca
    /*! sobre o preço dos produtos.
    */
	
	public double getTaxa() {
		return taxa;
	}

	//! Atribui um valor para a taxa dos
    /*! produtos.
    */
	
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	//! Atribui um objeto do tipo Console
    /*! ao objeto do tipo Jogo em questão.
    */
	
	public void setConsole(Console console) {
		this.console = console;
	}

	//! Esse método instancia uma List<Jogo> e 
	/*!	adiciona o objeto do tipo Jogo na lista.
    */
	
	private void addToConsoleList(Jogo jogo) {
		List<Jogo> lista = this.getConsole().getJogosConsole();
		lista.add(jogo);
	}
}

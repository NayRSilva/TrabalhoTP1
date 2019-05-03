package sistema;

/*! \brief Essa é uma classe abstrata para a impletanção 
 * 			
 *         
 *		Essa classe abstrata será usada para impletentar as classes Console
 *		e Jogo, que herdam atributos e métodos desta classe abtrata de tipo Produto.
 */

public abstract class Produto {
	private String nome;
	protected double preco;
	private int quantidade;
	private int quantidade_livre;
	
    //!  Construtor Abstrato.
    /*!
      O construtor da classe Produto, deve receber um nome, preco e quantidade 
      com seus respectivos tipos, que serão usados para iniciar um objeto de uma classe
      que implemente esta classe abstrata.
    */
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.quantidade_livre = quantidade;			
	}
	
    //!  Método Abstrato.
    /*!
      Este método abstrato deve ser sobrescrito pelas classes filhas.
    */
	public abstract double getPreco();
	
    //! Método.
    /*!
      Este método retorna o nome do produto.
    */
	public String getNome() {
		return nome;
	}
    //! Método.
    /*!
      Este método recebe uma String, e altera o atributo nome para tal.
    */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
    //! Método.
    /*!
      Este método recebe um double, e altera o atributo preco para tal.
    */
	public void setPreco(double preco) {
		this.preco = preco;
	}
    //! Método.
    /*!
      Este método retorna a quantidade de produtos cadastrados.
    */
	public int getQuantidade() {
		return quantidade;
	}
    //! Método.
    /*!
      Este método recebe um inteiro, e altera o atributo quantidade para tal.
    */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
    //! Método.
    /*!
      Este método retorna a quantidade de produtos livres.
    */
	public int getQuantidade_livre() {
		return quantidade_livre;
	}
    //! Método.
    /*!
      Este método recebe um inteiro, e altera o atributo quantidade livre para tal.
    */
	public void setQuantidade_livre(int quantidade_livre) {
		this.quantidade_livre = quantidade_livre;
	}

	
}
package sistema;

	/*! \brief Classe Funcionário derivada da classe
 *         abstrata Pessoa.
 *
 *  Essa classe implementa os Funcionários da loja,
 *  herdando os atributos e métodos da classe
 *  abstrata Pessoa
 */

public class Funcionario extends Pessoa{
	private int id;
	
	//! Construtor da classe Funcionario
    /*!
     *  Esse construtor herda nome, email, telefone, rg e cpf.
     * da classe abstrata Pessoa. 
     *  O id do funcionário é inicializado aqui.
    */
	
	public Funcionario(String nome, String email, 
			int telefone, int rg, int cpf, int id) {
		super(nome, email, telefone, rg, cpf);
		this.id = id;
	}

	 //! Esse método retorna o id do funcionário
    /*!
    */
	
	public int getId() {
		return id;
	}

	 //! Esse método recebe um long e armazena no atributo
    /*!  id do funcionário.
    */
	
	public void setId(int id) {
		this.id = id;
	}
}

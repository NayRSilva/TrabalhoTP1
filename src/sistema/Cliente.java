package sistema;

/*! \Classe Cliente derivada da
 * 			classe abstrata Pessoa
 *
 *  Essa classe implementa os clientes da loja, herdando os 
 *  atributos e métodos da classe abstrata Pessoa.
 */

public class Cliente extends Pessoa {
	private long id;
	
	//! Construtor Cliente.
    /*!
     * 	Essa classe herda nome, email, telefone, rg, cpf da 
     *  classe abstrata Pessoa. O id é inicializado aqui
     */	
	
	public Cliente(String nome, String email, int telefone,
			int rg, int cpf, long id) {
		super(nome, email, telefone, rg, cpf);
		this.id = id;
	}

	//! Esse método retorna o id do objeto.
    /*!
    */
	
	public long getId() {
		return id;
	}

	//! Esse método recebe um long que será armazenado
	/*!	em id do cliente.
    */
	
	public void setId(long id) {
		this.id = id;
	}
	
}

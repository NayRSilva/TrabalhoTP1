package sistema;

/*! \brief Essa é uma classe abstrata para a impletanção 
 * 			
 *         
 *		Essa classe abstrata será usada para impletentar as classes Cliente
 *		e Funcionario, que herdam atributos e métodos desta classe abtrata de tipo Pessoa.
 */

public abstract class Pessoa {
	private String nome; 		
	private String email; 		
	private int telefone; 		
	private int rg; 			
	private int cpf; 			
	
    //!  Construtor Abstrato.
    /*!
      O construtor da classe Pessoa, deve receber um nome, email, telefone, rg e cpf 
      com seus respectivos tipos que serão utilizados para iniciar um objeto que implemente
      esta classe abstrata.
    */
	public Pessoa (String nome, String email, int telefone, 
			int rg, int cpf) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.rg = rg;
		this.cpf = cpf;
	}

    //! Método.
    /*!
      Este método retorna o nome do objeto.
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
      Este método retorna o email do objeto.
    */
	public String getEmail() {
		return email;
	}

    //! Método.
    /*!
      Este método recebe uma String, e altera o atributo email para tal.
    */
	public void setEmail(String email) {
		this.email = email;
	}

    //! Método.
    /*!
      Este método retorna o telefone do objeto.
    */
	public int getTelefone() {
		return telefone;
	}

    //! Método.
    /*!
      Este método recebe um inteiro, e altera o atributo telefone para tal.
    */
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

    //! Método.
    /*!
      Este método retorna o rg do objeto.
    */
	public int getRg() {
		return rg;
	}

    //! Método.
    /*!
      Este método recebe um inteiro, e altera o atributo rg para tal.
    */
	public void setRg(int rg) {
		this.rg = rg;
	}

    //! A method.
    /*!
      Este método retorna o cpf.
    */
	public int getCpf() {
		return cpf;
	}

    //! Método.
    /*!
      Este método recebe um inteiro, e altera o atributo cpf para tal.
    */
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
}

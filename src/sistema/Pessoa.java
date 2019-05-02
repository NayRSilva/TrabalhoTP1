package sistema;

/*! \brief Brief description.
 *         Brief description continued.
 *
 *  Detailed description starts here.
 */

public abstract class Pessoa {
	private String nome; 		
	private String email; 		
	private int telefone; 		
	private int rg; 			
	private int cpf; 			
	
    //! A constructor.
    /*!
      A more elaborate description of the constructor.
    */
	public Pessoa (String nome, String email, int telefone, 
			int rg, int cpf) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.rg = rg;
		this.cpf = cpf;
	}

    //! A method.
    /*!
      A more elaborate description of the method.
    */
	public String getNome() {
		return nome;
	}
	
    //! A method.
    /*!
      A more elaborate description of the method.
    */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
    //! A method.
    /*!
      A more elaborate description of the method.
    */
	public String getEmail() {
		return email;
	}

    //! A method.
    /*!
      A more elaborate description of the method.
    */
	public void setEmail(String email) {
		this.email = email;
	}

    //! A method.
    /*!
      A more elaborate description of the method.
    */
	public int getTelefone() {
		return telefone;
	}

    //! A method.
    /*!
      A more elaborate description of the method.
    */
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

    //! A method.
    /*!
      A more elaborate description of the method.
    */
	public int getRg() {
		return rg;
	}

    //! A method.
    /*!
      A more elaborate description of the method.
    */
	public void setRg(int rg) {
		this.rg = rg;
	}

    //! A method.
    /*!
      A more elaborate description of the method.
    */
	public int getCpf() {
		return cpf;
	}

    //! A method.
    /*!
      A more elaborate description of the method.
    */
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
}

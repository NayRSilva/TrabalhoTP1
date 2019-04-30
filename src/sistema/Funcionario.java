package sistema;

public class Funcionario extends Pessoa{
	private int id;
	
	public Funcionario(String nome, String email, int telefone, int rg, int cpf, int id) {
		super(nome, email, telefone, rg, cpf);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

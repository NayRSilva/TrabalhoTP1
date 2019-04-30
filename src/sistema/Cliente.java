package sistema;

public class Cliente extends Pessoa {
	private long id;
	
	public Cliente(String nome, String email, int telefone,
			int rg, int cpf, long id) {
		super(nome, email, telefone, rg, cpf);
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}

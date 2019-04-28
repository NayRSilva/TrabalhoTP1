package sistema;

public class Console extends Produto{

	private int id;
	
	public Console(String nome, double preco, int quantidade, int quantidade_livre,
			int id) {
		
		super(nome, preco, quantidade, quantidade_livre);
		this.id = id;
	}
	
	@Override
	public double estabelece_preco(double preco) {
		return preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}

package Produto;

class Jogo extends Produto{
	private int id;
	private double preco_jogo;
	private Plataforma plataforma;
	
	public Jogo(String nome, double preco, int quantidade, int quantidade_livre,
			int id, double preco_jogo, Plataforma plataforma) {
		
		super(nome, preco, quantidade, quantidade_livre);
		this.id = id;
		this.plataforma = plataforma;
	}

	@Override
	public double estabelece_preco(double preco_jogo, Plataforma plataforma) {
		return getPreco_jogo() + plataforma.getPreco();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPreco_jogo() {
		return preco_jogo;
	}

	public void setPreco_jogo(double preco_jogo) {
		this.preco_jogo = preco_jogo;
	}
	
	
}

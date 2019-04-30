package sistema;

public abstract class Produto {
	private String nome;
	protected double preco;
	private int quantidade;
	private int quantidade_livre;
	
	// Construtor "abstrato".
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.quantidade_livre = quantidade;			
	}
	
	// Método abstrato.
	public abstract double getPreco();
	
	// Getters & Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getQuantidade_livre() {
		return quantidade_livre;
	}

	public void setQuantidade_livre(int quantidade_livre) {
		this.quantidade_livre = quantidade_livre;
	}

	
}

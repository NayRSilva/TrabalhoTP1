package System;

public class Plataforma {
	
	private String nome;
	private double preco;
	private long id;

	public Plataforma(String nomeplat, double platpreco, long platid) {
		this.nome = nomeplat;
		this.preco = platpreco;
		this.id = platid;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}

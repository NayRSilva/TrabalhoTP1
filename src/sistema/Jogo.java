package sistema;
import java.util.*;

public class Jogo extends Produto{
	private int id;
	private double preco_jogo;
	private Console console;
	
	public Jogo(String nome, double preco, int quantidade, int quantidade_livre,
			int id, Console console) {
		
		super(nome, preco, quantidade, quantidade_livre);
		this.id = id;
		this.console = console;
		addToConsoleList(this);
	}

	@Override
	public double getPreco() {
		return preco + getBasePrice();
	}
	
	public Jogo getJogo() {
		return this;
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
	
	public Console getConsole() {
		return console;
	}
	
	private double getBasePrice() {
		return (getConsole().getPreco() * 0.1);
	}
	
	private void addToConsoleList(Jogo jogo) {
		List<Jogo> lista = this.getConsole().getJogosConsole();
		lista.add(jogo);
	}
}

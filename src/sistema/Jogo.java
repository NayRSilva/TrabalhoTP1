package sistema;
import java.util.*;

public class Jogo extends Produto{
	private int id;
	private double preco_jogo;
	private Console console;
	private double taxa;
	
	public Jogo(String nome, double preco, int quantidade,
			int id, Console console) {
		
		super(nome, preco, quantidade);
		this.id = id;
		this.console = console;
		this.taxa = 0.10;
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
		return (getConsole().getPreco() * this.getTaxa());
	}
	
	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public void setConsole(Console console) {
		this.console = console;
	}

	private void addToConsoleList(Jogo jogo) {
		List<Jogo> lista = this.getConsole().getJogosConsole();
		lista.add(jogo);
	}
}

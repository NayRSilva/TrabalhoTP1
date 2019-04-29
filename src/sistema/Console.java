package sistema;
import java.util.*;

public class Console extends Produto{
	private ArrayList<Jogo> lista;
	private int id;
	
	public Console(String nome, double preco, int quantidade, int quantidade_livre,
			int id) {
		
		super(nome, preco, quantidade, quantidade_livre);
		this.id = id;
		lista = new ArrayList<Jogo>();	
	}
	
	@Override
	public double getPreco() {
		return preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Jogo> getJogosConsole(){
		return lista;
	}
	
	public int getJogosConsoleNomes() {
	    for(Jogo x:this.getJogosConsole()){  
	        System.out.println(x.getJogo().getNome());  
	    }
	    return 1;
	}
	
}

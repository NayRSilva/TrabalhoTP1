package sistema;
import java.util.*;

public class Console extends Produto{
	private int id;
	private ArrayList<Jogo> lista_jogos;
	
	public Console(String nome, double preco, int quantidade,
			int id) {
		
		super(nome, preco, quantidade);
		this.id = id;
		lista_jogos = new ArrayList<Jogo>();	
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
		return lista_jogos;
	}
	
	public void getJogosConsoleNomes() {
	    for(Jogo x:this.getJogosConsole()){  
	        System.out.println(x.getJogo().getNome());  
	    }
	}
	
}

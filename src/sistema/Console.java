package sistema;
import java.util.*;

/*! \ Classe Console extende a classe abstrata
 *   produto
 *
 *  Essa classe é uma especialização da classe abstrata
 *  Produto, assim como é a classe Jogo. Dessa forma,
 *  ela faz Override do método abstrato getPreco() e 
 *  serve para representar os consoles para locação.
 */

public class Console extends Produto{
	private int id;
	private ArrayList<Jogo> lista_jogos;
	
	//! O construtor de Console herda atributos
    /*! de Produto e também recebe um id e uma lista
     *  de jogos.  
    */
	
	public Console(String nome, double preco,
			int quantidade,
			int id) {
		
		super(nome, preco, quantidade);
		this.id = id;
		lista_jogos = new ArrayList<Jogo>();	
	}
	
	 //! Método abstrato definido em Produto
    /*!
    */
	
	@Override
	public double getPreco() {
		return preco;
	}
	
	 //! Retorna o id do console.
    /*!
    */
	
	public int getId() {
		return id;
	}
	
	 //! Dá um id ao console.
    /*!
    */
	
	public void setId(int id) {
		this.id = id;
	}
	
	 //!Retorna a lista de jogos do objeto
    /*! do tipo Console.
    */
	
	public ArrayList<Jogo> getJogosConsole(){
		return lista_jogos;
	}
	
	 //!Esse método imprime na tela a lista de jogos
    /*! relacionados ao console.
    */
	
	public void getJogosConsoleNomes() {
	    for(Jogo x:this.getJogosConsole()){  
	        System.out.println(x.getJogo().getNome());  
	    }
	}
	
}

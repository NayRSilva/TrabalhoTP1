package main;
import sistema.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello");
		Cliente one = new Cliente("One", "one@one", 123, 321, 456, 789);
		System.out.println(one.getNome());
		System.out.println(one.getEmail());
		System.out.println(one.getTelefone());
		System.out.println(one.getRg());
		System.out.println(one.getCpf());
		System.out.println(one.getId());
	}
	
}

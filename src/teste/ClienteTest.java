package teste;
import sistema.Cliente;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ClienteTest {

	String nome = "Cliente";
	String email = "cliente@cliente";
	int telefone = 999999999;
	int rg = 000001;
	int cpf = 001000100;
	int id = 00001;
	
	Cliente _clienteTest = new Cliente (nome, email, telefone,
			rg, cpf, id);
	
   @Test
   public void testCliente_getNome() {	
	   assertEquals(nome, _clienteTest.getNome());     
   }
   @Test
   public void testCliente_getEmail() {	
	   assertEquals(email, _clienteTest.getEmail());     
   }
   @Test
   public void testCliente_getTelefone() {	
	   assertEquals(telefone, _clienteTest.getTelefone());     
   }
   @Test
   public void testCliente_getRg() {	
	   assertEquals(rg, _clienteTest.getRg());     
   }
   @Test
   public void testCliente_getCpf() {	
	   assertEquals(cpf, _clienteTest.getCpf());     
   }
   @Test
   public void testCliente_getId() {	
	   assertEquals(id, _clienteTest.getId());     
   }
}

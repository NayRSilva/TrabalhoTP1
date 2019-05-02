package teste;
import sistema.Funcionario;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FuncionarioTest {

	String nome = "Funcionario";
	String email = "funcionario@funcionario";
	int telefone = 66666666;
	int rg = 111110;
	int cpf = 11111101;
	int id = 11110;
	
	Funcionario _funcionarioTest = new Funcionario (nome, email, telefone,
			rg, cpf, id);

	   @Test
	   public void testFuncionario_getNome() {	
		   assertEquals(nome, _funcionarioTest.getNome());     
	   }
	   @Test
	   public void testFuncionario_getEmail() {	
		   assertEquals(email, _funcionarioTest.getEmail());     
	   }
	   @Test
	   public void testFuncionario_getTelefone() {	
		   assertEquals(telefone, _funcionarioTest.getTelefone());     
	   }
	   @Test
	   public void testFuncionario_getRg() {	
		   assertEquals(rg, _funcionarioTest.getRg());     
	   }
	   @Test
	   public void testFuncionario_getCpf() {	
		   assertEquals(cpf, _funcionarioTest.getCpf());     
	   }
	   @Test
	   public void testFuncionario_getId() {	
		   assertEquals(id, _funcionarioTest.getId());     
	   }

}

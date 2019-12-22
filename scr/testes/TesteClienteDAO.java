package testes;

import model.entities.Cliente;
import control.ClienteBLL;

public class TesteClienteDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente();
		ClienteBLL clibll = new ClienteBLL();
		
		/*cliente.setCliemail("julianne@outlook.com");
		cliente.setClinome("Julianne");
		cliente.setClisenha("juju");
		cliente.setClitelefone("44120091");
		
		clibll.insertCliente(cliente);*/
		
		/*cliente.setClinome("Jujuli");
		cliente.setCliid(3);
		clibll.updateCliente(cliente);*/
		
		/*cliente.setCliid(3);
		clibll.deleteCliente(cliente);*/
		
		clibll.selectCliente("Ju");		
		
		
	}

}

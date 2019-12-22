package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.dao.ClienteDAO;
import model.entities.Cliente;

public class ClienteBLL {

	ClienteDAO dao = new ClienteDAO();
	
	public boolean insertCliente(Cliente cli) {
		
		try {
			
			return dao.insertCliente(cli);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}
		
	public boolean updateCliente(Cliente cli) {
		
		try {
			
			return dao.updateCliente(cli);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean deleteCliente(Cliente cli) {
		
		try {
			
			return dao.deleteCliente(cli);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}
	
	public ArrayList<Cliente> selectCliente(String filter) {
		
		try {
			
			return dao.selectCliente(filter);
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	
	}
}

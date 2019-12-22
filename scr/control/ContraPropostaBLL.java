package control;

import java.sql.SQLException;
import java.util.ArrayList;

import model.dao.ContraPropostaDao;
import model.entities.Cliente;
import model.entities.ContraProposta;

public class ContraPropostaBLL {
	
	ContraPropostaDao cpDao = new ContraPropostaDao();

	public boolean insertContraProposta(ContraProposta cp) {
		try {
			return cpDao.insertContraProposta(cp);
					
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}
	
	public ArrayList<ContraProposta> selectPropostasCliente(Cliente cli){
		try {
			return cpDao.listarPropostasCliente(cli);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}
}

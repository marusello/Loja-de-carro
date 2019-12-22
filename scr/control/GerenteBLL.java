package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.dao.GerenteDAO;
import model.entities.Gerente;

public class GerenteBLL {
	GerenteDAO cd = new GerenteDAO();

	
	public boolean insertGerente(Gerente gerente) throws SQLException {
		try {
					return cd.insertGerente(gerente);
			
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return false;
	}
	
	public boolean deleteGerente(Gerente gerente) throws SQLException {
		try {
			return cd.deleteGerente(gerente);
	
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	
	}
	
	public boolean updateGerente(Gerente gerente) throws SQLException {
		try {
			return cd.updateGerente(gerente);
	
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
		
	}
	
	public ArrayList<Gerente> selectGerente(String filtro) throws SQLException{
		try {
			return cd.selectGerente(filtro);
	
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
		
	}
}

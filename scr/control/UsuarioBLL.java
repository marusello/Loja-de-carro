package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.dao.UsuarioDAO;
import model.entities.Usuario;

public class UsuarioBLL {
	UsuarioDAO cd = new UsuarioDAO();

	
	public boolean insertUsuario(Usuario usuario) throws SQLException {
		try {
					return cd.insertUsuario(usuario);
			
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return false;
	}
	
	public boolean deleteUsuario(Usuario usuario) {
		try {
			return cd.deleteUsuario(usuario);
	
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	
	}
	
	public boolean updateUsuario(Usuario usuario) throws SQLException {
		try {
			return cd.updateUsuario(usuario);
	
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
		
	}
	
	public ArrayList<Usuario> selectUsuario(String filter) {
		try {
			return cd.selectUsuario(filter);
	
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
		
	}
}

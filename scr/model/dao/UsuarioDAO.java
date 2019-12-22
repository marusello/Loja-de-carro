package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.entities.Usuario;

public class UsuarioDAO {
	public boolean insertUsuario(Usuario usu) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = MySqlConnection.getConnection();
		
			String query = "{call inserir_Usuario(?, ?, ?)}"; 
		
				ps = conn.prepareStatement(query);
		
				ps.setString(1, usu.getUsuLogin());
				ps.setString(2, usu.getUsuSenha());
				ps.setString(3, usu.getUsuCargo());
		
				if(ps.executeUpdate() != 0) 
					return true;
		
			}catch (SQLException e) {
				e.printStackTrace();
			}finally {
				conn.close();
			}
			return false;
		}
		
		public boolean updateUsuario(Usuario usu) throws SQLException {
			Connection conn = null;
			PreparedStatement ps = null;
		
			try {
				
				conn = MySqlConnection.getConnection();
				String query = "{call alterar_Usuario(?, ?, ?, ?)}"; 
				
				ps = conn.prepareStatement(query);
		
				ps.setInt(1, usu.getUsuId());
				ps.setString(2, usu.getUsuLogin());
				ps.setString(3, usu.getUsuSenha());
				ps.setString(4, usu.getUsuCargo());
				
				if(ps.executeUpdate() != 0)
					return true;
		
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				conn.close();
			}
			return false;
		}
		
		public boolean deleteUsuario(Usuario usu) throws SQLException {
			Connection conn = null;
			PreparedStatement ps = null;
			try {
				
				String query = "{call excluir_Usuario(?)}"; 
		
			conn = MySqlConnection.getConnection();
			ps = conn.prepareStatement(query);		
		
			ps.setInt(1, usu.getUsuId());
		
			if(ps.executeUpdate() != 0)
				return true;
		
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				conn.close();
			}
			return false;
		}
		
		public ArrayList<Usuario> selectUsuario(String filter) throws SQLException {
			Connection conn = null;
			PreparedStatement ps = null;
		
			ArrayList<Usuario> listUsuario = new ArrayList<>();
			Usuario usu = new Usuario();
		
			try {
				String query = "{call buscar_Usuario(?)}"; 
		
				conn = MySqlConnection.getConnection();
				ps = conn.prepareStatement(query);		
		
				ps.setString(1, filter);
		
				ResultSet result = ps.executeQuery();
				
				while(result.next()) {
					usu = new Usuario();
		
					usu.setUsuId(result.getInt("idUsuario"));
					usu.setUsuLogin(result.getString("login"));
					usu.setUsuCargo(result.getString("cargo"));
					
					listUsuario.add(usu);
				}
		
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				conn.close();
			}
		
			return listUsuario;
		
		}
		
		public ArrayList<Usuario> selectUsuario() throws SQLException {
			return selectUsuario("");
		}

}

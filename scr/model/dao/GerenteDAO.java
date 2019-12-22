package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.entities.Gerente;

public class GerenteDAO {
	public boolean insertGerente(Gerente ger) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = MySqlConnection.getConnection();
		
			String query = "{call inserir_Gerente(?, ?)}"; 
		
				ps = conn.prepareStatement(query);
		
				ps.setString(1, ger.getGernome());
				ps.setString(2, ger.getGerregistro());
		
				if(ps.executeUpdate() != 0) 
					return true;
		
			}catch (SQLException e) {
				e.printStackTrace();
			}finally {
				conn.close();
			}
			return false;
		}
		
		public boolean updateGerente(Gerente ger) throws SQLException {
			Connection conn = null;
			PreparedStatement ps = null;
		
			try {
				
				conn = MySqlConnection.getConnection();
				String query = "{call alterar_Gerente(?, ?, ?)}"; 
				
				ps = conn.prepareStatement(query);
		
				ps.setInt(1, ger.getGerid());
				ps.setString(2, ger.getGernome());
				ps.setString(3, ger.getGerregistro());
				
				if(ps.executeUpdate() != 0)
					return true;
		
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				conn.close();
			}
			return false;
		}
		
		public boolean deleteGerente(Gerente ger) throws SQLException {
			Connection conn = null;
			PreparedStatement ps = null;
			try {
				
				String query = "{call excluir_Gerente(?)}"; 
		
			conn = MySqlConnection.getConnection();
			ps = conn.prepareStatement(query);		
		
			ps.setInt(1, ger.getGerid());
		
			if(ps.executeUpdate() != 0)
				return true;
		
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				conn.close();
			}
			return false;
		}
		
		public ArrayList<Gerente> selectGerente(String filter) throws SQLException {
			Connection conn = null;
			PreparedStatement ps = null;
		
			ArrayList<Gerente> listGerente = new ArrayList<>();
			Gerente ger = new Gerente();
		
			try {
				String query = "{call buscar_Gerente(?)}"; 
		
				conn = MySqlConnection.getConnection();
				ps = conn.prepareStatement(query);		
		
				ps.setString(1, filter);
		
				ResultSet result = ps.executeQuery();
				
				while(result.next()) {
					ger = new Gerente();
		
					ger.setGerid(result.getInt("gerid"));
					ger.setGernome(result.getString("gernome"));
					ger.setGerregistro(result.getString("gerregistro"));
					
					listGerente.add(ger);
				}
		
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				conn.close();
			}
		
			return listGerente;
		
		}
		
		public ArrayList<Gerente> selectGerente() throws SQLException {
			return selectGerente("");
		}

}

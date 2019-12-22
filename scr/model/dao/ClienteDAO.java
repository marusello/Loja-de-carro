package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.entities.Cliente;

public class ClienteDAO {
	
	public boolean insertCliente(Cliente cli) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = MySqlConnection.getConnection();
		
			String query = "{call inserir_Cliente(?, ?, ?)}"; 
		
				ps = conn.prepareStatement(query);
		
				ps.setString(1, cli.getClinome());				
				ps.setString(2, cli.getCliemail());
				ps.setString(3, cli.getClitelefone());
				//ps.setString(4, cli.getClisenha());
		
				if(ps.executeUpdate() != 0) 
					return true;
		
			}catch (SQLException e) {
				e.printStackTrace();
			}finally {
				conn.close();
			}
			return false;
		}
		
		public boolean updateCliente(Cliente cli) throws SQLException {
			Connection conn = null;
			PreparedStatement ps = null;
		
			try {
				
				conn = MySqlConnection.getConnection();
				String query = "{call alterar_Cliente(?, ?, ?, ?, ?)}"; 
				
				ps = conn.prepareStatement(query);
		
				ps.setInt(1, cli.getCliid());
				ps.setString(2, cli.getClinome());
				ps.setString(3, cli.getClitelefone());
				ps.setString(4, cli.getCliemail());
				ps.setString(5, cli.getClisenha());
		
				if(ps.executeUpdate() != 0)
					return true;
		
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				conn.close();
			}
			return false;
		}
		
		public boolean deleteCliente(Cliente cli) throws SQLException {
			Connection conn = null;
			PreparedStatement ps = null;
			try {
				
				String query = "{call excluir_Cliente(?)}"; 
		
			conn = MySqlConnection.getConnection();
			ps = conn.prepareStatement(query);		
		
			ps.setInt(1, cli.getCliid());
		
			if(ps.executeUpdate() != 0)
				return true;
		
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				conn.close();
			}
			return false;
		}
		
		public ArrayList<Cliente> selectCliente(String filter) throws SQLException {
			Connection conn = null;
			PreparedStatement ps = null;
		
			ArrayList<Cliente> listCliente = new ArrayList<>();
			Cliente cli = new Cliente();
		
			try {
				String query = "{call buscar_Cliente(?)}"; 
		
				conn = MySqlConnection.getConnection();
				ps = conn.prepareStatement(query);		
		
				ps.setString(1, filter);
		
				ResultSet result = ps.executeQuery();
				
				while(result.next()) {
					cli = new Cliente();
		
					cli.setCliid(result.getInt("cliid"));
					cli.setClinome(result.getString("clinome"));
					cli.setCliemail(result.getString("cliemail"));
					cli.setClitelefone(result.getString("clitelefone"));
					
					
					listCliente.add(cli);
				}
		
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				conn.close();
			}
		
			return listCliente;
		
		}
		
		public ArrayList<Cliente> selectCliente() throws SQLException {
			return selectCliente("");
		}

}

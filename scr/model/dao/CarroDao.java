package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.entities.Carros;

public class CarroDao {

	public boolean insertCarros(Carros car) throws SQLException {
		
	Connection conn = null;
	PreparedStatement ps = null;
	try {
		conn = MySqlConnection.getConnection();
	
		String query = "{call inserir_Carro(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}"; 
	
			ps = conn.prepareStatement(query);
	
			ps.setString(1, car.getModelo());
			ps.setString(2, car.getMarca());
			ps.setInt(3, car.getAno());
			ps.setString(4, car.getCidade());
			ps.setString(5, car.getEstado());
			ps.setString(6, car.getPlaca());
			ps.setString(7, car.getChassi());
			ps.setDouble(8, car.getKm());
			ps.setDouble(9, car.getPreco());
			ps.setString(10, car.getCombustivel());
	
			if(ps.executeUpdate() != 0) 
				return true;
	
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			conn.close();
			
		}
	
		return false;
	}
	
	public boolean updateCarros(Carros car) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
	
		try {
	
			String query = "{call alterar_Carro(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}"; 
	
			conn = MySqlConnection.getConnection();
			ps = conn.prepareStatement(query);		
	
			ps.setInt(1, car.getId());
			ps.setString(2, car.getModelo());
			ps.setString(3, car.getMarca());
			ps.setInt(4, car.getAno());
			ps.setString(5, car.getCidade());
			ps.setString(6, car.getEstado());
			ps.setString(7, car.getPlaca());
			ps.setString(8, car.getChassi());
			ps.setDouble(9, car.getKm());
			ps.setDouble(10, car.getPreco());
			ps.setString(11, car.getCombustivel());
	
			if(ps.executeUpdate() != 0)
				return true;
	
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			conn.close();
		}
		return false;
	}
	
	public boolean deleteCarros(Carros car) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			String query = "{call excluir_Carro(?)}"; 
	
		conn = MySqlConnection.getConnection();
		ps = conn.prepareStatement(query);		
	
		ps.setInt(1, car.getId());
	
		if(ps.executeUpdate() != 0)
			return true;
	
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			conn.close();
		}
		return false;
	}
	
	
	public ArrayList<Carros> selectCarros(String filter) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
	
		ArrayList<Carros> listCarros = new ArrayList<>();
		Carros car = new Carros();
	
		try {
			String query = "{call buscar_Carros(?)}"; 
	
			conn = MySqlConnection.getConnection();
			ps = conn.prepareStatement(query);		
	
			ps.setString(1, filter);
	
			ResultSet result = ps.executeQuery();
			
			while(result.next()) {
				car = new Carros();
	
				car.setId(result.getInt("id"));
				car.setModelo(result.getString("modelo"));
				car.setMarca(result.getString("marca"));
				car.setAno(result.getInt("ano"));
				car.setCidade(result.getString("cidade"));
				car.setEstado(result.getString("estado"));
				//car.setPlaca(result.getString("placa"));
				//car.setChassi(result.getString("chassi"));
				car.setKm(result.getDouble("km"));
				//car.setPreco(result.getDouble("preco"));
				car.setCombustivel(result.getString("combustivel"));
				
				listCarros.add(car);
			}
	
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			conn.close();
		}
	
		return listCarros;
	
	}
	
	public ArrayList<Carros> selectCarros() throws SQLException {
		return selectCarros("");
	}
	
	public ArrayList<Carros> selectCarrosPromo(String filter) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
	
		ArrayList<Carros> listCarros = new ArrayList<>();
		Carros car = new Carros();
	
		try {
			String query = "{call buscar_Carros_Promo(?)}"; 
	
			conn = MySqlConnection.getConnection();
			ps = conn.prepareStatement(query);		
	
			ps.setString(1, filter);
	
			ResultSet result = ps.executeQuery();
			
			while(result.next()) {
				car = new Carros();
	
				car.setId(result.getInt("id"));
				car.setModelo(result.getString("modelo"));
				car.setMarca(result.getString("marca"));
				car.setAno(result.getInt("ano"));
				car.setCidade(result.getString("cidade"));
				car.setEstado(result.getString("estado"));
				car.setPlaca(result.getString("placa"));
				car.setChassi(result.getString("chassi"));
				car.setKm(result.getDouble("km"));
				car.setPreco(result.getDouble("preco"));
				car.setCombustivel(result.getString("combustivel"));
				
				listCarros.add(car);
			}
	
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			conn.close();
		}
	
		return listCarros;
	
	}

}

package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.entities.Carros;
import model.entities.Cliente;
import model.entities.ContraProposta;

public class ContraPropostaDao {

	public boolean insertContraProposta(ContraProposta proposta) throws SQLException {
	Connection conn = null;
	PreparedStatement ps = null;
	
	try {
		conn = MySqlConnection.getConnection();
	
		String query = "insert into contra_proposta(valor) values(?)"; 
	
			ps = conn.prepareStatement(query);
	
			ps.setDouble(1, proposta.getValor());
			
			if(ps.executeUpdate() != 0) 
				return true;
	
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			conn.close();
		}
		return false;
	}
	
	public ArrayList<ContraProposta> listarPropostasCliente(Cliente cliente) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		
		ArrayList<ContraProposta> listPropostas = new ArrayList<>();
		ContraProposta proposta = new ContraProposta();
		
		try {
			conn = MySqlConnection.getConnection();
		
			String query = "{select valor, Ca.modelo, Ca.marca, Ca.ano, Cl.nome from contra_proposta "
					+ "inner join carro Ca on idCarro = id"
					+ "inner join cliente Cl on idCliente = cliid"
					+ "where idCliente = ? }"; 
		
				ps = conn.prepareStatement(query);
		
				ps.setInt(1, cliente.getCliid());
				
				ResultSet result = ps.executeQuery();
				
				while(result.next()) {
					proposta = new ContraProposta();
					
					Cliente cli = new Cliente();
					Carros car = new Carros();
					
					cli.setCliid(result.getInt("idCliente"));
					car.setId(result.getInt("idCarro"));
					
					//proposta.setCliente(cli);
					//proposta.setCarro(car);
					proposta.setValor(result.getInt("valor"));
					
					listPropostas.add(proposta);
				}

		
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				conn.close();
			}
			return listPropostas;
		}
}
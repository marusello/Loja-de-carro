package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.entities.Cidades;

public class CidadesDao {
	
	public List<Cidades> getACCidades() {
		Connection connection = MySqlConnection.getConnection();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM lojacarros.municipio WHERE uf='AC'");
			List<Cidades> cidades = new ArrayList<Cidades>();
			while(rs.next()) {
				Cidades cid = toCidades(rs);
				cidades.add(cid);
			}
			return cidades;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public List<Cidades> getALCidades() {
		Connection connection = MySqlConnection.getConnection();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM lojacarros.municipio WHERE uf='AL'");
			List<Cidades> cidades = new ArrayList<Cidades>();
			while(rs.next()) {
				Cidades cid = toCidades(rs);
				cidades.add(cid);
			}
			return cidades;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public List<Cidades> getAMCidades() {
		Connection connection = MySqlConnection.getConnection();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM lojacarros.municipio WHERE uf='AM'");
			List<Cidades> cidades = new ArrayList<Cidades>();
			while(rs.next()) {
				Cidades cid = toCidades(rs);
				cidades.add(cid);
			}
			return cidades;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public List<Cidades> getAPCidades() {
		Connection connection = MySqlConnection.getConnection();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM lojacarros.municipio WHERE uf='AP'");
			List<Cidades> cidades = new ArrayList<Cidades>();
			while(rs.next()) {
				Cidades cid = toCidades(rs);
				cidades.add(cid);
			}
			return cidades;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public List<Cidades> getBACidades() {
		Connection connection = MySqlConnection.getConnection();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM lojacarros.municipio WHERE uf='BA'");
			List<Cidades> cidades = new ArrayList<Cidades>();
			while(rs.next()) {
				Cidades cid = toCidades(rs);
				cidades.add(cid);
			}
			return cidades;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public List<Cidades> getCECidades() {
		Connection connection = MySqlConnection.getConnection();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM lojacarros.municipio WHERE uf='CE'");
			List<Cidades> cidades = new ArrayList<Cidades>();
			while(rs.next()) {
				Cidades cid = toCidades(rs);
				cidades.add(cid);
			}
			return cidades;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public List<Cidades> getDFCidades() {
		Connection connection = MySqlConnection.getConnection();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM lojacarros.municipio WHERE uf='DF'");
			List<Cidades> cidades = new ArrayList<Cidades>();
			while(rs.next()) {
				Cidades cid = toCidades(rs);
				cidades.add(cid);
			}
			return cidades;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public List<Cidades> getESCidades() {
		Connection connection = MySqlConnection.getConnection();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM lojacarros.municipio WHERE uf='ES'");
			List<Cidades> cidades = new ArrayList<Cidades>();
			while(rs.next()) {
				Cidades cid = toCidades(rs);
				cidades.add(cid);
			}
			return cidades;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public List<Cidades> getGOCidades() {
		Connection connection = MySqlConnection.getConnection();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM lojacarros.municipio WHERE uf='GO'");
			List<Cidades> cidades = new ArrayList<Cidades>();
			while(rs.next()) {
				Cidades cid = toCidades(rs);
				cidades.add(cid);
			}
			return cidades;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public List<Cidades> getMACidades() {
		Connection connection = MySqlConnection.getConnection();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM lojacarros.municipio WHERE uf='MA'");
			List<Cidades> cidades = new ArrayList<Cidades>();
			while(rs.next()) {
				Cidades cid = toCidades(rs);
				cidades.add(cid);
			}
			return cidades;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public List<Cidades> getMGCidades() {
		Connection connection = MySqlConnection.getConnection();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM lojacarros.municipio WHERE uf='MG'");
			List<Cidades> cidades = new ArrayList<Cidades>();
			while(rs.next()) {
				Cidades cid = toCidades(rs);
				cidades.add(cid);
			}
			return cidades;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public List<Cidades> getMSCidades() {
		Connection connection = MySqlConnection.getConnection();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM lojacarros.municipio WHERE uf='MS'");
			List<Cidades> cidades = new ArrayList<Cidades>();
			while(rs.next()) {
				Cidades cid = toCidades(rs);
				cidades.add(cid);
			}
			return cidades;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public List<Cidades> getMTCidades() {
		Connection connection = MySqlConnection.getConnection();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM lojacarros.municipio WHERE uf='MT'");
			List<Cidades> cidades = new ArrayList<Cidades>();
			while(rs.next()) {
				Cidades cid = toCidades(rs);
				cidades.add(cid);
			}
			return cidades;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public List<Cidades> getPACidades() {
		Connection connection = MySqlConnection.getConnection();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM lojacarros.municipio WHERE uf='PA'");
			List<Cidades> cidades = new ArrayList<Cidades>();
			while(rs.next()) {
				Cidades cid = toCidades(rs);
				cidades.add(cid);
			}
			return cidades;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public List<Cidades> getPBCidades() {
		Connection connection = MySqlConnection.getConnection();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM lojacarros.municipio WHERE uf='PB'");
			List<Cidades> cidades = new ArrayList<Cidades>();
			while(rs.next()) {
				Cidades cid = toCidades(rs);
				cidades.add(cid);
			}
			return cidades;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public List<Cidades> getPECidades() {
		Connection connection = MySqlConnection.getConnection();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM lojacarros.municipio WHERE uf='PE'");
			List<Cidades> cidades = new ArrayList<Cidades>();
			while(rs.next()) {
				Cidades cid = toCidades(rs);
				cidades.add(cid);
			}
			return cidades;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public List<Cidades> getPICidades() {
		Connection connection = MySqlConnection.getConnection();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM lojacarros.municipio WHERE uf='PI'");
			List<Cidades> cidades = new ArrayList<Cidades>();
			while(rs.next()) {
				Cidades cid = toCidades(rs);
				cidades.add(cid);
			}
			return cidades;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public List<Cidades> getPRCidades() {
		Connection connection = MySqlConnection.getConnection();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM lojacarros.municipio WHERE uf='PR'");
			List<Cidades> cidades = new ArrayList<Cidades>();
			while(rs.next()) {
				Cidades cid = toCidades(rs);
				cidades.add(cid);
			}
			return cidades;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public List<Cidades> getRJCidades() {
		Connection connection = MySqlConnection.getConnection();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM lojacarros.municipio WHERE uf='RJ'");
			List<Cidades> cidades = new ArrayList<Cidades>();
			while(rs.next()) {
				Cidades cid = toCidades(rs);
				cidades.add(cid);
			}
			return cidades;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public List<Cidades> getRNCidades() {
		Connection connection = MySqlConnection.getConnection();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM lojacarros.municipio WHERE uf='RN'");
			List<Cidades> cidades = new ArrayList<Cidades>();
			while(rs.next()) {
				Cidades cid = toCidades(rs);
				cidades.add(cid);
			}
			return cidades;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public List<Cidades> getROCidades() {
		Connection connection = MySqlConnection.getConnection();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM lojacarros.municipio WHERE uf='RO'");
			List<Cidades> cidades = new ArrayList<Cidades>();
			while(rs.next()) {
				Cidades cid = toCidades(rs);
				cidades.add(cid);
			}
			return cidades;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public List<Cidades> getRRCidades() {
		Connection connection = MySqlConnection.getConnection();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM lojacarros.municipio WHERE uf='RR'");
			List<Cidades> cidades = new ArrayList<Cidades>();
			while(rs.next()) {
				Cidades cid = toCidades(rs);
				cidades.add(cid);
			}
			return cidades;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public List<Cidades> getRSCidades() {
		Connection connection = MySqlConnection.getConnection();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM lojacarros.municipio WHERE uf='RS'");
			List<Cidades> cidades = new ArrayList<Cidades>();
			while(rs.next()) {
				Cidades cid = toCidades(rs);
				cidades.add(cid);
			}
			return cidades;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public List<Cidades> getSCCidades() {
		Connection connection = MySqlConnection.getConnection();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM lojacarros.municipio WHERE uf='SC'");
			List<Cidades> cidades = new ArrayList<Cidades>();
			while(rs.next()) {
				Cidades cid = toCidades(rs);
				cidades.add(cid);
			}
			return cidades;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public List<Cidades> getSECidades() {
		Connection connection = MySqlConnection.getConnection();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM lojacarros.municipio WHERE uf='SE'");
			List<Cidades> cidades = new ArrayList<Cidades>();
			while(rs.next()) {
				Cidades cid = toCidades(rs);
				cidades.add(cid);
			}
			return cidades;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public List<Cidades> getSPCidades() {
		Connection connection = MySqlConnection.getConnection();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM lojacarros.municipio WHERE uf='SP'");
			List<Cidades> cidades = new ArrayList<Cidades>();
			while(rs.next()) {
				Cidades cid = toCidades(rs);
				cidades.add(cid);
			}
			return cidades;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public List<Cidades> getTOCidades() {
		Connection connection = MySqlConnection.getConnection();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM lojacarros.municipio WHERE uf='TO'");
			List<Cidades> cidades = new ArrayList<Cidades>();
			while(rs.next()) {
				Cidades cid = toCidades(rs);
				cidades.add(cid);
			}
			return cidades;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	private Cidades toCidades(ResultSet rs) throws SQLException {
		Cidades cid = new Cidades();
		cid.setId(rs.getInt("id"));
		cid.setCodigo(rs.getInt("codigo"));
		cid.setCidade(rs.getString("nome"));
		cid.setUf(rs.getString("uf"));
		return cid;
	}
	

}

package control;

import java.sql.SQLException;
import java.util.ArrayList;

import model.dao.CarroDao;
import model.entities.Carros;

public class CarrosBLL {
	
	CarroDao dao = new CarroDao();
	
	public boolean insertCarros(Carros car) {
		
		try {
			
			return dao.insertCarros(car);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}
		
	public boolean updateCarros(Carros car) {
		
		try {
			
			return dao.updateCarros(car);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean deleteCarros(Carros car) {
		
		try {
			
			return dao.deleteCarros(car);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}
	
	public ArrayList<Carros> selectCarros(String filter) {
		
		try {
			
			return dao.selectCarros(filter);
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	
	}
	
	public ArrayList<Carros> selectCarrosPromo(String filter) {
		
		try {
			
			return dao.selectCarrosPromo(filter);
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	
	}

}

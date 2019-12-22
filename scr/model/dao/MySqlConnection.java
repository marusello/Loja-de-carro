package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.mysql.jdbc.Driver;

public class MySqlConnection {
	public static final String URL = "jdbc:mysql://localhost:3306/lojacarros?useSSL=false&useTimezone=true&serverTimezone=UTC";
	public static final String USER = "root";
	public static final String PASS = "9309";

	public static Connection getConnection() {
		try {
			DriverManager.registerDriver(new Driver());
			return DriverManager.getConnection(URL, USER, PASS);
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(new JFrame(), "Banco de Dados \n\n" + "\nErro ao conectar.", "Conexao", JOptionPane.INFORMATION_MESSAGE);
			throw new RuntimeException(ex);
		}
	}
}


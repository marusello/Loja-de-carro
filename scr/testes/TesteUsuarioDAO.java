package testes;

import java.sql.SQLException;

import control.UsuarioBLL;
import model.entities.Usuario;

public class TesteUsuarioDAO {
	
	public static void main(String[] args) throws SQLException {
		
		//Usuario usuario = new Usuario();
		UsuarioBLL usuariobll = new UsuarioBLL();
		
		/*gerente.setGernome("Julianne Santos");
		gerente.setGerregistro("juj176232x");
		
		gerbll.insertGerente(gerente);*/
		
		/*gerente.setGernome("Julianne Santos");
		gerente.setGerregistro("teste");
		gerente.setGerid(6);
		gerbll.updateGerente(gerente);*/
		
		/*gerente.setGerid(6);
		gerbll.deleteGerente(gerente);*/
		
		for(Usuario g : usuariobll.selectUsuario("adm")) {
			System.out.println(g.getUsuLogin());
		}
		
	}
}

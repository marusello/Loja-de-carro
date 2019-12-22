package testes;

import java.sql.SQLException;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import control.UsuarioBLL;
import junit.framework.TestCase;
import model.entities.Usuario;

class IntegracaoTest extends TestCase {
	
	@Test
	void testInserir() throws SQLException {
		
		Usuario usuario = new Usuario();
		usuario.setUsuId(1);
		usuario.setUsuLogin("teste2");
		usuario.setUsuSenha("123");
		usuario.setUsuCargo("Funcionario");
		
		System.out.println("Incluindo um usuário NOVO no Sistema..."); 
		
		UsuarioBLL usuariobll = new UsuarioBLL();		
		
		Assert.assertTrue( usuariobll.insertUsuario(usuario));
		
		System.out.println("Usuário incluído com sucesso: " + usuario.getUsuLogin());

	}
	
	@Test
	void testConsultar() throws SQLException {
		
		Usuario usuario = new Usuario();
		usuario.setUsuId(1);
		usuario.setUsuLogin("teste2");
		usuario.setUsuCargo("Funcionario");
		
		System.out.println("Consultando Usuário no Sistema...");
		
		UsuarioBLL usuariobll = new UsuarioBLL();
		usuariobll.selectUsuario(usuario.getUsuLogin());
		 
		System.out.println("Funcionario consultado com sucesso ");
	}
	
	@Test
	void testRemover() throws SQLException {
		
		Usuario usuario = new Usuario();
		usuario.setUsuId(9);		
		
		System.out.println("Excluindo um usuário no Sistema...");
		
		UsuarioBLL usuariobll = new UsuarioBLL();
		usuariobll.deleteUsuario(usuario);
		
		System.out.println("Consultando o usuário no Sistema...");
		ArrayList usuarios = usuariobll.selectUsuario(usuario.getUsuLogin());
		
		Assert.assertTrue(usuarios.isEmpty());
		System.out.println("Usuário excluído com sucesso ");
	}
}

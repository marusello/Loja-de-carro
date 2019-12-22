package testes;

import java.sql.SQLException;

import control.GerenteBLL;
import model.entities.Gerente;

public class TesteGerenteDAO {
	
	public static void main(String[] args) throws SQLException {
		
		Gerente gerente = new Gerente();
		GerenteBLL gerbll = new GerenteBLL();
		
		/*gerente.setGernome("Julianne Santos");
		gerente.setGerregistro("juj176232x");
		
		gerbll.insertGerente(gerente);*/
		
		/*gerente.setGernome("Julianne Santos");
		gerente.setGerregistro("teste");
		gerente.setGerid(6);
		gerbll.updateGerente(gerente);*/
		
		/*gerente.setGerid(6);
		gerbll.deleteGerente(gerente);*/
		
		for(Gerente g : gerbll.selectGerente("Pedro")) {
			System.out.println(g.getGernome());
		}
		
	}
}

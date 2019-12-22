package testes;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import control.CidadesBLL;
import model.entities.Cidades;

class UnitTestCidade {
	
	CidadesBLL ctrl = new CidadesBLL();

	@Test
	void verificaCidadeSP() {
		ArrayList cidades = new ArrayList();

		for(Cidades cidade : ctrl.getSPCidades()) {
			cidades.add(cidade.getCidade());
		}
		
		Assert.assertTrue(cidades.contains("Bragança Paulista"));
		//Assert.assertTrue(cidades.contains("Belo Horizonte"));
	}
	
	@Test
	void verificaCidadeMG() {
		ArrayList cidades = new ArrayList();

		for(Cidades cidade : ctrl.getMGCidades()) {
			cidades.add(cidade.getCidade());
		}
		
		Assert.assertTrue(cidades.contains("Belo Horizonte"));
		//Assert.assertTrue(cidades.contains("Atibaia"));
	}
	
	@Test
	void verificaCidadeRJ() {
		ArrayList cidades = new ArrayList();

		for(Cidades cidade : ctrl.getRJCidades()) {
			cidades.add(cidade.getCidade());
		}
		
		Assert.assertTrue(cidades.contains("Cabo Frio"));
		//Assert.assertTrue(cidades.contains("Vitória"));
	}
	
	@Test
	void verificaCidadeES() {
		ArrayList cidades = new ArrayList();

		for(Cidades cidade : ctrl.getESCidades()) {
			cidades.add(cidade.getCidade());
		}
		
		Assert.assertTrue(cidades.contains("Vitória"));
	}
}

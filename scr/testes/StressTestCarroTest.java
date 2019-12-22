package testes;

import org.junit.jupiter.api.Test;

import control.CarrosBLL;
import model.entities.Carros;

class StressTestCarroTest {
	
	@Test
	void test() {
		
		long tempoInicial = System.currentTimeMillis();
		Carros carro = new Carros();
		CarrosBLL ctrl = new CarrosBLL();
		
		for(int i = 0; i < 5000; i++) {
			carro.setModelo("Modelo" + i);
			carro.setAno(2016);
			carro.setChassi("BJK4582" + i);
			carro.setCidade("Bragança Paulista");
			carro.setCombustivel("Flex");
			carro.setEstado("SP");
			carro.setKm(12457.89);
			carro.setMarca("Marca" + i);
			carro.setPlaca("BLL" + i);
			carro.setPreco(9999);
			
			ctrl.insertCarros(carro);
		}
		long tempoFinal = System.currentTimeMillis();
		System.out.println(tempoFinal - tempoInicial);
	}

}

package model.entities;

public class Carros {
	
	private int id;
	private String modelo;
	private String marca;
	private int ano;
	
	private String cidade;
	private String estado;
	private String placa;
	private String chassi;
	private double km;
	private double preco;
	private String combustivel;
	
	public Carros(String modelo, String marca, int ano, String cidade, String estado, String placa, String chassi,
			double km, double preco, String combustivel) {
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.cidade = cidade;
		this.estado = estado;
		this.placa = placa;
		this.chassi = chassi;
		this.km = km;
		this.preco = preco;
		this.combustivel = combustivel;
	}
	
	public Carros() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}	
}

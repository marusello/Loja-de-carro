package model.entities;

public class Gerente {
	private int gerid;
	private String gernome;
	private String gerregistro;
	
	
	public Gerente() {}
	public Gerente(String gernome, String gerregistro) {
		this.gernome = gernome;
		this.gerregistro = gerregistro;
	}

	public int getGerid() {
		return gerid;
	}

	public void setGerid(int gerid) {
		this.gerid = gerid;
	}
	
	public String getGernome() {
		return gernome;
	}
	
	public void setGernome(String gernome) {
		this.gernome = gernome;
	}
	
	public String getGerregistro() {
		return gerregistro;
	}
	
	public void setGerregistro(String gerregistro) {
		this.gerregistro = gerregistro;
	}
	
	
}

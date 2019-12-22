package model.entities;

public class Cliente {
	
	private int cliid;
	private String clinome;
	private String clitelefone;
	private String cliemail;
	private String clisenha;
	
	public Cliente() {}
	public Cliente(String clinome, String clitelefone, String cliemail) {
		this.clinome = clinome;
		this.clitelefone = clitelefone;
		this.cliemail = cliemail;
		//this.clisenha = clisenha;
		
	}
	
	public int getCliid() {
		return cliid;
	} 

	public void setCliid(int cliid) {
		this.cliid = cliid;
	} 
	
	public String getClinome() {
		return clinome;
	}
	
	public void setClinome(String clinome) {
		this.clinome = clinome;
	}
	
	public String getClitelefone() {
		return clitelefone;
	}
	
	public void setClitelefone(String clitelefone) {
		this.clitelefone = clitelefone;
	}
	
	public String getCliemail() {
		return cliemail;
	}
	
	public void setCliemail(String cliemail) {
		this.cliemail = cliemail;
	}
	
	public String getClisenha() {
		return clisenha;
	}
	
	public void setClisenha(String clisenha) {
		this.clisenha = clisenha;
	}
	
	@Override
	public String toString() {
		return clinome;
	}
	
}

package model.entities;

public class Usuario {
	
	private int usuId;
	private String usuLogin ;
	private String usuSenha;
	private String usuCargo;	
	
	public Usuario() {}
	public Usuario(String usuLogin, String usuSenha, String usuCargo) {
		this.usuLogin = usuLogin;
		this.usuSenha = usuSenha;
		this.usuCargo = usuCargo;
	}
	public int getUsuId() {
		return usuId;
	}
	public void setUsuId(int usuId) {
		this.usuId = usuId;
	}
	public String getUsuLogin() {
		return usuLogin;
	}
	public void setUsuLogin(String usuLogin) {
		this.usuLogin = usuLogin;
	}
	public String getUsuSenha() {
		return usuSenha;
	}
	public void setUsuSenha(String usuSenha) {
		this.usuSenha = usuSenha;
	}
	public String getUsuCargo() {
		return usuCargo;
	}
	public void setUsuCargo(String usuCargo) {
		this.usuCargo = usuCargo;
	}
	
	

}

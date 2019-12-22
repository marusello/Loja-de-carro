package control;

import java.util.List;

import model.dao.CidadesDao;
import model.entities.Cidades;

public class CidadesBLL implements ICidades{
	
	CidadesDao dao = new CidadesDao();
	
	public List<Cidades> getACCidades() {
		return dao.getACCidades();
	}
	
	public List<Cidades> getALCidades() {
		return dao.getALCidades();
	}
	
	public List<Cidades> getAMCidades() {
		return dao.getAMCidades();
	}
	
	public List<Cidades> getAPCidades() {
		return dao.getAPCidades();
	}
	
	public List<Cidades> getBACidades() {
		return dao.getBACidades();
	}
	
	public List<Cidades> getCECidades() {
		return dao.getCECidades();
	}
	
	public List<Cidades> getDFCidades() {
		return dao.getDFCidades();
	}
	
	public List<Cidades> getESCidades() {
		return dao.getESCidades();
	}
	
	public List<Cidades> getGOCidades() {
		return dao.getGOCidades();
	}
	
	public List<Cidades> getMACidades() {
		return dao.getMACidades();
	}
	
	public List<Cidades> getMGCidades() {
		return dao.getMGCidades();
	}
	
	public List<Cidades> getMSCidades() {
		return dao.getMSCidades();
	}
	
	public List<Cidades> getMTCidades() {
		return dao.getMTCidades();
	}
	
	public List<Cidades> getPACidades() {
		return dao.getPACidades();
	}
	
	public List<Cidades> getPBCidades() {
		return dao.getPBCidades();
	}
	
	public List<Cidades> getPECidades() {
		return dao.getPECidades();
	}
	
	public List<Cidades> getPICidades() {
		return dao.getPICidades();
	}
	
	public List<Cidades> getPRCidades() {
		return dao.getPRCidades();
	}
	
	public List<Cidades> getRJCidades() {
		return dao.getRJCidades();
	}
	
	public List<Cidades> getRNCidades() {
		return dao.getRNCidades();
	}
	
	public List<Cidades> getROCidades() {
		return dao.getROCidades();
	}
	
	public List<Cidades> getRRCidades() {
		return dao.getRRCidades();
	}
	
	public List<Cidades> getRSCidades() {
		return dao.getRSCidades();
	}
	
	public List<Cidades> getSCCidades() {
		return dao.getSCCidades();
	}
	
	public List<Cidades> getSECidades() {
		return dao.getSECidades();
	}
	
	public List<Cidades> getSPCidades() {
		return dao.getSPCidades();
	}
	
	public List<Cidades> getTOCidades() {
		return dao.getTOCidades();
	}

}

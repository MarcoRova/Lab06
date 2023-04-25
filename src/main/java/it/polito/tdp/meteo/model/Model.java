package it.polito.tdp.meteo.model;

import java.util.List;

import it.polito.tdp.meteo.DAO.MeteoDAO;

public class Model {
	
	private MeteoDAO dao;
	
	private final static int COST = 100;
	private final static int NUMERO_GIORNI_CITTA_CONSECUTIVI_MIN = 3;
	private final static int NUMERO_GIORNI_CITTA_MAX = 6;
	private final static int NUMERO_GIORNI_TOTALI = 15;
	
	private List <Citta> citta;
	private List <Citta> best;

	public Model() {
		this.dao = new MeteoDAO();
	}
	
	public List<Citta> getListaCittaDB() {
		return dao.getListaCittaDB();
	}
	
	public List<Rilevamento> getAllRilevamenti() {
		return dao.getAllRilevamenti();
	}
	
	public List<Rilevamento> getAllRilevamentiLocalitaMese(int mese, String localita) {
		return dao.getAllRilevamentiLocalitaMese(mese, localita);
		
	}
	
	public Double getUmiditaMediaMese(int mese, Citta citta) {
		return dao.getUmiditaMediaMese(mese, citta);
	}

	// of course you can change the String output with what you think works best
	public String getUmiditaMedia(int mese) {
		return "TODO!";
	}
	
	// of course you can change the String output with what you think works best
	public String trovaSequenza(int mese) {
		return "TODO!";
	}
	

}

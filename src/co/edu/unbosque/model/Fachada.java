package co.edu.unbosque.model;

import co.edu.unbosque.model.persistance.Configuration_Properties;

public class Fachada {
	private Configuration_Properties CP;
	public Fachada() {
		CP=new Configuration_Properties();
	}
	public Configuration_Properties getCP() {
		return CP;
	}
	public void setCP(Configuration_Properties cP) {
		CP = cP;
	}
	
}

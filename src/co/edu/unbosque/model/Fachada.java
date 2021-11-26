package co.edu.unbosque.model;

import co.edu.unbosque.model.persistance.Configuration_Properties;

public class Fachada {
	private Configuration_Properties CP;
	private ClienteDAO clientedao;
	private ClienteDTO clientedto;
	public Fachada() {
		CP=new Configuration_Properties();
		clientedao=new ClienteDAO();
	}
	
	public ClienteDAO getClientedao() {
		return clientedao;
	}

	public void setClientedao(ClienteDAO clientedao) {
		this.clientedao = clientedao;
	}

	public Configuration_Properties getCP() {
		return CP;
	}
	public void setCP(Configuration_Properties cP) {
		CP = cP;
	}
	
}

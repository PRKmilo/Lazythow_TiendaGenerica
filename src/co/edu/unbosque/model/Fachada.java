package co.edu.unbosque.model;

import co.edu.unbosque.model.persistance.Configuration_Properties;
import co.edu.unbosque.model.persistance.VentasFile;

public class Fachada {
	private Configuration_Properties CP;
	private ClienteDAO clientedao;
	private ClienteDTO clientedto;
	private VentasFile ventasfile;
	public Fachada() {
		CP=new Configuration_Properties();
		clientedao=new ClienteDAO();
		ventasfile=new VentasFile();
	}
	
	
	public VentasFile getVentasfile() {
		return ventasfile;
	}


	public void setVentasfile(VentasFile ventasfile) {
		this.ventasfile = ventasfile;
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

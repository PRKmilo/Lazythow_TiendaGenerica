package co.edu.unbosque.model;

import co.edu.unbosque.model.persistance.Configuration_Properties;
import co.edu.unbosque.model.persistance.VentasFile;

public class Fachada {
	private Configuration_Properties CP;
	private ClienteDAO clientedao;
	private ClienteDTO clientedto;
	private VentasFile ventasfile;
	private ProductosDAO productodao;
	public Fachada() {
		CP=new Configuration_Properties();
		clientedao=new ClienteDAO();
		ventasfile=new VentasFile();
		productodao=new ProductosDAO();
	}
	
	
	public ProductosDAO getProductodao() {
		return productodao;
	}


	public void setProductodao(ProductosDAO productodao) {
		this.productodao = productodao;
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

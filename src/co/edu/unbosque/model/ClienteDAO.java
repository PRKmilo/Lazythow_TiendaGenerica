package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistance.VentasFile;

public class ClienteDAO {
	private ArrayList<ClienteDTO> NominaCliente;
	private VentasFile archivoVenta;
	private ClienteDTO ClienteDto;
	
	public ClienteDAO() {
		ClienteDto = new ClienteDTO(null, null, null, 0, null);
		NominaCliente = new ArrayList<ClienteDTO>();
		archivoVenta = new VentasFile();

	}
	public void agregarCliente(ClienteDTO cliente){
		
		ArrayList<ClienteDTO> nomina1=new ArrayList<ClienteDTO>();
		if(archivoVenta.leerArchivocliente() == null) {
			nomina1=new ArrayList<ClienteDTO>();
		}else {
			 nomina1 = archivoVenta.leerArchivocliente();
		}
		NominaCliente = nomina1;
		NominaCliente.add(cliente);
		archivoVenta.escribirArchivocliente(NominaCliente);
		System.out.println(archivoVenta.escribirArchivocliente(NominaCliente)+ " este el mensaje si se guardo");
	}

	public ArrayList<ClienteDTO> getNominaCliente() {
		return NominaCliente;
	}

	public void setNominaCliente(ArrayList<ClienteDTO> NominaCliente) {
		this.NominaCliente = NominaCliente;
	}
}


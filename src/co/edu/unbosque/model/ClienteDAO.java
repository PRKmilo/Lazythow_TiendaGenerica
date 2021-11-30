package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistance.VentasFile;

public class ClienteDAO {
	private ArrayList<ClienteDTO> NominaCliente;
	private VentasFile archivoVenta;
	private ClienteDTO ClienteDto;
	private int indice ;
	
	public ClienteDAO() {
		ClienteDto = new ClienteDTO(null, null, null, null, null);
		NominaCliente = new ArrayList<ClienteDTO>();
		archivoVenta = new VentasFile();
		indice=0;

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
		System.out.println(NominaCliente.size()+" este es el tamaño del arraylist de cliente");
		archivoVenta.escribirArchivocliente(NominaCliente);
		System.out.println(archivoVenta.escribirArchivocliente(NominaCliente)+ " este el mensaje si se guardo");
	}
	public ClienteDTO buscarcliente(String cedula) {
		ClienteDTO clienteencontrado=new ClienteDTO(null,null,null,null,null);
		ArrayList<ClienteDTO> nomina1=new ArrayList<ClienteDTO>();
		if(archivoVenta.leerArchivocliente() == null) {
			nomina1=new ArrayList<ClienteDTO>();
		}else {
			 nomina1 = archivoVenta.leerArchivocliente();
		}
		for(int x=0;x<nomina1.size();x++) {
			if(nomina1.get(x).getCedula().equals(cedula)) {
				clienteencontrado=nomina1.get(x);
				indice=x;
			}
		}
		return clienteencontrado;
	}
	
	public boolean existecliente(String cedula) {
		boolean respuesta=false;
		ArrayList<ClienteDTO> nomina1=new ArrayList<ClienteDTO>();
		if(archivoVenta.leerArchivocliente() == null) {
			nomina1=new ArrayList<ClienteDTO>();
		}else {
			 nomina1 = archivoVenta.leerArchivocliente();
		}
		System.out.println(nomina1.size()+" este es el tamaño de el arraylist");
		for(int x=0;x<nomina1.size();x++) {
			if(nomina1.get(x).getCedula().equals(cedula)) {
				respuesta=true;
			}
			else {
				respuesta=false;
			}
		}
		return respuesta;
	}
	public int indice(String cedula) {
	int respuesta=0;
	ArrayList<ClienteDTO> nomina1=new ArrayList<ClienteDTO>();
	if(archivoVenta.leerArchivocliente() == null) {
		nomina1=new ArrayList<ClienteDTO>();
	}else {
		 nomina1 = archivoVenta.leerArchivocliente();
	}
	for(int x=0;x<nomina1.size();x++) {
		if(nomina1.get(x).getCedula().equals(cedula)) {
			respuesta=x; 
		}else {
			respuesta=-1;
		}	
	}
	return respuesta;
	}
	
	public String eliminarcliente(String cedula) {
		String respuesta="se elimino correctamente";
		
		if(existecliente(cedula)==false) {
			respuesta="Cliente no encontrado";
		}
		else {
			ArrayList<ClienteDTO> nomina1=new ArrayList<ClienteDTO>();
			if(archivoVenta.leerArchivocliente() == null) {
				nomina1=new ArrayList<ClienteDTO>();
			}else {
				 nomina1 = archivoVenta.leerArchivocliente();
			}
			System.out.println(buscarcliente(cedula).getCedula()+" este es la cedula del objeto que se va a remover");
			System.out.println(indice(cedula)+" este es el indice que se encuentra");
			for(int x=0;x<nomina1.size();x++) {
				System.out.println(nomina1.get(x).getCedula()+" este es el objeto antes del remove");
			}
			nomina1.remove(indice(cedula));
			for(int x=0;x<nomina1.size();x++) {
				System.out.println(nomina1.get(x).getCedula()+" este es el objeto despues del remove");
			}
			System.out.println(nomina1.size()+" este es el tamaño del array despues del remove");
			archivoVenta.escribirArchivocliente(nomina1);
		}
		return respuesta;
	}
	
	

	public ArrayList<ClienteDTO> getNominaCliente() {
		return NominaCliente;
	}

	public void setNominaCliente(ArrayList<ClienteDTO> NominaCliente) {
		this.NominaCliente = NominaCliente;
	}
}


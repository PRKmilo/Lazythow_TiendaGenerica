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
	public ArrayList<ClienteDTO> devuelvearraylist(){
		ArrayList<ClienteDTO> nomina1=new ArrayList<ClienteDTO>();
		if(archivoVenta.leerArchivocliente() == null) {
			nomina1=new ArrayList<ClienteDTO>();
		}else {
			 nomina1 = archivoVenta.leerArchivocliente();
		}
		return nomina1;
	}
	public void agregarCliente(ClienteDTO cliente){	
		NominaCliente = devuelvearraylist();
		NominaCliente.add(cliente);
		System.out.println(NominaCliente.size()+" este es el tamaño del arraylist de cliente");
		archivoVenta.escribirArchivocliente(NominaCliente);
		System.out.println(archivoVenta.escribirArchivocliente(NominaCliente)+ " este el mensaje si se guardo");
	}
	public ClienteDTO buscarcliente(String cedula) {
		ClienteDTO clienteencontrado=new ClienteDTO(null,null,null,null,null);
		
		for(int x=0;x<devuelvearraylist().size();x++) {
			if(devuelvearraylist().get(x).getCedula().equals(cedula)) {
				clienteencontrado=devuelvearraylist().get(x);
				indice=x;
			}
		}
		return clienteencontrado;
	}
	
	public boolean existecliente(String cedula) {
		boolean respuesta=false;
		
		System.out.println(devuelvearraylist().size()+" este es el tamaño de el arraylist");
		for(int x=0;x<devuelvearraylist().size();x++) {
			if(devuelvearraylist().get(x).getCedula().equals(cedula)) {
				respuesta=true;
			}
	
		}
		return respuesta;
	}
	
	
	public String eliminarcliente(String cedula) {
		String respuesta="se elimino correctamente";
		
		if(existecliente(cedula)==false) {
			;
			respuesta="Cliente no encontrado";
		}
		else {
			ArrayList<ClienteDTO> nomina1=new ArrayList<ClienteDTO>();
			nomina1=devuelvearraylist();
			System.out.println(nomina1.size()+" esta es la size del objeto antes del remove xxxxxxx");
			for(int y=0;y<nomina1.size();y++) {
				System.out.println(nomina1.get(y).getCedula()+" esta es la cedula de la persona con el indice antes del remove "+y);
			}
			for(int x=0;x<nomina1.size();x++) {
				if(nomina1.get(x).getCedula().equals(cedula)) {
					nomina1.remove(x);
					System.out.println(x+" este es el indice del objeto a remover xxx");
					archivoVenta.escribirArchivocliente(nomina1);
					
				}
			}
			for(int y=0;y<nomina1.size();y++) {
				System.out.println(nomina1.get(y).getCedula()+" esta es la cedula de la persona con el indice despues del remove "+y);
			}
			
			System.out.println(nomina1.size()+" este es el size despues del remove");
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


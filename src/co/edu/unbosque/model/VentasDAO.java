package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistance.Configuration_Properties;
import co.edu.unbosque.model.persistance.VentasFile;

public class VentasDAO {
	private ArrayList<VentaDTO> NominaVenta;
	private VentasFile archivoVenta;
	private VentaDTO VentaDto;
	private Configuration_Properties propempresa;
	
	public VentasDAO() {
		NominaVenta = new ArrayList<VentaDTO>();
		archivoVenta = new VentasFile();
		propempresa=new Configuration_Properties();
	}
	public void agregarProducto(VentaDTO Venta){
		
		ArrayList<VentaDTO> nomina1=new ArrayList<VentaDTO>();
		if(archivoVenta.leerArchivocliente() == null) {
			nomina1=new ArrayList<VentaDTO>();
		}else {
			 nomina1= archivoVenta.leerArchivoVenta();
		}
		NominaVenta = nomina1;
		NominaVenta.add(Venta);
		archivoVenta.escribirArchivoNominaVentaenta(NominaVenta);
		System.out.println(archivoVenta.escribirArchivoNominaVentaenta(NominaVenta)+ " este el mensaje si se guardo");
	}

	public double cantidadsiniva(int cantidad,double precio) {
		double respuesta=cantidad*precio;
		return respuesta;
	}
	public double totaliva(int cantidad) {
		double respuesta=cantidad*Double.parseDouble(propempresa.getProperty("iva"));
		return respuesta;
	}
	public double saldotatal(int cantidad,double precio) {
		return cantidadsiniva(cantidad,precio)+totaliva(cantidad);
	}
	public ArrayList<VentaDTO> getNominaNominaVenta() {
		return NominaVenta;
	}

	public void setNominaVenta(ArrayList<VentaDTO> NominaProducto) {
		this.NominaVenta = NominaProducto;
	}
}

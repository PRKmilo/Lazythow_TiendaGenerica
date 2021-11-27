package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistance.VentasFile;

public class VentasDAO {
	private ArrayList<VentaDTO> NominaVenta;
	private VentasFile archivoVenta;
	private VentaDTO VentaDto;
	
	public VentasDAO() {
		NominaVenta = new ArrayList<VentaDTO>();
		archivoVenta = new VentasFile();

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

	public ArrayList<VentaDTO> getNominaNominaVenta() {
		return NominaVenta;
	}

	public void setNominaVenta(ArrayList<VentaDTO> NominaProducto) {
		this.NominaVenta = NominaProducto;
	}
}

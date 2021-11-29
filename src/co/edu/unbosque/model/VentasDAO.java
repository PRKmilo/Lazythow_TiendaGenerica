package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistance.Configuration_Properties;
import co.edu.unbosque.model.persistance.VentasFile;

public class VentasDAO extends Recibo{
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
		if(archivoVenta.leerArchivoVenta() == null) {
			nomina1=new ArrayList<VentaDTO>();
		}else {
			 nomina1= archivoVenta.leerArchivoVenta();
		}
		NominaVenta = nomina1;
		NominaVenta.add(Venta);
		archivoVenta.escribirArchivoNominaVentaenta(NominaVenta);
		System.out.println(archivoVenta.escribirArchivoNominaVentaenta(NominaVenta)+ " este el mensaje si se guardo");
	}
	public int devuelvesize() {
		 int respuesta=0;
		ArrayList<VentaDTO> nomina1=new ArrayList<VentaDTO>();
		System.out.println("estaoy pasando por aqui");
		if(archivoVenta.leerArchivoVenta() == null) {
			System.out.println("esta pasando ahora por aqui");
			respuesta=0;
		}else {
			 nomina1= archivoVenta.leerArchivoVenta();
			 respuesta=nomina1.size();
		}
		return respuesta;
	}
	
	public double devuelvetotaldeuda(String cedula) {
		double  respuesta =0.0;
		ArrayList<VentaDTO> nomina1=new ArrayList<VentaDTO>();
		if(archivoVenta.leerArchivoVenta() == null) {
			nomina1=new ArrayList<VentaDTO>();
		}else {
			 nomina1= archivoVenta.leerArchivoVenta();
		}
		for(int x=0;x<nomina1.size();x++) {
			if(nomina1.get(x).getCedulaCliente().equals(cedula) && nomina1.get(x).isPagado()==false) {
				respuesta+=nomina1.get(x).getValorTotalVenta();
			}
		}
		return respuesta;
	}
	
	public ArrayList<VentaDTO> getNominaNominaVenta() {
		return NominaVenta;
	}

	public void setNominaVenta(ArrayList<VentaDTO> NominaProducto) {
		this.NominaVenta = NominaProducto;
	}
	@Override
	public
	double cantidadsiniva2(int cantidad,double precio) {
		// TODO Auto-generated method stub
		 return cantidad*precio;
	}
	@Override
	public
	double totaliva2(int cantidad) {
		// TODO Auto-generated method stub
		return cantidad*Double.parseDouble(propempresa.getProperty("IVA"));
	}
	@Override
	public
	double saldototal2(int cantidad,double precio) {
		// TODO Auto-generated method stub
		return cantidadsiniva2(cantidad,precio)+totaliva2(cantidad);
	}
}

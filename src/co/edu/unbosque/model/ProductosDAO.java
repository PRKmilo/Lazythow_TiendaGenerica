package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistance.VentasFile;

public class ProductosDAO {
	private ArrayList<ProductoDTO> NominaProducto;
	private VentasFile archivoVenta;
	private ProductoDTO productoDto;

	public ProductosDAO() {
		productoDto = new ProductoDTO(null, null, 0, 0, 0);
		NominaProducto = new ArrayList<ProductoDTO>();
		archivoVenta = new VentasFile();

	}
	public ArrayList<ProductoDTO> devuelve_arraylist(){
		ArrayList<ProductoDTO> nomina1=new ArrayList<ProductoDTO>();
		if(archivoVenta.leerArchivoproducto() == null) {
			nomina1=new ArrayList<ProductoDTO>();
		}else {
			nomina1= archivoVenta.leerArchivoproducto();
		}
		return nomina1;
	}
	public void agregarProducto(ProductoDTO producto){

		NominaProducto = devuelve_arraylist();
		NominaProducto.add(producto);
		System.out.println(archivoVenta.escribirArchivoproducto(NominaProducto)+ " este el mensaje si se guardo");
	}
	public boolean existeproducto(String codigo) {
		boolean respuesta=false;
		NominaProducto = devuelve_arraylist();
		for(int x=0;x<NominaProducto.size();x++) {
			if(NominaProducto.get(x).getCodigo().equals(codigo)) {
				respuesta=true;
			}
		}
		return respuesta;
	}
	
	public String eliminarproducto(String codigo) {
		String respuesta="se elimino correctamente el producto";
		if(existeproducto(codigo)==false) {
			respuesta="producto no encontrado";
		}else {
			ArrayList<ProductoDTO> nomina1=new ArrayList<ProductoDTO>();
			nomina1=devuelve_arraylist();
			for(int x=0;x<nomina1.size();x++) {
				if(nomina1.get(x).getCodigo().equals(codigo)) {
					nomina1.remove(x);
				}
			}
			
			archivoVenta.escribirArchivoproducto(nomina1);
		}
		return respuesta;
	}
	public ProductoDTO buscarproducto(String codigo) {
		ProductoDTO productoencontrado=new ProductoDTO(null,null,0,0,0);
		ArrayList<ProductoDTO> nomina1=devuelve_arraylist();
		for(int x=0;x<nomina1.size();x++) {
			if(nomina1.get(x).getCodigo().equals(codigo)) {
				productoencontrado=nomina1.get(x);
			}
		}
		return productoencontrado;
		
	}
	public String actualizarproductos(String codigo,int valornuevo ) {
		String respuesta="Se ha actualizado la base de datos";
		ArrayList<ProductoDTO> nomina1=devuelve_arraylist();
		for(int i=0;i<nomina1.size();i++) {
			if(nomina1.get(i).getCodigo().equals(codigo)) {
				nomina1.get(i).setPrecioVenta(valornuevo);
			}
		}
		archivoVenta.escribirArchivoproducto(nomina1);
		return respuesta;
	}
	public ArrayList<ProductoDTO> getNominaNominaProducto() {
		return NominaProducto;
	}

	public void setNominaProducto(ArrayList<ProductoDTO> NominaProducto) {
		this.NominaProducto = NominaProducto;
	}
}

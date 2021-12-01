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
		
		for(int x=0;x<devuelve_arraylist().size();x++) {
			if(devuelve_arraylist().get(x).getCodigo().equals(codigo)) {
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
			
			for(int x=0;x<devuelve_arraylist().size();x++) {
				if(devuelve_arraylist().get(x).getCodigo().equals(codigo)) {
					devuelve_arraylist().remove(x);
				}
			}
			
			archivoVenta.escribirArchivoproducto(devuelve_arraylist());
		}
		return respuesta;
	}
	public ProductoDTO buscarproducto(String codigo) {
		ProductoDTO productoencontrado=new ProductoDTO(null,null,0,0,0);
		
		for(int x=0;x<devuelve_arraylist().size();x++) {
			if(devuelve_arraylist().get(x).getCodigo().equals(codigo)) {
				productoencontrado=devuelve_arraylist().get(x);
			}
		}
		return productoencontrado;
		
	}
	public ArrayList<ProductoDTO> getNominaNominaProducto() {
		return NominaProducto;
	}

	public void setNominaProducto(ArrayList<ProductoDTO> NominaProducto) {
		this.NominaProducto = NominaProducto;
	}
}

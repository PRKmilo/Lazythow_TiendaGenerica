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
	public void agregarProducto(ProductoDTO producto){

		ArrayList<ProductoDTO> nomina1=new ArrayList<ProductoDTO>();
		if(archivoVenta.leerArchivoproducto() == null) {
			nomina1=new ArrayList<ProductoDTO>();
		}else {
			nomina1= archivoVenta.leerArchivoproducto();
		}
		NominaProducto = nomina1;
		NominaProducto.add(producto);
		System.out.println(archivoVenta.escribirArchivoproducto(NominaProducto)+ " este el mensaje si se guardo");
	}
	public boolean existeproducto(String codigo) {
		boolean respuesta=false;
		ArrayList<ProductoDTO> nomina1=new ArrayList<ProductoDTO>();
		if(archivoVenta.leerArchivoproducto() == null) {
			nomina1=new ArrayList<ProductoDTO>();
		}else {
			nomina1= archivoVenta.leerArchivoproducto();
		}
		for(int x=0;x<nomina1.size();x++) {
			if(nomina1.get(x).getCodigo().equals(codigo)) {
				respuesta=true;
			}else {
				respuesta=false;
			}
		}
		return respuesta;
	}
	public int indiceproducto(String codigo) {
		int respuesta=0;
		ArrayList<ProductoDTO> nomina1=new ArrayList<ProductoDTO>();
		if(archivoVenta.leerArchivoproducto() == null) {
			nomina1=new ArrayList<ProductoDTO>();
		}else {
			nomina1= archivoVenta.leerArchivoproducto();
		}
		for(int x=0;x<nomina1.size();x++) {
			if(nomina1.get(x).getCodigo().equals(codigo)) {
				respuesta=x;
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
			if(archivoVenta.leerArchivoproducto() == null) {
				nomina1=new ArrayList<ProductoDTO>();
			}else {
				nomina1= archivoVenta.leerArchivoproducto();
			}
			nomina1.remove(indiceproducto(codigo));
			archivoVenta.escribirArchivoproducto(nomina1);
		}
		return respuesta;
	}
	public ProductoDTO buscarproducto(String codigo) {
		ProductoDTO productoencontrado=new ProductoDTO(null,null,0,0,0);
		ArrayList<ProductoDTO> nomina1=new ArrayList<ProductoDTO>();
		if(archivoVenta.leerArchivoproducto() == null) {
			nomina1=new ArrayList<ProductoDTO>();
		}else {
			nomina1= archivoVenta.leerArchivoproducto();
		}
		for(int x=0;x<nomina1.size();x++) {
			if(nomina1.get(x).getCodigo().equals(codigo)) {
				productoencontrado=nomina1.get(x);
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

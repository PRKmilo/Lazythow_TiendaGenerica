package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistance.VentasFile;

public class ProductosDAO {
	private ArrayList<ProductoDTO> NominaProducto;
	private VentasFile archivoVenta;
	private ProductoDTO productoDto;
	
	public ProductosDAO() {
		productoDto = new ProductoDTO(null, 0, 0, 0, 0);
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
		archivoVenta.escribirArchivoproducto(NominaProducto);
		System.out.println(archivoVenta.escribirArchivoproducto(NominaProducto)+ " este el mensaje si se guardo");
	}

	public ArrayList<ProductoDTO> getNominaNominaProducto() {
		return NominaProducto;
	}

	public void setNominaProducto(ArrayList<ProductoDTO> NominaProducto) {
		this.NominaProducto = NominaProducto;
	}
}

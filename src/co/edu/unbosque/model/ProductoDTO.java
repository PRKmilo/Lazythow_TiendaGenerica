package co.edu.unbosque.model;

import java.io.File;
import java.io.Serializable;

public class ProductoDTO  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombreProducto;
	private int codigo;
	private int PrecioVenta;
	private int NIT;
	private int PrecioCompra;
		
		public ProductoDTO(String nombreProducto, int codigo, int PrecioVenta, int NIT,int PrecioCompra) {
		// TODO Auto-generated constructor stub
			this.nombreProducto= nombreProducto;
			this.codigo =codigo;
			this.PrecioVenta=PrecioVenta;
			this.NIT=NIT;
			this.PrecioCompra=PrecioCompra;
	}

		public String getNombreProducto() {
			return nombreProducto;
		}

		public void setNombreProducto(String nombreProducto) {
			this.nombreProducto = nombreProducto;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public int getPrecioVenta() {
			return PrecioVenta;
		}

		public void setPrecioVenta(int precioVenta) {
			PrecioVenta = precioVenta;
		}

		public int getNIT() {
			return NIT;
		}

		public void setNIT(int nIT) {
			NIT = nIT;
		}

		public int getPrecioCompra() {
			return PrecioCompra;
		}

		public void setPrecioCompra(int precioCompra) {
			PrecioCompra = precioCompra;
		}
		
		
		
	

}

	package co.edu.unbosque.model;

import java.io.Serializable;

public class VentaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
   private int IVA;
   private int ValorTotalIva;
   private int ValorTotalVenta;
   private int CodigoVenta;
   private int CedulaCliente;
   private int ValorVentaIva;
   private int Cantidad;
   private int CodigoProducto;
   
   

public VentaDTO(int IVA, int ValorTotalIva,  int ValorTotalVenta, int CodigoVenta, int CedulaCliente,int ValorVentaIva,int Cantidad,int CodigoProducto) {
	super();
	this.IVA = IVA;
	this.ValorTotalIva = ValorTotalIva;
	this.ValorTotalVenta = ValorTotalVenta;
	this.CodigoVenta = CodigoVenta;
	this.CedulaCliente = CedulaCliente;
	this.ValorVentaIva =ValorVentaIva;
	this.Cantidad = Cantidad;
	this.CodigoProducto = CodigoProducto;
}



public int getIVA() {
	return IVA;
}



public void setIVA(int iVA) {
	IVA = iVA;
}



public int getValorTotalIva() {
	return ValorTotalIva;
}



public void setValorTotalIva(int valorTotalIva) {
	ValorTotalIva = valorTotalIva;
}



public int getValorTotalVenta() {
	return ValorTotalVenta;
}



public void setValorTotalVenta(int valorTotalVenta) {
	ValorTotalVenta = valorTotalVenta;
}



public int getCodigoVenta() {
	return CodigoVenta;
}



public void setCodigoVenta(int codigoVenta) {
	CodigoVenta = codigoVenta;
}



public int getCedulaCliente() {
	return CedulaCliente;
}



public void setCedulaCliente(int cedulaCliente) {
	CedulaCliente = cedulaCliente;
}



public int getValorVentaIva() {
	return ValorVentaIva;
}



public void setValorVentaIva(int valorVentaIva) {
	ValorVentaIva = valorVentaIva;
}



public int getCantidad() {
	return Cantidad;
}



public void setCantidad(int cantidad) {
	Cantidad = cantidad;
}



public int getCodigoProducto() {
	return CodigoProducto;
}



public void setCodigoProducto(int codigoProducto) {
	CodigoProducto = codigoProducto;
}


   
}

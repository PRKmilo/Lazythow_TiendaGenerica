	package co.edu.unbosque.model;

import java.io.Serializable;

public class VentaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
   private double IVA;
   private double ValorTotalIva;
   private double ValorTotalVenta;
   private int CodigoVenta;
   private String CedulaCliente;
   private double ValorVentaIva;
   private int Cantidad;
   private String CodigoProducto;
   private boolean pagado;
   
   

public VentaDTO(double IVA, double ValorTotalIva,  double ValorTotalVenta, int CodigoVenta, String CedulaCliente,double ValorVentaIva,int Cantidad,String CodigoProducto,boolean pagado) {
	super();
	this.IVA = IVA;
	this.ValorTotalIva = ValorTotalIva;
	this.ValorTotalVenta = ValorTotalVenta;
	this.CodigoVenta = CodigoVenta;
	this.CedulaCliente = CedulaCliente;
	this.ValorVentaIva =ValorVentaIva;
	this.Cantidad = Cantidad;
	this.CodigoProducto = CodigoProducto;
	this.pagado=pagado;
}



public double getIVA() {
	return IVA;
}



public void setIVA(double iVA) {
	IVA = iVA;
}



public double getValorTotalIva() {
	return ValorTotalIva;
}



public void setValorTotalIva(double valorTotalIva) {
	ValorTotalIva = valorTotalIva;
}



public double getValorTotalVenta() {
	return ValorTotalVenta;
}



public void setValorTotalVenta(double valorTotalVenta) {
	ValorTotalVenta = valorTotalVenta;
}



public int getCodigoVenta() {
	return CodigoVenta;
}



public void setCodigoVenta(int codigoVenta) {
	CodigoVenta = codigoVenta;
}



public String getCedulaCliente() {
	return CedulaCliente;
}



public void setCedulaCliente(String cedulaCliente) {
	CedulaCliente = cedulaCliente;
}



public double getValorVentaIva() {
	return ValorVentaIva;
}



public void setValorVentaIva(double valorVentaIva) {
	ValorVentaIva = valorVentaIva;
}



public int getCantidad() {
	return Cantidad;
}



public void setCantidad(int cantidad) {
	Cantidad = cantidad;
}



public String getCodigoProducto() {
	return CodigoProducto;
}



public void setCodigoProducto(String codigoProducto) {
	CodigoProducto = codigoProducto;
}



public boolean isPagado() {
	return pagado;
}



public void setPagado(boolean pagado) {
	this.pagado = pagado;
}


   
}

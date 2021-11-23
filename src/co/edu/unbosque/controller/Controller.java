package co.edu.unbosque.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Fachada;
import co.edu.unbosque.view.Principal;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{
	private Fachada Fachada;
	private Principal gui;
	public Controller() {
		Fachada=new Fachada();
		gui=new Principal();
		gui.setVisible(true);
		System.out.println((Fachada.getCP().escribirPropiedades("tienda", "drogeria", "12234", "Bogota", "0.16", "0.02", "Banco", "1001348", "elkin")+" este es el escribir"));
		Fachada.getCP().leerproperties();
		
		asignaroyentes();
	}
	public void asignaroyentes() {
		gui.getBtnClientes().addActionListener(this);
		gui.getBtnNewButton().addActionListener(this);
		gui.getBtnNewButton_1().addActionListener(this);
		gui.getBtnProducto().addActionListener(this);
		gui.getBtnVentas().addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("esta pasando por la lenia 30");
		System.out.println("este es el get action command"+e.getActionCommand());
		if(e.getActionCommand().equals(gui.Clientes)) {
			System.out.println("usted espicho a clientes");
		}
		if(e.getActionCommand().equals(gui.Ventas)) {
			System.out.println("usted espicho ventas");
		}
		if(e.getActionCommand().equals(gui.Producto)) {
			System.out.println("usted espicho producto");
		}
		if(e.getActionCommand().equals(gui.Pdf)) {
			System.out.println("usted espciho pdf");
		}
		if (e.getActionCommand().equals(gui.Registro)) {
			System.out.println("usted espicho registro");
		}
		
		
	}
	
	

}

package co.edu.unbosque.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.ClienteDTO;
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
		
		
		asignaroyentes();
	
	}
	public void asignaroyentes() {
		gui.getBtnClientes().addActionListener(this);
		gui.getBtnNewButton().addActionListener(this);
		gui.getBtnNewButton_1().addActionListener(this);
		gui.getBtnProducto().addActionListener(this);
		gui.getBtnVentas().addActionListener(this);
		gui.getCliente().getBtnNewButton_2().addActionListener(oyenteDeaccion);
		gui.getCliente().getBtnNewButton_1().addActionListener(oyenteDeaccion);
		gui.getCliente().getBtnNewButton().addActionListener(oyenteDeaccion);
		gui.getForm_cliente().getBtnRegistrarTienda().addActionListener(oyendedecliente);
		gui.getregistro().getBtnRegistrarTienda1().addActionListener(oyendetienda);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("esta pasando por la lenia 30");
		System.out.println("este es el get action command"+e.getActionCommand());
		if(e.getActionCommand().equals(gui.Clientes)) {
			System.out.println("usted espicho a clientes");
			gui.getCliente().setVisible(true);
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
			gui.getregistro().setVisible(true);
		}
		
		
	}
	ActionListener oyenteDeaccion=new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("se esta escuchando algo de cliente");
			if(e.getActionCommand().equals(gui.getCliente().Actualizar)) {
				System.out.println("usted espicho el actualizar");
			}
			if(e.getActionCommand().equals(gui.getCliente().Eliminar)) {
				System.out.println("se espicho eliminar");
			}
			if(e.getActionCommand().equals(gui.getCliente().Registrar)) {
				System.out.println("se espicho registrar");
				gui.getForm_cliente().setVisible(true);
			}
			
		}
		
		
		
	};
	
	ActionListener oyendedecliente=new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("se espocho el oyente del cliente");
			String cedula=gui.getForm_cliente().getTxtCedula().getText();
			String nombre=gui.getForm_cliente().getTxtNombre().getText();
			String direccion=gui.getForm_cliente().getTxtdireccion().getText();
			int telefono=Integer.parseInt(gui.getForm_cliente().getTxttelefono().getText());
			String correo=gui.getForm_cliente().getTtxtcorreoelectronic().getText();
			ClienteDTO nuevo_cliente=new ClienteDTO(nombre,cedula,direccion,telefono,correo);
			Fachada.getClientedao().agregarCliente(nuevo_cliente);
		}
		
	};
	
	ActionListener oyendetienda=new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
		String nombred=gui.getregistro().getTxtNombreEmpresa().getText();
		String tipocomer=gui.getregistro().getTxtTipoComercio().getText();
		String nit=gui.getregistro().getTxtNit().getText();
		String ciudad=gui.getregistro().getTxtCiudad().getText();
		String iva=gui.getregistro().getTxtValorIva().getText();
		String banco=gui.getregistro().getTxtNombreDelBanco().getText();
		String Ncuenta=gui.getregistro().getTxtNumeroCuenta().getText();
		String nombreg=gui.getregistro().getTxtNombreDelGErente().getText();
		
		Fachada.getCP().escribirPropiedades(nombred, tipocomer, nit, ciudad, iva, iva, banco, Ncuenta, nombreg);
		Fachada.getCP().leerproperties();
		}
		
	};
		
	

}

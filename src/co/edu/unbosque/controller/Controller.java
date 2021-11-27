package co.edu.unbosque.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

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
		gui.getCliente().getBtnNewButton_2().addActionListener(oyenteDeaccioncliente);
		gui.getCliente().getBtnNewButton_1().addActionListener(oyenteDeaccioncliente);
		gui.getCliente().getBtnNewButton().addActionListener(oyenteDeaccioncliente);
		gui.getForm_cliente().getBtnRegistrarTienda().addActionListener(oyendedecliente2);
		gui.getregistro().getBtnRegistrarTienda1().addActionListener(oyendetienda);
		gui.getVenta().getBtnActualizarVenta().addActionListener(oyenteaccionventa);
		gui.getVenta().getBtnEliminarVenta().addActionListener(oyenteaccionventa);
		gui.getVenta().getBtnRegistrarVenta().addActionListener(oyenteaccionventa);
		gui.getForm_v().getBtnRegistrarProducto().addActionListener(oyentedeventaformulario);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("esta pasando por la lenia 30");
		System.out.println("este es el get action command"+e.getActionCommand());
		if(e.getActionCommand().equals(gui.Clientes)) {
			System.out.println("usted espicho a clientes");
			System.out.println(Fachada.getVentasfile().leerArchivocliente().size()+" este es el tam de el arraylist");
			gui.getCliente().setVisible(true);
	
		}
		if(e.getActionCommand().equals(gui.Ventas)) {
			System.out.println("usted espicho ventas");
			gui.getVenta().setVisible(true);
		}
		if(e.getActionCommand().equals(gui.Producto)) {
			System.out.println("usted espicho producto");
			gui.getproducto().setVisible(true);
		}
		if(e.getActionCommand().equals(gui.Pdf)) {
			System.out.println("usted espciho pdf");
			
			
		}
		if (e.getActionCommand().equals(gui.Registro)) {
			System.out.println("usted espicho registro");
			gui.getregistro().setVisible(true);
		}
		
		
	}
	ActionListener oyenteDeaccioncliente=new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("se esta escuchando algo de cliente");
			if(e.getActionCommand().equals(gui.getCliente().Actualizar)) {
				System.out.println("usted espicho el actualizar");
			}
			if(e.getActionCommand().equals(gui.getCliente().Eliminar)) {
				System.out.println("se espicho eliminar");
				String cedula=JOptionPane.showInputDialog("ingrese la cedula de el cliente que desea eliminar");
				JOptionPane.showMessageDialog(null,Fachada.getClientedao().eliminarcliente(cedula));
			}
			if(e.getActionCommand().equals(gui.getCliente().Registrar)) {
				System.out.println("se espicho registrar");
				gui.getForm_cliente().setVisible(true);
			}
			
		}
		
		
		
	};
	
	ActionListener oyendedecliente2=new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("se espocho el oyente del cliente");
			String cedula=gui.getForm_cliente().getTxtCedula().getText();
			String nombre=gui.getForm_cliente().getTxtNombre().getText();
			String direccion=gui.getForm_cliente().getTxtdireccion().getText();
			int telefono=Integer.parseInt(gui.getForm_cliente().getTxttelefono().getText());
			String correo=gui.getForm_cliente().getTtxtcorreoelectronic().getText();
			if(Fachada.getClientedao().existecliente(cedula)) {
				JOptionPane.showMessageDialog(null, " esa cedula ya existe ingrese otra cedula");
			}else {
			ClienteDTO nuevo_cliente=new ClienteDTO(nombre,cedula,direccion,telefono,correo);
			Fachada.getClientedao().agregarCliente(nuevo_cliente);
			}
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
	
	ActionListener oyenteaccionventa=new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getActionCommand().equals(gui.getVenta().Actualizar)) {
				System.out.println("usted espicho actulizar venta");
			}
			if(e.getActionCommand().equals(gui.getVenta().Eliminar)) {
				System.out.println("usted espicho eliminar");
			}
			if(e.getActionCommand().equals(gui.getVenta().Registrar)) {
				gui.getForm_v().setVisible(true);
			}
		}
		
	};
		
	ActionListener oyentedeventaformulario=new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getActionCommand().equals(gui.getForm_v().RegistrarV)) {
				System.out.println("usted espicho registrar venta");
				System.out.println(gui.getForm_v().getTxtcantidad().getText()+" esta es la cantidad");
				System.out.println(gui.getForm_v().getTxtCcliente().getText()+" esta es la cedula del cliente");
				System.out.println(gui.getForm_v().getTxtCodproducto().getText()+" esta es el codigo del porducto");
				System.out.println(gui.getForm_v().getTxtcodventa().getText()+" este es el codigo de la venta");
			}
			if(e.getActionCommand().equals(gui.getForm_v().Pagar)) {
				System.out.println("usted espicho pagar venta");
			}
			if(e.getActionCommand().equals(gui.getForm_v().Totalizar)) {
				System.out.println("usted espicho totalizar");
			}
			
		}
		
	};
	
}

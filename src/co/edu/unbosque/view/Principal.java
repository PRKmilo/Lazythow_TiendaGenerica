package co.edu.unbosque.view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Principal extends JFrame {
	private JButton btnClientes;
	private JButton btnProducto;
	private JButton btnVentas;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	public static final String Clientes="clientes";
	public static final String Producto="producto";
	public static final String Ventas="ventas";
	public static final String Pdf="pdf";
	public static final String Registro="Registro";
	private Juego cliente;
	private Venta venta;
	private Producto producto;
	private Formulario2 registro2;
	private Formulario form_cliente;


	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Principal() {
		cliente=new Juego();
		venta=new Venta();
		producto=new Producto();
		registro2=new Formulario2();
		form_cliente=new Formulario();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 307);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnClientes = new JButton("Cliente");
		btnClientes.setBounds(62, 34, 159, 42);
		btnClientes.setActionCommand(Clientes);
		contentPane.add(btnClientes);
		
		 btnProducto = new JButton("Producto");
		btnProducto.setBounds(62, 97, 159, 42);
		btnProducto.setActionCommand(Producto);
		contentPane.add(btnProducto);
		
		 btnVentas = new JButton("Ventas");
		btnVentas.setBounds(62, 172, 159, 42);
		btnVentas.setActionCommand(Ventas);
		contentPane.add(btnVentas);
		
		 btnNewButton = new JButton("GenerarPdf");
		btnNewButton.setBounds(269, 158, 183, 70);
		btnNewButton.setActionCommand(Pdf);
		contentPane.add(btnNewButton);
		
		 btnNewButton_1 = new JButton("RegistrarEmpresa");
		btnNewButton_1.setBounds(269, 34, 183, 100);
		btnNewButton_1.setActionCommand(Registro);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("Tienda Generica");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(145, -7, 214, 31);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Paso importante para el programa");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 8));
		lblNewLabel_4_1.setBounds(269, 131, 214, 31);
		contentPane.add(lblNewLabel_4_1);
		
		
	}
	
	
	public Formulario getForm_cliente() {
		return form_cliente;
	}


	public void setForm_cliente(Formulario form_cliente) {
		this.form_cliente = form_cliente;
	}


	public Formulario2 getregistro() {
		return registro2;
	}
	

	public void setRegistro(Formulario2 registro) {
		this.registro2 = registro;
	}




	public Venta getVenta() {
		return venta;
	}

	public Producto getproducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}



	public void setVenta(Venta venta) {
		this.venta = venta;
	}


	public Juego getCliente() {
		return cliente;
	}

	public void setCliente(Juego cliente) {
		this.cliente = cliente;
	}

	public JButton getBtnClientes() {
		return btnClientes;
	}

	public void setBtnClientes(JButton btnClientes) {
		this.btnClientes = btnClientes;
	}

	public JButton getBtnProducto() {
		return btnProducto;
	}

	public void setBtnProducto(JButton btnProducto) {
		this.btnProducto = btnProducto;
	}

	public JButton getBtnVentas() {
		return btnVentas;
	}

	public void setBtnVentas(JButton btnVentas) {
		this.btnVentas = btnVentas;
	}

	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	public void setBtnNewButton(JButton btnNewButton) {
		this.btnNewButton = btnNewButton;
	}

	public JButton getBtnNewButton_1() {
		return btnNewButton_1;
	}

	public void setBtnNewButton_1(JButton btnNewButton_1) {
		this.btnNewButton_1 = btnNewButton_1;
	}

	
	

	public static String getClientes() {
		return Clientes;
	}

	public static String getProducto() {
		return Producto;
	}

	public static String getVentas() {
		return Ventas;
	}

	public static String getPdf() {
		return Pdf;
	}

	public static String getRegistro() {
		return Registro;
	}
}

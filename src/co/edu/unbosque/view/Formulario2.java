package co.edu.unbosque.view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario2 extends JFrame {

	private JPanel Jframe;
	private JTextField txtNombreEmpresa;
	private JTextField txtNit;
	private JTextField txtTipoComercio;
	private JTextField txtCiudad;
	private JTextField txtValorIva;
	private JTextField txtNombreDelBanco;
	private JTextField txtNumeroCuenta;
	private JTextField txtNombreDelGErente;
	private JButton btnRegistrarTienda1;
	private JButton btnNewButton;
	public static final String Regreso="regreso";
	public static final String Registrartienda="registrar";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario2 frame = new Formulario2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Formulario2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 393);
		Jframe = new JPanel();
		Jframe.setBackground(Color.BLUE);
		Jframe.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Jframe);
		Jframe.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre de la empresa:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 94, 179, 31);
		Jframe.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nit :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 138, 171, 31);
		Jframe.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tipo de comercio");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(348, 94, 133, 31);
		Jframe.add(lblNewLabel_2);
		
		txtNombreEmpresa = new JTextField();
		txtNombreEmpresa.setBounds(205, 102, 96, 19);
		Jframe.add(txtNombreEmpresa);
		txtNombreEmpresa.setColumns(10);
		
		txtNit = new JTextField();
		txtNit.setBounds(205, 146, 96, 19);
		Jframe.add(txtNit);
		txtNit.setColumns(10);
		
		txtTipoComercio = new JTextField();
		txtTipoComercio.setBounds(506, 102, 96, 19);
		Jframe.add(txtTipoComercio);
		txtTipoComercio.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Ciudad");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(348, 143, 107, 20);
		Jframe.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tienda Generica");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(254, 26, 214, 31);
		Jframe.add(lblNewLabel_4);
		
		
		btnRegistrarTienda1 = new JButton("Registrar Tienda");
		btnRegistrarTienda1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegistrarTienda1.setBounds(272, 298, 171, 31);
		btnRegistrarTienda1.setActionCommand(Registrartienda);
		Jframe.add(btnRegistrarTienda1);
		
		txtCiudad = new JTextField();
		txtCiudad.setBounds(506, 146, 96, 19);
		Jframe.add(txtCiudad);
		txtCiudad.setColumns(10);
		
		txtValorIva = new JTextField();
		txtValorIva.setBounds(205, 193, 96, 19);
		Jframe.add(txtValorIva);
		txtValorIva.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Valor Iva");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(10, 192, 160, 16);
		Jframe.add(lblNewLabel_5);
		
		txtNombreDelBanco = new JTextField();
		txtNombreDelBanco.setBounds(506, 193, 96, 19);
		Jframe.add(txtNombreDelBanco);
		txtNombreDelBanco.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Nombre del banco");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(348, 194, 133, 13);
		Jframe.add(lblNewLabel_6);
		
		txtNumeroCuenta = new JTextField();
		txtNumeroCuenta.setBounds(205, 238, 96, 19);
		Jframe.add(txtNumeroCuenta);
		txtNumeroCuenta.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Numero de cuenta");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(10, 241, 150, 13);
		Jframe.add(lblNewLabel_7);
		
		txtNombreDelGErente = new JTextField();
		txtNombreDelGErente.setBounds(506, 238, 96, 19);
		Jframe.add(txtNombreDelGErente);
		txtNombreDelGErente.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Nombre del gerente");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_8.setBounds(348, 239, 148, 13);
		Jframe.add(lblNewLabel_8);
		
	    btnNewButton = new JButton("Regresar");
	    btnNewButton.setActionCommand(Regreso);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(10, 315, 107, 31);
		Jframe.add(btnNewButton);
	}
	
	public static String getRegreso() {
		return Regreso;
	}

	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	public void setBtnNewButton(JButton btnNewButton) {
		this.btnNewButton = btnNewButton;
	}

	public JPanel getJframe() {
		return Jframe;
	}

	public void setJframe(JPanel jframe) {
		Jframe = jframe;
	}

	public JTextField getTxtNombreEmpresa() {
		return txtNombreEmpresa;
	}

	public void setTxtNombreEmpresa(JTextField txtNombreEmpresa) {
		this.txtNombreEmpresa = txtNombreEmpresa;
	}

	public JTextField getTxtNit() {
		return txtNit;
	}

	public void setTxtNit(JTextField txtNit) {
		this.txtNit = txtNit;
	}

	public JTextField getTxtTipoComercio() {
		return txtTipoComercio;
	}

	public void setTxtTipoComercio(JTextField txtTipoComercio) {
		this.txtTipoComercio = txtTipoComercio;
	}

	public JTextField getTxtCiudad() {
		return txtCiudad;
	}

	public void setTxtCiudad(JTextField txtCiudad) {
		this.txtCiudad = txtCiudad;
	}

	public JTextField getTxtValorIva() {
		return txtValorIva;
	}

	public void setTxtValorIva(JTextField txtValorIva) {
		this.txtValorIva = txtValorIva;
	}

	public JTextField getTxtNombreDelBanco() {
		return txtNombreDelBanco;
	}

	public void setTxtNombreDelBanco(JTextField txtNombreDelBanco) {
		this.txtNombreDelBanco = txtNombreDelBanco;
	}

	public JTextField getTxtNumeroCuenta() {
		return txtNumeroCuenta;
	}

	public void setTxtNumeroCuenta(JTextField txtNumeroCuenta) {
		this.txtNumeroCuenta = txtNumeroCuenta;
	}

	public JTextField getTxtNombreDelGErente() {
		return txtNombreDelGErente;
	}

	public void setTxtNombreDelGErente(JTextField txtNombreDelGErente) {
		this.txtNombreDelGErente = txtNombreDelGErente;
	}

	public JButton getBtnRegistrarTienda1() {
		return btnRegistrarTienda1;
	}

	public void setBtnRegistrarTienda1(JButton btnRegistrarTienda1) {
		this.btnRegistrarTienda1 = btnRegistrarTienda1;
	}

	public static String getRegistrartienda() {
		return Registrartienda;
	}
}

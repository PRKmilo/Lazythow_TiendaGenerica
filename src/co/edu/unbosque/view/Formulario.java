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

public class Formulario extends JFrame {

	private JPanel Jframe;
	private JTextField txtNombreEmpresa;
	private JTextField txtNit;
	private JTextField txtTipoComercio;
	private JTextField txtCiudad;
	private JTextField txtValorIva;
	private JTextField txtNombreDelBanco;
	private JTextField txtNumeroCuenta;
	private JTextField txtNombreDelGErente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {
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
		
		JButton btnRegistrarTienda = new JButton("Registrar Tienda");
		btnRegistrarTienda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnRegistrarTienda.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegistrarTienda.setBounds(272, 298, 171, 31);
		Jframe.add(btnRegistrarTienda);
		
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
	}
}

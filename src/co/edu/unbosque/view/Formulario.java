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
import javax.swing.SwingConstants;

public class Formulario extends JFrame {

	private JPanel Jframe;
	private JTextField txtCedula;
	private JTextField txtNombre;
	private JTextField txtTipoComercio;
	private JTextField txtValorIva;
	private JTextField txtNumeroCuenta;

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
		
		JLabel lblNewLabel = new JLabel("Cedula");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 94, 179, 31);
		Jframe.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 138, 171, 31);
		Jframe.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Correo electronico");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(348, 94, 160, 31);
		Jframe.add(lblNewLabel_2);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(205, 102, 96, 19);
		Jframe.add(txtCedula);
		txtCedula.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(205, 146, 96, 19);
		Jframe.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtTipoComercio = new JTextField();
		txtTipoComercio.setBounds(506, 102, 96, 19);
		Jframe.add(txtTipoComercio);
		txtTipoComercio.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Cliente");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(254, 26, 214, 31);
		Jframe.add(lblNewLabel_4);
		
		JButton btnRegistrarTienda = new JButton("Registrar Cliente");
		btnRegistrarTienda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnRegistrarTienda.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegistrarTienda.setBounds(272, 298, 171, 31);
		Jframe.add(btnRegistrarTienda);
		
		txtValorIva = new JTextField();
		txtValorIva.setBounds(205, 193, 96, 19);
		Jframe.add(txtValorIva);
		txtValorIva.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Direcci\u00F3n");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(10, 192, 160, 16);
		Jframe.add(lblNewLabel_5);
		
		txtNumeroCuenta = new JTextField();
		txtNumeroCuenta.setBounds(506, 146, 96, 19);
		Jframe.add(txtNumeroCuenta);
		txtNumeroCuenta.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Telefono");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(348, 147, 150, 13);
		Jframe.add(lblNewLabel_7);
	}
}

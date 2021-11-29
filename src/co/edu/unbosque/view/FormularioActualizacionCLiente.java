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

public class FormularioActualizacionCLiente extends JFrame {

	private JPanel Jframe;
	private JTextField txtNombre;
	private JTextField ttxtcorreoelectronic;
	private JTextField txtdireccion;
	private JTextField txttelefono;
	private JButton btnactualizarcliente;
	public static final String Registrarcliente="registrar";
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioActualizacionCLiente frame = new FormularioActualizacionCLiente();
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
	public FormularioActualizacionCLiente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 566, 294);
		Jframe = new JPanel();
		Jframe.setBackground(Color.BLUE);
		Jframe.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Jframe);
		Jframe.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(0, 94, 171, 31);
		Jframe.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Correo electronico");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(283, 94, 160, 31);
		Jframe.add(lblNewLabel_2);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(122, 102, 96, 19);
		Jframe.add(txtNombre);
		txtNombre.setColumns(10);
		
		ttxtcorreoelectronic = new JTextField();
		ttxtcorreoelectronic.setBounds(453, 102, 96, 19);
		ttxtcorreoelectronic.setColumns(10);
		Jframe.add(ttxtcorreoelectronic);
		
		JLabel lblNewLabel_4 = new JLabel("Cliente");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(182, 27, 214, 31);
		Jframe.add(lblNewLabel_4);
		
		btnactualizarcliente = new JButton("Actualizar cliente");
		btnactualizarcliente.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnactualizarcliente.setBounds(199, 215, 171, 31);
		btnactualizarcliente.setActionCommand(Registrarcliente);
		Jframe.add(btnactualizarcliente);
		
		txtdireccion = new JTextField();
		txtdireccion.setBounds(122, 136, 96, 19);
		Jframe.add(txtdireccion);
		txtdireccion.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Direcci\u00F3n");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(0, 135, 160, 16);
		Jframe.add(lblNewLabel_5);
		
		txttelefono = new JTextField();
		txttelefono.setBounds(453, 136, 96, 19);
		Jframe.add(txttelefono);
		txttelefono.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Telefono");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(281, 142, 150, 13);
		Jframe.add(lblNewLabel_7);
		
		btnNewButton = new JButton("regresar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(10, 215, 105, 31);
		Jframe.add(btnNewButton);
	}

	public JPanel getJframe() {
		return Jframe;
	}

	public void setJframe(JPanel jframe) {
		Jframe = jframe;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	

	public JTextField getTtxtcorreoelectronic() {
		return ttxtcorreoelectronic;
	}

	public void setTtxtcorreoelectronic(JTextField ttxtcorreoelectronic) {
		this.ttxtcorreoelectronic = ttxtcorreoelectronic;
	}

	public JTextField getTxtdireccion() {
		return txtdireccion;
	}

	public void setTxtdireccion(JTextField txtdireccion) {
		this.txtdireccion = txtdireccion;
	}

	public JTextField getTxttelefono() {
		return txttelefono;
	}

	public void setTxttelefono(JTextField txttelefono) {
		this.txttelefono = txttelefono;
	}

	

	public JButton getBtnactualizarcliente() {
		return btnactualizarcliente;
	}

	public void setBtnactualizarcliente(JButton btnactualizarcliente) {
		this.btnactualizarcliente = btnactualizarcliente;
	}

	public static String getRegistrarcliente() {
		return Registrarcliente;
	}
	
}

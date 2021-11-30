package co.edu.unbosque.view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Producto extends JFrame {

	private JPanel contentPane;
	private JButton btnEliminarProducto;
	private JButton btnRegistrarProducto;
	private JButton btnActualizarProducto;
	public  static final String Eliminarproducto="eliminarproducto";
	public static final String Registrarproducto="registrarproducto";
	public static final String Actualizarproducto="actualizarproducto";
	private JButton btnNewButton;
	public static final String Regreso="regreso";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Producto frame = new Producto();
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
	public Producto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 314);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Acciones de producto");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(120, 25, 247, 67);
		contentPane.add(lblNewLabel_2);
		
		 btnEliminarProducto = new JButton("Eliminar");
		 btnEliminarProducto.setActionCommand(Eliminarproducto);
		btnEliminarProducto.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEliminarProducto.setBounds(314, 135, 146, 55);
		contentPane.add(btnEliminarProducto);
		
		 btnRegistrarProducto = new JButton("Registrar ");
		 btnRegistrarProducto.setActionCommand(Registrarproducto);
		btnRegistrarProducto.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegistrarProducto.setBounds(10, 135, 154, 55);
		contentPane.add(btnRegistrarProducto);
		
		btnActualizarProducto = new JButton("Actualizar");
		btnActualizarProducto.setActionCommand(Actualizarproducto);
		btnActualizarProducto.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnActualizarProducto.setBounds(174, 135, 130, 55);
		contentPane.add(btnActualizarProducto);
		
		btnNewButton = new JButton("Regresar");
		btnActualizarProducto.setActionCommand(Regreso);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(0, 242, 99, 25);
		contentPane.add(btnNewButton);
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

	public JButton getBtnEliminarProducto() {
		return btnEliminarProducto;
	}

	public void setBtnEliminarProducto(JButton btnEliminarProducto) {
		this.btnEliminarProducto = btnEliminarProducto;
	}

	public JButton getBtnRegistrarProducto() {
		return btnRegistrarProducto;
	}

	public void setBtnRegistrarProducto(JButton btnRegistrarProducto) {
		this.btnRegistrarProducto = btnRegistrarProducto;
	}

	public JButton getBtnActualizarProducto() {
		return btnActualizarProducto;
	}

	public void setBtnActualizarProducto(JButton btnActualizarProducto) {
		this.btnActualizarProducto = btnActualizarProducto;
	}

	public static String getEliminarproducto() {
		return Eliminarproducto;
	}

	public static String getRegistrarproducto() {
		return Registrarproducto;
	}

	public static String getActualizarproducto() {
		return Actualizarproducto;
	}
	
	
}

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

public class FormularioActualizarProducto extends JFrame {

	private JPanel Jframe;
	private JTextField txtNombreProducto;
	private JTextField txtCodigoDeProducto;
	private JTextField txtNitDeProveedorDelProducto;
	private JTextField txtPrecioCompra;
	private JTextField textPrecioVenta;
	private JButton btnRegistrarProducto;
	public static final String registroproducto="registro";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioActualizarProducto frame = new FormularioActualizarProducto();
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
	public FormularioActualizarProducto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 682, 375);
		Jframe = new JPanel();
		Jframe.setBackground(Color.BLUE);
		Jframe.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Jframe);
		Jframe.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre del producto");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 97, 179, 31);
		Jframe.add(lblNewLabel);
		
		
		JLabel lblNewLabel_2 = new JLabel("Precio de venta");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(378, 94, 133, 31);
		Jframe.add(lblNewLabel_2);
		
		txtNombreProducto = new JTextField();
		txtNombreProducto.setBounds(251, 102, 96, 19);
		Jframe.add(txtNombreProducto);
		txtNombreProducto.setColumns(10);
		
		
		JLabel lblNewLabel_4 = new JLabel("Producto");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(251, 26, 133, 31);
		Jframe.add(lblNewLabel_4);
		
	    btnRegistrarProducto = new JButton("Registrar Producto");
	    btnRegistrarProducto.setActionCommand(registroproducto);
		btnRegistrarProducto.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegistrarProducto.setBounds(237, 252, 171, 31);
		Jframe.add(btnRegistrarProducto);
		
		txtNitDeProveedorDelProducto = new JTextField();
		txtNitDeProveedorDelProducto.setBounds(251, 150, 96, 19);
		Jframe.add(txtNitDeProveedorDelProducto);
		txtNitDeProveedorDelProducto.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Precio de compra");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(10, 149, 237, 16);
		Jframe.add(lblNewLabel_5);
		
		txtPrecioCompra = new JTextField();
		txtPrecioCompra.setBounds(540, 146, 96, 19);
		Jframe.add(txtPrecioCompra);
		txtPrecioCompra.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("NIT");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(376, 147, 203, 13);
		Jframe.add(lblNewLabel_7);
		
		textPrecioVenta = new JTextField();
		textPrecioVenta.setColumns(10);
		textPrecioVenta.setBounds(540, 105, 96, 19);
		Jframe.add(textPrecioVenta);
	}

	public JTextField getTxtNombreProducto() {
		return txtNombreProducto;
	}

	public void setTxtNombreProducto(JTextField txtNombreProducto) {
		this.txtNombreProducto = txtNombreProducto;
	}

	public JTextField getTxtCodigoDeProducto() {
		return txtCodigoDeProducto;
	}

	public void setTxtCodigoDeProducto(JTextField txtCodigoDeProducto) {
		this.txtCodigoDeProducto = txtCodigoDeProducto;
	}

	public JTextField getTxtNitDeProveedorDelProducto() {
		return txtNitDeProveedorDelProducto;
	}

	public void setTxtNitDeProveedorDelProducto(JTextField txtNitDeProveedorDelProducto) {
		this.txtNitDeProveedorDelProducto = txtNitDeProveedorDelProducto;
	}

	public JTextField getTxtPrecioCompra() {
		return txtPrecioCompra;
	}

	public void setTxtPrecioCompra(JTextField txtPrecioCompra) {
		this.txtPrecioCompra = txtPrecioCompra;
	}

	

	public JTextField getTextPrecioVenta() {
		return textPrecioVenta;
	}

	public void setTextPrecioVenta(JTextField textPrecioVenta) {
		this.textPrecioVenta = textPrecioVenta;
	}

	public JButton getBtnRegistrarProducto() {
		return btnRegistrarProducto;
	}

	public void setBtnRegistrarProducto(JButton btnRegistrarProducto) {
		this.btnRegistrarProducto = btnRegistrarProducto;
	}
	
}

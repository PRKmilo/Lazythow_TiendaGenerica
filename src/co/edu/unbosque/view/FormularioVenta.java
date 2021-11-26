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

public class FormularioVenta extends JFrame {

	private JPanel Jframe;
	private JTextField txtNombreProducto;
	private JTextField txtCodigoDeProducto;
	private JTextField txtNitDeProveedorDelProducto;
	private JTextField txtPrecioCompra;
	private JTextField textPrecioVenta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioVenta frame = new FormularioVenta();
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
	public FormularioVenta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 682, 375);
		Jframe = new JPanel();
		Jframe.setBackground(Color.BLUE);
		Jframe.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Jframe);
		Jframe.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Codigo de venta ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 97, 179, 31);
		Jframe.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cedula del cliente");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 138, 171, 31);
		Jframe.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Valor iva");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(376, 94, 133, 31);
		Jframe.add(lblNewLabel_2);
		
		txtNombreProducto = new JTextField();
		txtNombreProducto.setBounds(251, 102, 96, 19);
		Jframe.add(txtNombreProducto);
		txtNombreProducto.setColumns(10);
		
		txtCodigoDeProducto = new JTextField();
		txtCodigoDeProducto.setBounds(251, 146, 96, 19);
		Jframe.add(txtCodigoDeProducto);
		txtCodigoDeProducto.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Producto");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(251, 26, 133, 31);
		Jframe.add(lblNewLabel_4);
		
		JButton btnRegistrarProducto = new JButton("Registrar Producto");
		btnRegistrarProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnRegistrarProducto.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegistrarProducto.setBounds(237, 252, 171, 31);
		Jframe.add(btnRegistrarProducto);
		
		txtNitDeProveedorDelProducto = new JTextField();
		txtNitDeProveedorDelProducto.setBounds(251, 193, 96, 19);
		Jframe.add(txtNitDeProveedorDelProducto);
		txtNitDeProveedorDelProducto.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Valor total de venta");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(10, 192, 237, 16);
		Jframe.add(lblNewLabel_5);
		
		txtPrecioCompra = new JTextField();
		txtPrecioCompra.setBounds(540, 146, 96, 19);
		Jframe.add(txtPrecioCompra);
		txtPrecioCompra.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Valor total m\u00E1s iva ");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(376, 147, 203, 13);
		Jframe.add(lblNewLabel_7);
		
		textPrecioVenta = new JTextField();
		textPrecioVenta.setColumns(10);
		textPrecioVenta.setBounds(540, 97, 96, 19);
		Jframe.add(textPrecioVenta);
	}
}

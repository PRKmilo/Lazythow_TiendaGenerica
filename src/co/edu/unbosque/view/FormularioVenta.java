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
	private JTextField txtcodventa;
	private JTextField txtcantidad;
	private JTextField txtCcliente;
	private JTextField txtCodproducto;
	private JButton  btnRegistrarProducto;
	public static final String RegistrarV="registrarv";
	public static final String Pagar="pagar";
	public static final String Totalizar="totalizar";
	private JButton btnpagar;
	private JButton btnTotalizar;
	private JButton btnNewButton;
	public static final String Registrar="registrar";


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
		
		JLabel lblNewLabel = new JLabel("Codigo de producto ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(46, 97, 179, 31);
		Jframe.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cantidad");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(46, 138, 171, 31);
		Jframe.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cod.producto");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(376, 94, 133, 31);
		
		
		txtcodventa = new JTextField();
		txtcodventa.setBounds(251, 99, 96, 19);
		
		txtcodventa.setColumns(10);
		
		txtcantidad = new JTextField();
		txtcantidad.setBounds(243, 146, 96, 19);
		Jframe.add(txtcantidad);
		txtcantidad.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Venta");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(251, 26, 133, 31);
		Jframe.add(lblNewLabel_4);
		
	    btnRegistrarProducto = new JButton("Registrar Venta");
		
		btnRegistrarProducto.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegistrarProducto.setBounds(251, 239, 171, 31);
		btnRegistrarProducto.setActionCommand(RegistrarV);
		Jframe.add(btnRegistrarProducto);
		
		btnTotalizar=new JButton("Totalizar");
		btnTotalizar.setActionCommand(Totalizar);
		btnTotalizar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTotalizar.setBounds(46, 239, 171, 31);
		Jframe.add(btnTotalizar);
		
		btnpagar=new JButton("Pagar");
		btnpagar.setActionCommand(Pagar);
		btnpagar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnpagar.setBounds(452, 239, 155, 31);
		Jframe.add(btnpagar);
		
		txtCcliente = new JTextField();
		txtCcliente.setBounds(243, 193, 96, 19);
		Jframe.add(txtCcliente);
		txtCcliente.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("C.Cliente");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(46, 192, 237, 16);
		Jframe.add(lblNewLabel_5);
		
		
		JLabel lblNewLabel_7 = new JLabel("Valor total m\u00E1s iva ");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(376, 147, 203, 13);
		
		
		txtCodproducto = new JTextField();
		txtCodproducto.setColumns(10);
		txtCodproducto.setBounds(243, 105, 96, 19);
		Jframe.add(txtCodproducto);
		
		btnNewButton = new JButton("Regresar");
		btnNewButton.setActionCommand(Registrar);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(10, 297, 112, 31);
		Jframe.add(btnNewButton);
	}
	
	
	public static String getRegistrar() {
		return Registrar;
	}

	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	public void setBtnNewButton(JButton btnNewButton) {
		this.btnNewButton = btnNewButton;
	}

	public JButton getBtnpagar() {
		return btnpagar;
	}

	public void setBtnpagar(JButton btnpagar) {
		this.btnpagar = btnpagar;
	}

	public JButton getBtnTotalizar() {
		return btnTotalizar;
	}

	public void setBtnTotalizar(JButton btnTotalizar) {
		this.btnTotalizar = btnTotalizar;
	}

	public static String getPagar() {
		return Pagar;
	}

	public static String getTotalizar() {
		return Totalizar;
	}

	public JTextField getTxtcodventa() {
		return txtcodventa;
	}

	public void setTxtcodventa(JTextField txtcodventa) {
		this.txtcodventa = txtcodventa;
	}

	public JTextField getTxtcantidad() {
		return txtcantidad;
	}

	public void setTxtcantidad(JTextField txtcantidad) {
		this.txtcantidad = txtcantidad;
	}

	public JTextField getTxtCcliente() {
		return txtCcliente;
	}

	public void setTxtCcliente(JTextField txtCcliente) {
		this.txtCcliente = txtCcliente;
	}

	public JTextField getTxtCodproducto() {
		return txtCodproducto;
	}

	public void setTxtCodproducto(JTextField txtCodproducto) {
		this.txtCodproducto = txtCodproducto;
	}

	public JButton getBtnRegistrarProducto() {
		return btnRegistrarProducto;
	}

	public void setBtnRegistrarProducto(JButton btnRegistrarProducto) {
		this.btnRegistrarProducto = btnRegistrarProducto;
	}

	public static String getRegistrarv() {
		return RegistrarV;
	}
	
	
}

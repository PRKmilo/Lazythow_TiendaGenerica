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

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 307);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnClientes = new JButton("Cliente");
		btnClientes.setBounds(62, 34, 159, 42);
		contentPane.add(btnClientes);
		
		JButton btnProducto = new JButton("Producto");
		btnProducto.setBounds(62, 97, 159, 42);
		contentPane.add(btnProducto);
		
		JButton btnVentas = new JButton("Ventas");
		btnVentas.setBounds(62, 172, 159, 42);
		contentPane.add(btnVentas);
		
		JButton btnNewButton = new JButton("GenerarPdf");
		btnNewButton.setBounds(269, 158, 183, 70);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RegistrarEmpresa");
		btnNewButton_1.setBounds(269, 34, 183, 100);
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
}

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

public class Venta extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Venta frame = new Venta();
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
	public Venta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 277);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Acciones Ventas");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(120, 25, 247, 67);
		contentPane.add(lblNewLabel_2);
		
		JButton btnEliminarVenta = new JButton("Eliminar");
		btnEliminarVenta.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEliminarVenta.setBounds(314, 135, 146, 55);
		contentPane.add(btnEliminarVenta);
		
		JButton btnRegistrarVenta = new JButton("Registrar ");
		btnRegistrarVenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrarVenta.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegistrarVenta.setBounds(10, 135, 154, 55);
		contentPane.add(btnRegistrarVenta);
		
		JButton btnActualizarVenta = new JButton("Actualizar");
		btnActualizarVenta.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnActualizarVenta.setBounds(174, 135, 130, 55);
		contentPane.add(btnActualizarVenta);
	}
}
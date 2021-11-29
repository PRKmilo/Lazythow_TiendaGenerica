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

public class Juego extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	public static final String Eliminar="eliminar";
	public static final String Actualizar="actualizar";
	public static final String Registrar="registrar";
	private JButton btnNewButton_3;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego frame = new Juego();
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
	public Juego() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 305);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Acciones cliente");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(120, 25, 247, 67);
		contentPane.add(lblNewLabel_2);
		
	    btnNewButton = new JButton("Eliminar Cliente");
	    btnNewButton.setActionCommand(Eliminar);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(314, 135, 146, 55);
		contentPane.add(btnNewButton);
		
	     btnNewButton_1 = new JButton("Actualizar");
		btnNewButton_1.setActionCommand(Actualizar);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(10, 135, 126, 55);
		contentPane.add(btnNewButton_1);
		
		 btnNewButton_2 = new JButton("Registrar");
		 btnNewButton_2.setActionCommand(Registrar);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(146, 135, 148, 55);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Regresar");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setBounds(0, 233, 99, 25);
		contentPane.add(btnNewButton_3);
	}
	
	public static String getEliminar() {
		return Eliminar;
	}

	public static String getActualizar() {
		return Actualizar;
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

	public JButton getBtnNewButton_1() {
		return btnNewButton_1;
	}

	public void setBtnNewButton_1(JButton btnNewButton_1) {
		this.btnNewButton_1 = btnNewButton_1;
	}

	public JButton getBtnNewButton_2() {
		return btnNewButton_2;
	}

	public void setBtnNewButton_2(JButton btnNewButton_2) {
		this.btnNewButton_2 = btnNewButton_2;
	}
}

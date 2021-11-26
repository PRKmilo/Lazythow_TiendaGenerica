package co.edu.unbosque.model.persistance;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.ClienteDTO;
import co.edu.unbosque.model.ProductoDTO;
import co.edu.unbosque.model.VentaDTO;

public class VentasFile {
	private String ruta1="./Data/cliente.out";
	private String ruta2="./Data/producto.out";
	private String ruta3="./Data/Venta.out";
	private File f;
	private FileOutputStream fos;     
	private DataOutputStream dos;
	private FileInputStream fis;     
	private DataInputStream dis;
	private ClienteDTO cliente;
	private ProductoDTO Producto;
	private VentaDTO ventas;
	
	public int escribirArchivoproducto(ArrayList<ProductoDTO> Staff_productos) {
		try {
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(ruta2));
			salida.writeObject(Staff_productos);
			salida.close();
		}catch(IOException e) {
			return -1;
		}
		return 0;
	}
	public ArrayList<ProductoDTO> leerArchivoproducto() {
		ArrayList<ProductoDTO> nomina = null;
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(ruta2));
			nomina = (ArrayList<ProductoDTO>)in.readObject();
			in.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			return null;
		}
		return nomina;
	}
	
	public int escribirArchivocliente(ArrayList<ClienteDTO> Staff_clientes) {
		try {
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(ruta1));
			salida.writeObject(Staff_clientes);
			salida.close();
		}catch(IOException e) {
			return -1;
		}
		return 0;
	}
	
	public ArrayList<ClienteDTO> leerArchivocliente() {
		ArrayList<ClienteDTO> nomina = null;
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(ruta1));
			nomina = (ArrayList<ClienteDTO>)in.readObject();
			in.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			return null;
		}
		return nomina;
	}
	
	public int escribirArchivoNominaVentaenta(ArrayList<VentaDTO> Staff_Ventas) {
		try {
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(ruta3));
			salida.writeObject(Staff_Ventas);
			salida.close();
		}catch(IOException e) {
			return -1;
		}
		return 0;
	}
	
	public ArrayList<VentaDTO> leerArchivoVenta() {
		ArrayList<VentaDTO> nomina = null;
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(ruta3));
			nomina = (ArrayList<VentaDTO>)in.readObject();
			in.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			return null;
		}
		return nomina;
	}
	
}

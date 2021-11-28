package co.edu.unbosque.model;
import java.io.Serializable;
public class ClienteDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String cedula;
	private String direccion;
	private String telefono;
	private String correo;
	//Este es el ID
	
	public ClienteDTO(String nombre, String cedula,String direccion,String telefono,String correo ) {
		this.nombre = nombre;
		this.cedula = cedula;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
	}
	
	

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getCedula() {
		return cedula;
	}



	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}


}

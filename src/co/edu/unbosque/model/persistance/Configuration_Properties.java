package co.edu.unbosque.model.persistance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JOptionPane;



public class Configuration_Properties {

	private Properties prop=new Properties();
	private  String archivoprop=".\\Data\\config.properties";

	public int escribirPropiedades(String Nombre_Tienda,String Tipo_comercio, String NIT,
			String Ciudad,String IVA,String interes,String banco,String N_cuenta,String 
			Nombre_Gerente) {
		
		try {
			prop.setProperty("Nombre_Tienda",Nombre_Tienda);
			prop.setProperty("Tipo_comercio",Tipo_comercio);
			prop.setProperty("NIT",NIT);
			prop.setProperty("Ciudad",Ciudad);
			prop.setProperty("IVA",IVA);
			prop.setProperty("interes",interes);
			prop.setProperty("Banco",banco);
			prop.setProperty("N_cuenta",N_cuenta);
			prop.setProperty("Nombre_Gerente",Nombre_Gerente);
			prop.store(new FileOutputStream( archivoprop),null);
			
		}catch(IOException ex) {
			return -1;
		}
		return 0;
	}
	public String leerproperties() {
		String linea="";
		try {
			prop.load(new FileInputStream(archivoprop));
			
			prop.list(System.out);
			linea+="Nombre de la tienda: "+prop.getProperty("Nombre_Tienda");
			linea+="Tipo de comercio: "+prop.getProperty("Tipo_comercio");
			linea+="NIT: "+prop.getProperty("NIT");
			linea+="Ciudad: "+prop.getProperty("Ciudad");
			linea+="IVA: "+prop.getProperty("IVA");
			linea+="interes: "+prop.getProperty("interes");
			linea+="Banco: "+prop.getProperty("Banco");
			linea+="N° de cuenta: "+prop.getProperty("N_cuenta");
			linea+="Nombre del Gerente: "+prop.getProperty("Nombre_Gerente");
			
			
		}catch(IOException ex) {
			return null;
		}
		return linea;
		
	}
	public String getProperty(String key) {
		String Property="";
		try {
			prop.load(new FileInputStream(archivoprop));
			Property=prop.getProperty(key);
			System.out.println(Property+" este es el property de el getproperty");
			
		}catch(IOException ex) {
			return null;
		}
		return Property;
	}
}

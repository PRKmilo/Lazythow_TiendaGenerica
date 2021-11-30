package co.edu.unbosque.testcast;

import co.edu.unbosque.model.VentasDAO;
import co.edu.unbosque.model.persistance.Configuration_Properties;
import junit.framework.TestCase;

public class EmpresaTest extends TestCase{


	public void testEscribir() {

		Configuration_Properties p= new Configuration_Properties();
		assertEquals("No se ha creado los metodos ",p.escribirPropiedades("LazyTrow", "mercado", "1236", "u", "5", "q", "m", "o", "8"),0);
	}

	public void testleer() {

		Configuration_Properties p= new Configuration_Properties();
		assertEquals("No se ha creado los metodos ",p.getProperty("Nombre_Tienda"),"LazyTrow");


	}

	public void testventa() {

		VentasDAO m= new  VentasDAO ();
		assertEquals("No se ha creado los metodos ",m.cantidadsiniva2(10,3000.0 ),30000.0);


	}
	public void testventa2() {

		VentasDAO m= new  VentasDAO ();
		assertEquals("No se ha creado los metodos ",m.totaliva2(300),1500.0);


	}
	public void testvent3a() {

		VentasDAO m= new  VentasDAO ();
		assertEquals("No se ha creado los metodos ",m.saldototal2(9, 3000.0),27045.0);


	}
}

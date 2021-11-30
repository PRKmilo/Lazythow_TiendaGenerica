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
		assertEquals("No  ",m.cantidadsiniva2(10,3000.0 ),30000.0);


	}
	public void testventa2() {

		VentasDAO m= new  VentasDAO ();
		assertEquals("No  ",m.totaliva2(300),1500.0);


	}
	public void testvent3a() {

		VentasDAO m= new  VentasDAO ();
		assertEquals("No  ",m.saldototal2(9, 3000.0),27045.0);


	}
	public void testvebtaporcliente() {

		VentasDAO m= new  VentasDAO ();
		assertEquals("No  ",m.ventatotalporcliente("77"),20000.65);


	}
	public void testcancelarproducto() {

		VentasDAO m= new  VentasDAO ();
		assertEquals("No  ",m.cancelarproductos("77"),"se han pagado los productos en deuda");


	}
	public void testdevolvertoatl() {

		VentasDAO m= new  VentasDAO ();
		assertEquals("No  ",m.devuelvetotaldeuda("77"),0.0);


	}
}

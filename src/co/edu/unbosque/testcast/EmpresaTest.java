package co.edu.unbosque.testcast;

import co.edu.unbosque.model.persistance.Configuration_Properties;
import junit.framework.TestCase;

public class EmpresaTest extends TestCase{
	
	public void testEscribir() {
		
		Configuration_Properties p= new Configuration_Properties();
		assertEquals("No se ha creado los metodos ",p.escribirPropiedades("LazyTrow", "mercado", "1236", "u", "p", "q", "m", "o", "8"),0);
	}
	
   public void testleer() {
	   
	   Configuration_Properties p= new Configuration_Properties();
	   assertEquals("No se ha creado los metodos ",p.getProperty("Nombre_Tienda"),"LazyTrow");
	   
	   
   }
}

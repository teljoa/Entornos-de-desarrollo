package cadenaUtil;
import static org.junit.jupiter.api.Assertions.*;

class Test {

	@Test
	void testtomayscula() {
		CadenaUtil cadena=new CadenaUtil("Antonio");
		
		//Comprueba que la cadena se almacena y muestra en mayuscula.
		assertEquals("Antonio".toUpperCase(),cadena.toMayuscula());
		//Comprueba que la cadena introducida se almacena en mayusculas y no contiene minusculas.
		assertNotEquals("Antonio".toUpperCase(),cadena.toMayuscula());
		//Comprueba que se almacena la cadena.
		assertTrue(!cadena.toMayuscula().isBlank());
		assertTrue(cadena.toMayuscula().isEmpty());
		
	}
	
	

}

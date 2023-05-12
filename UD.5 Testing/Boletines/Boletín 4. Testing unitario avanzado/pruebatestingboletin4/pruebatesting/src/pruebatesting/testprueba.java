package pruebatesting;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class testprueba {

	@ParameterizedTest
	@ValueSource(strings= {"kdsjfklj","fdafkopñ","anaig"})
	void testEspalimdromo(String cadena) {
		assert(!Codigo.espalindromo(cadena));
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"ama","eie","umu"})
	void testEspalimdromo1(String cadena) {
		assert(Codigo.espalindromo(cadena));
	}
	
	@ParameterizedTest
	@MethodSource("espalindromo")
	void testespalindromo(String cadena) {
		assertNotNull(cadena);
	}
	
	static String cadena(String cadena) {
		return cadena="madenendam";
	}
	
	@ParameterizedTest
	@MethodSource("espalindromo")
	void test1espalindromo(boolean cadena) {
		assert(cadena);
	}
	
	static boolean cadena1(String cadena) {
		cadena="madenendam";
		return Codigo.espalindromo(cadena);
	}
}

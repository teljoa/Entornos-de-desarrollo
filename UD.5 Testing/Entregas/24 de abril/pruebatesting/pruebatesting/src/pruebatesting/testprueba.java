package pruebatesting;

import org.junit.jupiter.params.ParameterizedTest;
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
}

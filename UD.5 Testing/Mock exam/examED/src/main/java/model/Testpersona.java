package main.java.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertFalse;

import java.time.LocalDate;

class Testpersona {

	
	
	//Tes para el metodo validardatos.
	
	@Test
	void testValidarDatos() {
		Persona una=new Persona();
		
		assert(una.validarDatos("Jose", "Serrano", "11111111H"));
		assert(una.validarDatos("Jose", "Serrano", "11111111H", LocalDate.of(1999, 6, 3), "HOMBRE"));
		assertFalse(una.validarDatos("Jose", "Serrano", "11111111Ñ"));
		assertFalse(una.validarDatos("Jose", "Serrano", "11111111Ñ", LocalDate.of(1999, 6, 3), "MUJER"));
		
	}
	
	//Tes para el metodo bonoJovenDisponible.
	
	@Test
	void testbonojovenCierto() {
		Persona una=new Persona("Jose", "Serrano", "11111111H", LocalDate.of(2020, 1, 3), "HOMBRE");
		Persona dos=new Persona("Jose", "Serrano", "11111111H", LocalDate.of(2005, 1, 3), "HOMBRE");
		Persona tres=new Persona("Jose", "Serrano", "11111111H", LocalDate.of(2000, 1, 3), "HOMBRE");
		Persona cuatro=new Persona("Jose", "Serrano", "11111111H", LocalDate.of(1993, 1, 3), "HOMBRE");
		Persona cinco=new Persona("Jose", "Serrano", "11111111H", LocalDate.of(1991, 1, 3), "HOMBRE");
		
		assert(una.bonoJovenDisponible()==false);
		assert(dos.bonoJovenDisponible()==true);
		assert(tres.bonoJovenDisponible()==true);
		assert(cuatro.bonoJovenDisponible()==true);
		assert(cinco.bonoJovenDisponible()==false);
		
	}
	
	//Tes para el metodo obtenerEdad.
	
	@Test
	void testobtenerEdad() {
		Persona una=new Persona("Jose", "Serrano", "11111111H", LocalDate.of(2020, 1, 3), "HOMBRE");
		Persona dos=new Persona("Jose", "Serrano", "11111111H", LocalDate.of(2005, 1, 3), "HOMBRE");
		Persona tres=new Persona("Jose", "Serrano", "11111111H", LocalDate.of(2000, 1, 3), "HOMBRE");
		Persona cuatro=new Persona("Jose", "Serrano", "11111111H", LocalDate.of(1993, 1, 3), "HOMBRE");
		Persona cinco=new Persona("Jose", "Serrano", "11111111H", LocalDate.of(1991, 1, 3), "HOMBRE");
		
		assert(una.getEdad()==3);
		assert(dos.getEdad()==18);
		assert(tres.getEdad()==23);
		assert(cuatro.getEdad()==30);
		assert(cinco.getEdad()==32);
		
	}
	
	//Tes para el metodo obtenerEdadPara.
	
	@ParameterizedTest
	@ValueSource(ints={1999})
	void testObtenerEdadPara(int anio) {
		Persona una=new Persona("Jose", "Serrano", "11111111H", LocalDate.of(1999, 12, 31), "HOMBRE");
		assert(una.obtenerEdadPara(anio)==0);
	}
	
	@ParameterizedTest
	@ValueSource(ints={1000})
	void testObtenerEdadParaMnor(int anio) {
		Persona una=new Persona("Jose", "Serrano", "11111111H", LocalDate.of(1999, 12, 31), "HOMBRE");
		assert(una.obtenerEdadPara(anio)==-1);
	}
}

package main.java.model;

import java.time.LocalDate;

public class Persona {
	
	private String nombre;
	private String apellido;
	private String dni;
	private LocalDate fechaNacimiento;
	private Genero genero;


	
	public Persona() {
		super();
	}
	
	public Persona(String nombre, String apellido, String dni) {
		this();
		if(validarDatos(nombre, apellido, dni)) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.dni = dni;

		}else {
			throw new PersonaException();
		}
	}
	
	public Persona(String nombre, String apellido, String dni, LocalDate fechaNacimiento, String genero) {
		this(nombre, apellido, dni);
		if(validarDatos(nombre, apellido, dni, fechaNacimiento, genero)) {
			this.fechaNacimiento = fechaNacimiento;
			this.genero = Genero.valueOf(genero);
		}else {
			throw new PersonaException();
		}
	}
	
	
	protected boolean validarDatos(String nombre, String apellido, String dni) {
		boolean valido=true;
		
		if (nombre == null || nombre.isEmpty()) {
			valido=false;
		}
		
		else if (apellido == null || apellido.isEmpty()) {
			valido=false;
		}
		else if (dni == null || dni.isEmpty()) {
			valido=false;
		}

		else if(dni!=null) {
			valido = extractedni(dni);
		}
		
		return valido;
	}

	protected boolean extractedni(String dni) {
		boolean valido=true;
		
		if(dni.length() < 9 || Character.isDigit(dni.charAt(8)))
			valido=false;
		
		for(int i=0; i<dni.length()-1; i++) 
			if(Character.isAlphabetic(dni.charAt(i))) 
				valido=false;

		if ("TRWAGMYFPDXBNJZSQVHLCKE".charAt(Integer.valueOf(dni.substring(0, 8))%23)!= dni.toUpperCase().charAt(8))
			valido=false;
		return valido;
	}
	
	protected boolean validarDatos(String nombre, String apellido, String dni, LocalDate fechaNacimiento, String genero) {
		boolean valido=true;
		
		if (nombre == null || nombre.isEmpty()) {
			valido=false;
		}
		
		else if (apellido == null || apellido.isEmpty()) {
			valido=false;
		}
		else if (dni == null || dni.isEmpty()) {
			valido=false;
		}
		
		else if(dni!=null) {
			valido = extractedni(dni);
		}
		
		else if(fechaNacimiento == null) {
			valido=false;
		}
		
		else if(fechaNacimiento.isAfter(LocalDate.now())) {
			valido=false;
		}

		else if(genero == null || genero.isEmpty()){
			valido=false;
		}
		
		else if(!Genero.HOMBRE.equals(Genero.valueOf(genero)) && !Genero.MUJER.equals(Genero.valueOf(genero))) {
			valido=false;
		}
		
		return valido;
	}
	
	
	
	public boolean bonoJovenDisponible() {
		boolean bono=false;
		
		if(LocalDate.now().getYear()-this.fechaNacimiento.getYear()>= 18 && LocalDate.now().getYear()-this.fechaNacimiento.getYear()<= 30){
			bono=true;
		}

		return bono;
	}
	
	public int getEdad() {
		return LocalDate.now().compareTo(fechaNacimiento)>=0?
						LocalDate.now().minusYears(this.fechaNacimiento.getYear()).getYear():-1;
	}
	
	public int obtenerEdadPara(int year) {
		int edad=-1;
		
		if(year>=this.fechaNacimiento.getYear()) {
			edad= year-this.fechaNacimiento.getYear();
		}
		return edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public Genero getGenero() {
		return genero;
	}


	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
	

}
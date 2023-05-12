package cadenaUtil;

public class CadenaUtil {
	private String cadena;

	public CadenaUtil(String cadena) {
		super();
		this.cadena = cadena;
	}
	
	public String toMayuscula() {
		cadena= this.cadena.toUpperCase();
		return cadena;
	}
	
	public String toMinuscula() {
		cadena= this.cadena.toLowerCase();
		return cadena;
	}
	
	public boolean esMayuscula() {
		boolean es= false;
		for(int i=0; i<cadena.length();i++) {
			if(Character.isUpperCase(i)) {
				es= true;
			}
		}
		return  es;
	}
	
	public boolean esMinuscula() {
		boolean es= false;
		for(int i=0; i<cadena.length();i++) {
			if(Character.isLowerCase(i)) {
				es= true;
			}
		}
		return  es;
	}
	
	public boolean esCapicua() {
		boolean es=false;
		int aux;
		int inverso = 0;
		int cifra;
		for(int i=0; i<cadena.length();i++) {
			if(Character.isDigit(i)) {
				aux = i;
		        while (aux!=0){
		            cifra = aux % 10;
		            inverso = inverso * 10 + cifra;
		            aux = aux / 10;
		        }
		 
		        if(i == inverso){
		            es=true;
		        } 
			}
		}
		return es;
	}
	
	public boolean esPalindromo() {
		String invertida = null;
		for(int i=0; i<cadena.length();i++) {
			if(!Character.isDigit(i)) {
				cadena = cadena.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");
				invertida = new StringBuilder(cadena).reverse().toString();
			}
		}
		return invertida.equals(cadena);
	}
	
	public boolean esDecimal() {
		boolean es=false;
		for(int i=0; i<cadena.length();i++) {
			if(Character.isDigit(i) || cadena.charAt(i) == ',') {
				es=true;
			}
		}
		return es;
	}
	
	public boolean esEntero() {
		boolean es=false;
		for(int i=0; i<cadena.length();i++) {
			if(Character.isDigit(i)) {
				es=true;
			}
		}
		return es;
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}
	
	
}

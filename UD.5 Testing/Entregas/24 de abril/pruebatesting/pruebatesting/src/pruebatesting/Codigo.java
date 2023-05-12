package pruebatesting;

public class Codigo{
	
	public static boolean espalindromo(String cadena) {
		cadena=cadena.replace(" ", "");
	    cadena=cadena.replace(",", "");
	    cadena=cadena.replace(".", "");
	    
	    int fin = cadena.length()-1;
	    int ini=0;
	    boolean espalin=true;
	    
	    while(ini < fin){
	        if(cadena.charAt(ini)!=cadena.charAt(fin)){
	            espalin=false;
	        }
	    ini++;
	    fin--;
	    }
		return espalin;
	}
}

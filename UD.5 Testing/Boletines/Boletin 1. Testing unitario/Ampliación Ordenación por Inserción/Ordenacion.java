package ampliacion;

public class Ordenacion {
	
	public static void insercionDirecta(int A[]){                                            
		    int p, j;
		    int aux;
		    for (p = 1; p < A.length; p++){ 
		              aux = A[p];           
		              j = p - 1;            
		              while ((j >= 0) && (aux < A[j])){                                
		                                                
		                             A[j + 1] = A[j]; 
		                             j--;               
		              }
		              A[j + 1] = aux;
		    }
		}
}


import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio5propuesto {
	
	public static void main(String args[]) throws IOException {
		  
		
	        try { 
	        	FileWriter fichero; 
	            // Las siguientes dos líneas pueden lanzar una excepción de tipo IOException 
	            fichero = new FileWriter(""); 
	            fichero.write("Esto se escribirá en el fichero"); 
	            fichero.close();
	        } catch (IOException ioex) { 
	            // Aquí capturamos cualquier excepción IOException que se lance (incluidas sus subclases) 
	            System.out.println("No se encuentra el fichero");
	        } 
		
		
	}

}

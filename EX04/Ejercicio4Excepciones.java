import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4Excepciones {

	public static void main(String[] args) throws InputMismatchException{
		int num=0;
		Scanner sc= new Scanner(System.in);
		boolean entradaOk=false;
		while (entradaOk==false) {
			try {
			
				System.out.println("Introduce un numero:");
				
				num= sc.nextInt();
				
				entradaOk=true;
			}catch(InputMismatchException e) {
				System.out.println("No puedes poner caracteres especiales");
				
				sc.next();
				
				
			}
		}
	

		System.out.println("Resultado del cuadrado:" + (num*num));
	
		
	}
	

}

import java.util.Scanner;

public class ArrayException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
		int Array[]= new int[5];
		
		for(int i=0; i<6;i++) {
			
			System.out.println("Numero:");
			
			Array[i]= sc.nextInt();
		}
		
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("No puedes insertar más datos");
		}

	}

}

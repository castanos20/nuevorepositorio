package Vista;
import java.util.Scanner;

public class InOut {
	Scanner sc=new Scanner(System.in);
	
	public void mostrartext(String texto) {
		System.out.print(texto);
	}
	
	public int pedirint(String mensaje) {
		mostrartext(mensaje);
		int dato = sc.nextInt();
		return dato;
	}
	
}

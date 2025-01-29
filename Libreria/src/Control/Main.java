package Control;
import Vista.InOut;


public class Main {

	public static void main(String []args) {
		InOut in=new InOut();
		in.mostrartext("Ingrese 1 o 2");
		int a = in.pedirint(null);
		if(a==1) {
			in.mostrartext("Hello wolrd");
		}
		else 
			in.mostrartext("perrohp");
	}
	
}

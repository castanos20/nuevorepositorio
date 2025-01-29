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
<<<<<<< HEAD
			in.mostrartext("peasdasd");
			in.mostrartext("me gusta el pan");
=======
			in.mostrartext("perro");
>>>>>>> 76c22d2e0cb0e3226f91fa8f6e8dfab12f82a8f6
	}
	
}

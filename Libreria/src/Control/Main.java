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

			in.mostrartext("peasdasd");
<<<<<<< HEAD
			in.mostrartext("me gusta el pano");
=======
			in.mostrartext("me gusta el");
>>>>>>> 506838ca42d8eba28e30a03fc481e9106747ea85
	}
	
}

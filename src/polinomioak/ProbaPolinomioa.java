package polinomioak;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ProbaPolinomioa {

	public static void main(String[] args) throws FileNotFoundException {
		
		Polinomio pol = new Polinomio();
		Scanner sc = new Scanner(new File("fitxategiak/polinomioak.txt"));
		String lerroa;
		String[] zenbakiak;
		int koef, berre;

		while(sc.hasNextLine()) {
			lerroa = sc.nextLine();			
			zenbakiak = lerroa.split("\\s+");
			koef = Integer.parseInt(zenbakiak[0]);
			berre = Integer.parseInt(zenbakiak[1]);
			pol.erantsiPolinomioa(koef, berre);
		}
		sc.close();		
		pol.inprimatuPolinomioa();
		System.out.println("PROBA: GRADUA");
		System.out.println("Polinomioaren gradua: "+pol.gradua()+" da");
		System.out.println("PROBA: BALIO NUMERIKOA");
		System.out.println("Polinomioaren balioa x=6 denean: "+pol.balioNumerikoa(6)+" da");		
		System.out.println("PROBA: SINPLIFIKAZIOA");
		System.out.print("Polinomioa sinplifikatuta: ");
		pol.sinplifikatu();
		pol.inprimatuPolinomioa();
	}
}

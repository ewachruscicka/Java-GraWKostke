package graWKostke_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Tura {

	public void rozegrajTure(Gracz gracz) throws IOException{
	while(true) {
	   	System.out.println("Gracz " + gracz.getImie() + " typuje liczbê 1-6: ");
	   	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   	int typowanaLiczba = 0;
	   	try {
	   		typowanaLiczba = Integer.parseInt(in.readLine());
	   	}
	   	catch (NumberFormatException e){
	   		System.err.println("Nieprawid³owa liczba.");
	   		continue;
	   	}
	   	if (typowanaLiczba<1 || typowanaLiczba>6){
	   		System.out.println("Liczba nie mieœci siê w zakresie, spróbuj ponownie.");
	   		continue;
	   	}
	   		
	   	int wyrzuconaLiczba = rzucKostka();
	   	if (sprawdzWynik(typowanaLiczba, wyrzuconaLiczba)){
	   		System.out.println("Gracz " + gracz.getImie() + " zdobywa punkt!");
	   		gracz.setIloscPunktow(gracz.getIloscPunktow()+1);
	   		break;
	   	}
	   	else {
	   		System.out.println("Gracz " + gracz.getImie() + " bez punktu.");
	   		break;
	   	}
	   	}
	}


	public int rzucKostka() {
		Random rand = new Random();
		int wynik = rand.nextInt(6) + 1;
		System.out.println("Wylosowana liczba to: " + wynik);
		return wynik;
	}

	public boolean sprawdzWynik(int liczba1, int liczba2) {
		if (liczba1 == liczba2) {
			System.out.println("Gratulacje, zgad³eœ!");
			return true;
		} else {
			System.out.println("Nie zgad³eœ.\n");
			return false;
		}
	}

}

package graWKostke_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class GraWKostkeApp {

	public static void main (String[] args) throws IOException{
		
		GraWKostke gra = przygotujGre();
		gra.gramy();
		wyswietlWyniki(gra.getListaGraczy());
	}
	
	public static GraWKostke przygotujGre() throws IOException {
		int iloscGraczy;
		int iloscTur;
		
		GraWKostke gra = new GraWKostke();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("Podaj liczbe graczy(1-5): ");
			try {
				iloscGraczy = Integer.parseInt(in.readLine());
			} catch (NumberFormatException e) {
				System.err.println("Nieprawid³owa liczba graczy.");
				continue;
			}
			if (iloscGraczy < 1 || iloscGraczy > 6) {
				System.out.println("Liczba nie mieœci siê w zakresie, spróbuj ponownie.");
				continue;
			}
					
			for (int i=0; i < iloscGraczy; i++){
				Gracz gracz = new Gracz();
				System.out.println("Podaj imie gracza: ");
				String imie = in.readLine();
				gracz.setImie(imie);
				gra.addGracz(gracz);
			}
			break;
		}
		while(true) {
			System.out.println("Podaj ilosc tur(1-10): ");
			try {
				iloscTur = Integer.parseInt(in.readLine());
			} catch (NumberFormatException e) {
				System.err.println("Nieprawid³owa liczba tur.");
				continue;
			}
			if (iloscTur < 1 || iloscTur > 10) {
				System.out.println("Liczba nie mieœci siê w zakresie, spróbuj ponownie.");
				continue;
			}
			break;
		}
		gra.setIloscGraczy(iloscGraczy);
		gra.setIloscTur(iloscTur);
		return gra;
	}
	
	public static void wyswietlWyniki(List <Gracz> listaGraczy){
		System.out.println("\n*** TABELA WYNIKÓW ***\n " );
		for (Gracz gracz : listaGraczy){
			System.out.println("Gracz: " + gracz.getImie() + "\nIloœæ punktów w grze: " + gracz.getIloscPunktow() +
					"\nWyrzucone wyniki: " + gracz.getListaWyrzuconychWynikow());
		}
	}
	
	
}

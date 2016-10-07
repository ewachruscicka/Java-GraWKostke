package graWKostke_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GraWKostke {
	static int iloscGraczy = 0;
	static int iloscTur = 0;
	private static List <Gracz> listaGraczy = new ArrayList<Gracz>();

	public void przygotujGre() throws IOException {
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
				listaGraczy.add(gracz);
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
	}
	
	public void gramy() throws IOException{
		for(int i=0; i<iloscTur; i++){
			Tura tura = new Tura();
			System.out.println("\nTURA NR: "+ (i+1));
			for (Gracz gracz : listaGraczy){
				tura.rozegrajTure(gracz);
				System.out.println("Gracz " + gracz.getImie() + " zdoby³ w sumie " + gracz.getIloscPunktow() + " punktów.");
			}
		}
	}
	
	public void zakonczGre(){
		System.out.println("To juz wszystkie tury. Czas og³osiæ zwyciêzcê!");
	}
	

}






package graWKostke_2;

import java.util.List;
import java.util.Random;

public class Tura {
	private List <Gracz> listaGraczy;
	
	public Tura(List <Gracz> listaGraczy){
		this.listaGraczy = listaGraczy;
	}
	
	public List<Gracz> getListaGraczy() {
		return listaGraczy;
	}

	public void setListaGraczy(List<Gracz> listaGraczy) {
		this.listaGraczy = listaGraczy;
	}

	public void rozegrajTure(){
		for (Gracz gracz : listaGraczy){
			int wynik = rzucKostka(gracz);
			gracz.addWyrzuconyWynik(wynik);
		}
	}
	
	public void ustalZwyciezceTury(){
		Gracz zwyciezca = null;
		List <Integer> wynikiGracza = null;
		int wyrzuconyWynik;
		int i = 0;
		for (Gracz gracz : listaGraczy){
			wynikiGracza = gracz.getListaWyrzuconychWynikow();
			wyrzuconyWynik = wynikiGracza.get(wynikiGracza.size()-1);
			if (wyrzuconyWynik >= i){
				i = wyrzuconyWynik;
				zwyciezca = gracz;
			}
		}
		zwyciezca.dodajPunkt();
		System.out.println("Zwyciêzca tury: " + zwyciezca.getImie() + " zdobywa 1 punkt i"
				+ " ma w sumie " + zwyciezca.getIloscPunktow() + " punktów.");
	}

	public int rzucKostka(Gracz gracz) {
		Random rand = new Random();
		int wynik = rand.nextInt(6) + 1;
		System.out.println("Gracz " + gracz.getImie() + " wyrzuci³ kostk¹: " + wynik);
		return wynik;
	}

}

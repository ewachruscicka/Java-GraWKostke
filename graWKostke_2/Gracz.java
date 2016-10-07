package graWKostke_2;

import java.util.ArrayList;
import java.util.List;

public class Gracz {
	private String imie;
	private int iloscPunktow = 0;
	private List<Integer> listaWyrzuconychWynikow;

	public Gracz(){
		listaWyrzuconychWynikow = new ArrayList<Integer>();
	}
	
	public int getIloscPunktow() {
		return iloscPunktow;
	}

	public void setIloscPunktow(int iloscPunktow) {
		this.iloscPunktow = iloscPunktow;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		imie = imie.toUpperCase();
		this.imie = imie;
	}
	
	public void dodajPunkt() {
		iloscPunktow = iloscPunktow +1;
	}

	public List<Integer> getListaWyrzuconychWynikow() {
		return listaWyrzuconychWynikow;
	}

	public void setListaWyrzuconychWynikow(List<Integer> listaWyrzuconychWynikow) {
		this.listaWyrzuconychWynikow = listaWyrzuconychWynikow;
	}
	
	public void addWyrzuconyWynik(Integer wyrzuconyWynik){
		listaWyrzuconychWynikow.add(wyrzuconyWynik);
	}
	
}

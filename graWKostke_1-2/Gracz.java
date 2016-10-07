package graWKostke_2;

public class Gracz {
	private String imie;
	private int iloscPunktow = 0;
	
	
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
	
}

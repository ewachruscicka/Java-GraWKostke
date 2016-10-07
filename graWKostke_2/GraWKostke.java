package graWKostke_2;

import java.util.ArrayList;
import java.util.List;

public class GraWKostke {
	private int iloscGraczy = 0;
	private int iloscTur = 0;
	private List<Gracz> listaGraczy;

	public GraWKostke() {
		listaGraczy = new ArrayList<Gracz>();
	}

	public int getIloscGraczy() {
		return iloscGraczy;
	}

	public void setIloscGraczy(int iloscGraczy) {
		this.iloscGraczy = iloscGraczy;
	}

	public int getIloscTur() {
		return iloscTur;
	}

	public void setIloscTur(int iloscTur) {
		this.iloscTur = iloscTur;
	}

	public List<Gracz> getListaGraczy() {
		return listaGraczy;
	}

	public void setListaGraczy(List<Gracz> listaGraczy) {
		this.listaGraczy = listaGraczy;
	}

	public void addGracz(Gracz gracz) {
		listaGraczy.add(gracz);
	}

	public void gramy(){
		for(int i=0; i<iloscTur; i++){
			Tura tura = new Tura(listaGraczy);
			System.out.println("\nTURA NR: "+ (i+1));
			tura.rozegrajTure();
			tura.ustalZwyciezceTury();
		}
		while(true){
			try {
				znajdzZwyciezce();
				break;
			}
			catch (RemisException ex){
				System.out.println("REMIS - DODATKOWA TURA ROZSTRZYGAJACA ");
				Tura tura = new Tura(listaGraczy);
				tura.rozegrajTure();
				tura.ustalZwyciezceTury();
				}
			}
		}

public void znajdzZwyciezce() throws RemisException{
		System.out.println("\nTo juz wszystkie tury. Czas og³osiæ zwyciêzcê gry!");
		int i = 0;
		Gracz zwyciezcaGry = null;
		for (Gracz gracz : listaGraczy){
			if(gracz.getIloscPunktow() == i){
				throw new RemisException("zg³oszony w metodzie znajdzZwyciezce() ");
			}
			else if(gracz.getIloscPunktow() > i) {
				i = gracz.getIloscPunktow();
				zwyciezcaGry = gracz;
			}
		}
		System.out.println("\nZwyciêzc¹ gry zostaje: " + zwyciezcaGry.getImie());
	}
}








package graWKostke_2;

import java.io.IOException;

public class GraWKostkeApp {

	public static void main (String[] args) throws IOException{
		GraWKostke gra = new GraWKostke();
		gra.przygotujGre();
		gra.gramy();
		gra.zakonczGre();
	}
}

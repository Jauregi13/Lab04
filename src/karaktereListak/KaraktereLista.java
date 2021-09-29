package karaktereListak;


public class KaraktereLista {
	Nodo lehena;
	Nodo azkena;
	
	private class Nodo {
		char kar;
		Nodo hurrengoa;		

		public Nodo(char kar) {
			this.kar = kar;
			this.hurrengoa = null;
		}
	}
	
	public KaraktereLista () {
		this.lehena = null;
		this.azkena = null;
	}

	/*
	 * s Stringaren karaktereak listan gordetzen ditu, dauden ordena berean.
	 */
	public void karaktereListaKargatu(String s) {
		char k;
		for (int i = 0; i<s.length(); i++) {
			k = s.charAt(i);
			txertatuBukaeran(k);
		}
	}
	
	public void txertatuBukaeran(char k) {
		Nodo nodoBerria = new Nodo(k);
		if (this.lehena == null) { // lista hutsa
			this.lehena = nodoBerria;
			this.azkena = nodoBerria;			
		} else { // lista ez da hutsa
			this.azkena.hurrengoa = nodoBerria;
			this.azkena = this.azkena.hurrengoa;
		}
	}
	/* 
	 * true itzultzen du b.s.b. k karakterea bokala bada 
	 */
	public boolean bokalaDa(char k) {
		return ((k=='a') || (k=='e') || (k=='i') || (k=='o') || (k=='u'));
	}
	
	/*
	 * Komatxoak jartzen ditu listaren hasieran eta bukaeran
	 * AURRE: karaktere-zerrendak badu gutxienez karaktere bat
	 */
	public void komatxoakJarri() {
		// HAU OSATU BEHAR DUZU
		
		
		
		
	}
	
	/*
	 * Listak bokal guztien agerpenak beste n aldiz errepikatzen ditu
	 * AURRE: n zenbaki arrunta da
	 */
	public void	bokalakErrepikatu(int n) {
		// HAU OSATU BEHAR DUZU
		
		
		
		
	}
	public void erakutsiKaraktereLista() {
		Nodo unekoa = this.lehena;
		System.out.print("KARAKTERE-LISTA: ");
		while (unekoa!=null) {
			System.out.print(unekoa.kar);
			unekoa = unekoa.hurrengoa;
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		String s = "egiturak";
		KaraktereLista lista = new KaraktereLista();
		lista.karaktereListaKargatu(s);
		lista.erakutsiKaraktereLista();
		System.out.println("PROBA KOMATXOAK JARRI:");
		lista.komatxoakJarri();
		lista.erakutsiKaraktereLista();
		System.out.println("PROBA BOKALAK ERREPIKATU(0):");
		lista.bokalakErrepikatu(0);
		lista.erakutsiKaraktereLista();	
		System.out.println("PROBA BOKALAK ERREPIKATU(1):");
		lista.bokalakErrepikatu(1);
		lista.erakutsiKaraktereLista();	
		System.out.println("PROBA BOKALAK ERREPIKATU(3):");
		lista.bokalakErrepikatu(3);
		lista.erakutsiKaraktereLista();	
	}
}

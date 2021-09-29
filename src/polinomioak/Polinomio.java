package polinomioak;

public class Polinomio {
	Nodo lehena;
	
	private class Nodo {
		int koef;
		int berre; // Zenbaki arrunta
		Nodo hurrengoa;		

		public Nodo(int koef, int berre) {
			this.koef = koef;
			this.berre = berre;
			this.hurrengoa = null;
		}
	}
	
	public Polinomio () {
		this.lehena = null;
	}

	/*
	 * koef eta berre balioak dituen monomioa gehitzen dio polinomioari
	 */
	public void erantsiPolinomioa (int koef, int berre) {
		Nodo berria = new Nodo(koef, berre);
		berria.hurrengoa = this.lehena;
		this.lehena = berria;
	}
	
	/*
	 * Polinomioaren gradua itzultzen du
	 */
	public int gradua() {
		// HAU OSATU BEHAR DUZU
		int gradua = 0;
		Nodo lag = lehena;
		
		while(lag!= null) {
			
			if(lag.berre > gradua) {
				gradua = lag.berre;
			}
			lag = lag.hurrengoa;
		}
		
		return gradua;
		
		
		
	}
	
	/* 
	 * x parametroaren balioaren kalkulatzen den polinomioaren balio numerikoa itzultzen du
	 */
	public long balioNumerikoa(int x) {
		// HAU OSATU BEHAR DUZU
		Nodo lag = lehena;
		
		long balioa = 0;
		
		while(lag != null) {
			
			balioa += lag.koef*(Math.pow(x,lag.berre));
			
			lag = lag.hurrengoa;
		}
		
		return balioa;
		
				
	}
	
	/* 
	 * berretzaile berdineko monomioak elkartuz sinplifikatzen du polinomioa.
	 */
	public void sinplifikatu() {
		// HAU OSATU BEHAR DUZU
		
		
		
		
	}
	
	public void inprimatuPolinomioa() {
		Nodo unekoa = this.lehena;
		System.out.print("Polinomioa = ");
		while (unekoa!=null) {
			System.out.print(unekoa.koef+"x^"+unekoa.berre);
			unekoa = unekoa.hurrengoa;
			if (unekoa != null) System.out.print(" + ");
		}
		System.out.println();
	}
}

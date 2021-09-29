package dadoJokoa;

import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class DadoJoko {
	private NodoBikoitz lehena; // txanda duen jokalaria erakusten du
	private static final int JOKALARI_KOP = 7; // beti izango da 1 baino handiagoa
	private static final int HASIERAKO_PUNTUAK = 10;

	private class NodoBikoitz {
		int jokalariId; // 1etik JOKALARI_KOP bitarteko balioa
		int puntuak; // Zenbaki arrunta
		NodoBikoitz aurrekoa;
		NodoBikoitz hurrengoa;

		public NodoBikoitz(int id) {
			this.jokalariId = id;
			this.puntuak = HASIERAKO_PUNTUAK;
			this.aurrekoa = null;
			this.hurrengoa = null;
		}
	}

	public DadoJoko() {
		this.lehena = null;
	}

	/* 
	 * Jokoaren hasierako egoera sortzen du.
	 * Jokalari bakoitzak hasierako puntuak ditu.
	 * Aurre: gutxienez bi jokalari kargatuko dira
	 */
	public void kargatuJokalariak() {
		// lehenengo jokalaria sortu
		NodoBikoitz nodoBerria = new NodoBikoitz(1);
		nodoBerria.aurrekoa = nodoBerria;
		nodoBerria.hurrengoa = nodoBerria;
		this.lehena = nodoBerria;
		NodoBikoitz unekoa = nodoBerria;
		//gainontzeko jokalariak kargatu, moduz zirkularrean
		for (int i = 2; i <= JOKALARI_KOP; i++) {
			nodoBerria = new NodoBikoitz(i);
			nodoBerria.aurrekoa = unekoa;
			unekoa.hurrengoa = nodoBerria;
			nodoBerria.hurrengoa = this.lehena;
			this.lehena.aurrekoa = nodoBerria;
			unekoa = unekoa.hurrengoa;
		}
	}

	public int dadoaBota() {
		Random ausaz = new Random();
		return ausaz.nextInt(6) + 1;
	}

	/*
	 * Egiaztatzen du oraindik jokalari bat baino gehiago gelditzen dela.
	 * True itzultzen b.s.b. jokalari kopurua bat baino handiagoa bada
	 */
	public boolean batBainoGehiago() {
		return this.lehena.hurrengoa != this.lehena;
	}
	
	/*
	 * Txanda duen jokalariaren Id balioa itzultzen du
	 */
	public int unekoJokalaria() {
		return this.lehena.jokalariId;
	}

	/*
	 * DadoPuntuak balioaren arabera txanda duen Id jokalariaren puntuazia eguneratu egiten da.
	 * Eguneraketaren ondorioz, 0 edo puntuazio baxuagoa geratzen bazaio, Id jokalaria kaleratu egiten da,
	 * eta mezu bat ateratzen da kaleratzearen berri emateko.
	 * Txanda eguneratu egiten da.
	 */
	public void eguneratu(int id, int dadoPuntuak) {
		// HAU OSATU  EGIN BEHAR DUZU
		
		
		

	}


	public void erakutsiJokaldia(int id, int dadoPuntuak) {
		System.out.println(id + " jokalariaren txanda: " + "dadoan " + dadoPuntuak + " atera zaio");
	}

	public void erakutsiEgoera() {
		NodoBikoitz unekoa = this.lehena;
		System.out.println("JOKOAREN EGOERA:");
		while (unekoa.hurrengoa != this.lehena) {
			System.out.println(unekoa.jokalariId + ": " + unekoa.puntuak + " puntu");
			unekoa = unekoa.hurrengoa;
		}
		System.out.println(unekoa.jokalariId + ": " + unekoa.puntuak + " puntu");
	}

	public static void main(String[] args) throws FileNotFoundException {

		int dadoPuntuak;
		int id;
		DadoJoko jokoa = new DadoJoko();
		jokoa.kargatuJokalariak();
		jokoa.erakutsiEgoera();
		Scanner sc = new Scanner(System.in);

		while (jokoa.batBainoGehiago()) {
			id = jokoa.unekoJokalaria();
			System.out.println("SAKATU RETURN TEKLA DADOA BOTATZEKO:");
			sc.nextLine();
			dadoPuntuak = jokoa.dadoaBota();
			jokoa.erakutsiJokaldia(id, dadoPuntuak);
			jokoa.eguneratu(id, dadoPuntuak);
			jokoa.erakutsiEgoera();
		}
		sc.close();
		System.out.println("IRABAZLEA: " + jokoa.unekoJokalaria() + " jokalaria");
	}
}

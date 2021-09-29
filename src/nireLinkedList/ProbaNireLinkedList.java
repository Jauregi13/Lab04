package nireLinkedList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProbaNireLinkedList {

	public static void main(String[] args) throws FileNotFoundException {
        NireLinkedList<Integer> lista = new NireLinkedList<Integer>();
        Scanner sc = new Scanner(new File("fitxategiak/listaDatuak.txt"));
        String lerroa;
        String[] datuak;

        while(sc.hasNextLine()) {
        	lerroa = sc.nextLine();			
        	datuak = lerroa.split("\\s+");
        	for (String s : datuak) {
//        		lista.addFirst(Integer.parseInt(s));
        		lista.addLast(Integer.parseInt(s));
        	}
        }
    	sc.close();	   	
    	lista.inprimatu();
    	// PROBA lastIndexOf()
    	System.out.println("PROBA lastIndexOf()");
    	System.out.println("lastIndexOf(10): " + lista.lastIndexOf(10));
    	System.out.println("lastIndexOf(8): " + lista.lastIndexOf(8));
    	System.out.println("lastIndexOf(4): " + lista.lastIndexOf(4));
    	System.out.println("lastIndexOf(7): " + lista.lastIndexOf(7));
	}
}

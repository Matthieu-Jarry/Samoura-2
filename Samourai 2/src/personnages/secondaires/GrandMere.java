package personnages.secondaires;

import java.util.Random;

import personnages.Humain;

public class GrandMere extends Humain{
	
	private Humain[] memoire = new Humain[30];
	private int nbConnaissances;
	private Random r;
	
	public GrandMere(String nom, int argent) {
		super(nom, argent, "tisane");
		this.nbConnaissances = 0;
	}
	
	private String humainHasard() {
		return "";
	}
	
	public void ragoter() {
		
	}
	
	public void faireConnaissanceAvec(Humain h) {
		
	}
	
	
}

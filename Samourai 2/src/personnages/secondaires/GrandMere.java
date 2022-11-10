package personnages.secondaires;

import java.util.Random;

import personnages.Humain;

public class GrandMere extends Humain{
	
	private Humain[] memoire = new Humain[30];
	private int nbConnaissances;
	private Random r = new Random();
	
	public GrandMere(String nom, int argent) {
		super(nom, argent, "tisane");
		this.nbConnaissances = 0;
	}
	
	private String humainHasard() {
		int alea = r.nextInt(7);
		return switch (alea) {
		case 0 -> "Samouraï";
		case 1 -> "Ronin";
		case 2 -> "Colporteur";
		case 3 -> "Commercant";
		case 4 -> "Ninja";
		case 5 -> "Yakuza";
		case 6 -> "Grand Mère";
		default ->
		throw new IllegalArgumentException("Unexpected value: " + alea);
		};
	}
	
	public void ragoter() {
		int alea = r.nextInt(this.nbConnaissances);
		System.out.println(alea);
		Humain h = memoire[alea];
		if (h instanceof Traitre) {
			parler("Je sais que "+ h.getNom() + " est un traître!");
		}
		else {
			parler("Je crois que " + h.getNom() + " est " + humainHasard());
		}
	}
	
	public void faireConnaissanceAvec(Humain h) {
		if (this.nbConnaissances < 30) {
			memoire[this.nbConnaissances] = h;
			this.nbConnaissances++;
			parler("J'ai fait connaissance avec " + h.getNom());
		}
		else {
			parler("J'ai vu trop de monde, je ne peux pas garder plus de monde en mémoire");
		}
	}
	
	
}

package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, argent, "th�");
	}
	
	public int seFaireExtorquer() {
		int argent = this.getArgent();
		this.perdreArgent(argent);
		parler("On m'a vol� tout mon argent ! Ce monde est vraiment trop injuste !");
		return argent;
	}
	
	public void recevoir(int n) {
		gagnerArgent(n);
		parler("Merci beaucoup pour le don de " +n);
	}

}

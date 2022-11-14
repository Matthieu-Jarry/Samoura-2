package personnages.principaux;

import personnages.Humain;
import personnages.IPleutre;

public class Commercant extends Humain implements IPleutre {

	public Commercant(String nom, int argent) {
		super(nom, argent, "thé");
	}
	
	public int seFaireExtorquer() {
		int argent = this.getArgent();
		this.perdreArgent(argent);
		parler("On m'a volé tout mon argent ! Ce monde est vraiment trop injuste !");
		return argent;
	}
	
	public void recevoir(int n) {
		gagnerArgent(n);
		parler("Merci beaucoup pour le don de " +n);
	}

	@Override
	public void fuir() {
		// TODO Auto-generated method stub
		
	}

}

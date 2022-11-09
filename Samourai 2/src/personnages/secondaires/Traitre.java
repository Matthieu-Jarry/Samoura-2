package personnages.secondaires;

import personnages.Humain;
import personnages.principaux.Commercant;
import personnages.principaux.Samourai;

public class Traitre extends Samourai{
	
	private int traitrise;

	public Traitre(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson, seigneur);
		this.traitrise = 0;
	}
	
	public void extorquer(Commercant c) {
		
	}
	
	@Override
	public void direBonjour() {
		
	}
	
	public void faireLeGentil(Humain h, int argent) {
		
	}

}

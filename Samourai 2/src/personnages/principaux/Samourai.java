package personnages.principaux;

import personnages.Humain;
import personnages.IGuerrier;

public class Samourai extends Ronin implements IGuerrier{

	private String seigneur;

	public Samourai(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson);
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon seigneur est "+ this.seigneur);
	}
	
	public void boire(String b) {
		parler("Mmmm, un bon verre de " + b + " ! GLOUPS !");
	}

	@Override
	public void combattre(Humain h) {
		// TODO Auto-generated method stub
		
	}
	
}

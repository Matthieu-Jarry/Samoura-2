package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain{
	
	private int honneur;

	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
		this.honneur = 1;
	}
	
	public void donner(int n, Commercant c) {
		
	}
	
	public void provoquer(Yakuza y) {
		
	}

}

package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain{
	
	private int honneur;

	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
		this.honneur = 1;
	}
	
	public void donner(int n, Commercant c) {
		perdreArgent(n);
		parler("Tiens " + c.getNom() + " voilà 10 sous");
		c.recevoir(n);
	}
	
	public void provoquer(Yakuza y) {
		if (this.honneur*2 > y.getReputation()) {
			gagnerArgent(y.getArgent());
			this.honneur++;
			y.perdreDuel();
			parler("Je t’ai eu petit yakusa!");
		}
		else {
			y.gagnerDuel();
			this.honneur--;
			parler("J'ai perdu contre le yakusa, mon honneur prend un coup");
		}
	}

}

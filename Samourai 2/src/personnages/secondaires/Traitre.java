package personnages.secondaires;

import personnages.Humain;
import personnages.IPleutre;
import personnages.principaux.Commercant;
import personnages.principaux.Samourai;

public class Traitre extends Samourai implements IPleutre{
	
	private int traitrise;

	public Traitre(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson, seigneur);
		this.traitrise = 0;
	}
	
	public void extorquer(Commercant c) {
		if (this.traitrise < 3) {
			gagnerArgent(c.seFaireExtorquer());
			parler("J'ai piqué tout le fric de " + c.getNom());
			this.traitrise++;
		}
		else {
			parler("Je ne peux plus extorquer sinon je risque de me faire remarquer");
		}
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon niveau de traitrise est à " + this.traitrise);
	}
	
	public void faireLeGentil(Humain h, int argent) {
		h.gagnerArgent(argent);
		this.traitrise -= argent/10; 
		if (this.traitrise < 0) {
			this.traitrise = 0;
		}
		parler("Je fais ami-ami avec " + h.getNom() + " en lui donnant " + argent + " sous");
	}

	@Override
	public void fuir() {
		// TODO Auto-generated method stub
		
	}

}

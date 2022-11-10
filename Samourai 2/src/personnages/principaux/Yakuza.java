package personnages.principaux;

import personnages.Humain;

public class Yakuza extends Humain{
	
	private String clan;
	private int reputation;
	
	public Yakuza(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson);
		this.clan = clan;
		this.reputation = 0;
	}

	public String getClan() {
		return clan;
	}

	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant c) {
		gagnerArgent(c.seFaireExtorquer());
		this.reputation++;
		parler("J'ai piqué tout le fric de " + c.getNom());
	}
	
	public void gagnerDuel() {
		this.reputation++;
		parler("J'ai gagné mon duel");
	}
	
	public int perdreDuel() {
		int argent = getArgent();
		perdreArgent(argent);
		this.reputation--;
		parler("J'ai perdu mon duel et mes " + argent + " sous");
		return argent;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de " + getClan());
	}
	

}

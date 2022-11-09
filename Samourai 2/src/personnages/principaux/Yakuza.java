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
		
	}
	
	public void gagnerDuel() {
		
	}
	
	public void perdreDuel() {
		
	}
	
	@Override
	public void direBonjour() {
		
	}
	

}

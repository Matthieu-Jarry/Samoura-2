package personnages.principaux;

public class Samourai extends Ronin {

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
	
}

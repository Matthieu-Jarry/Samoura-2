package personnages;

public abstract class Humain {
	
	private String nom;
	private int argent;
	private String boisson;
	
	public Humain(String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}
	
	protected void parler(String texte) {
		System.out.println("("+getNom() + ") - " + texte );
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " + getBoisson() + " et j'ai " + getArgent() + " sous");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + getBoisson() + " ! GLOUPS !");
	}

	public String getNom() {
		return nom;
	}

	protected int getArgent() {
		return argent;
	}

	public String getBoisson() {
		return boisson;
	}
	
	public void gagnerArgent(int n) {
		this.argent += n;
	}
	
	public void perdreArgent(int n) {
		this.argent -= n;
	}
	
}

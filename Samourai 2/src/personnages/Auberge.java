package personnages;

public class Auberge {
	
	private String nom;
	private Humain[] clients;
	private int capacite;
	private IGuerrier[] guerriers;
	private IPleutre[] pleutres;

	public Auberge(String nom, int capacite) {
		this.nom = nom;
		this.capacite = capacite;
		this.clients = new Humain[capacite];
	}
	
	public void nouvelArrivant(Humain h) {
		int nbClient = clients.length;
		if (nbClient < capacite) {
			clients[nbClient] = h;
			h.parler("Bonjour tout le monde dans l'auberge " + nom);
		}
		else {
			h.parler("Mince, l'auberge est pleine");
		}
		
	}
	
	public void payerLaTournee(Humain h) {
		h.parler("Je paye ma tournée !!");
		for (Humain client : clients) {
			client.boire();
		}
	}
	
	public void fight() {
		
	}
	

}

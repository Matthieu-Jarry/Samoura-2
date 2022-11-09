package personnages.principaux;

public class Samourai extends Ronin {

	private String seigneur;

	public Samourai(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson);
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour() {
		
	}
	
	public void boire(String b) {
		
	}
	
	/*public static void main(String[] args) {
		Ronin musaichi = new Samourai("Akimoto" , 20 , "the", "Miyamoto");
		Samourai samourai = (Samourai) musaichi;
		musaichi.boire();
		musaichi.direBonjour();
		samourai.boire();
		samourai.boire("saké");
		samourai.direBonjour();
		musaichi.boire("saké");
	}*/
	
}

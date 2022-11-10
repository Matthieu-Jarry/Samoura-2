package personnages.secondaires;

import java.util.Random;

import personnages.principaux.Commercant;
import personnages.principaux.Yakuza;

public class Ninja extends Yakuza{
	
	private String clanSecret;
	private static final String[] clansNinja = {"of Shadows", "of Mist", "of Clouds", "of Fog", "of Darkness"};
	
	public Ninja(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson, clan);
		Random r = new Random();
		int alea = r.nextInt(5);
		this.clanSecret = clan + " " +
				switch (alea) {
				case 0 -> clansNinja[0];
				case 1 -> clansNinja[1];
				case 2 -> clansNinja[2];
				case 3 -> clansNinja[3];
				case 4 -> clansNinja[4];				
				default ->
				throw new IllegalArgumentException("Unexpected value: " + alea);
				};
	}
	
	private int extorquerMefiant(Commercant c) {
		return 1;
	}
	
	@Override
	public void extorquer(Commercant c) {
		
	}
	
	public void revenirExtorquer() {
		
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("(mon clan secret est " + this.clanSecret +" et maintenant que tu le sais, je vais devoir te tuer)");
	}
	

}

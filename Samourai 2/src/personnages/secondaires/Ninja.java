package personnages.secondaires;

import java.util.Random;

import personnages.ClanNinja;
import personnages.principaux.Commercant;
import personnages.principaux.Yakuza;

public class Ninja extends Yakuza{
	
	private String clanSecretString;
	private final int SEUIL_ARGENT = 60; 
	private static final String[] CLANS_NINJA = {"of Shadows", "of Mist", "of Clouds", "of Fog", "of Darkness"};
	private ClanNinja clanSecretObject;
	
	public Ninja(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson, clan);
		Random r = new Random();
		int alea = r.nextInt(5);
		this.clanSecretString = clan + " " +
				switch (alea) {
				case 0 -> CLANS_NINJA[0];
				case 1 -> CLANS_NINJA[1];
				case 2 -> CLANS_NINJA[2];
				case 3 -> CLANS_NINJA[3];
				case 4 -> CLANS_NINJA[4];				
				default ->
				throw new IllegalArgumentException("Unexpected value: " + alea);
				};
	}
	
	private int extorquerMefiant(Commercant c) {
		return 1;
	}
	
	@Override
	public void extorquer(Commercant c) {
		int ar
	}
	
	public void revenirExtorquer() {
		
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("(mon clan secret est " + this.clanSecretString +" et maintenant que tu le sais, je vais devoir te tuer)");
	}
	

}

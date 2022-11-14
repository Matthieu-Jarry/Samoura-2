package personnages.secondaires;

import java.util.Random;

import personnages.ClanNinja;
import personnages.principaux.Commercant;
import personnages.principaux.Yakuza;

public class Ninja extends Yakuza{
	
	private String clanSecretString;
	private static final int SEUIL_ARGENT = 60; 
	private static final String[] CLANS_NINJA = {"of Shadows", "of Mist", "of Clouds", "of Fog", "of Darkness"};
	private ClanNinja clanSecretObject;
	private Commercant memoire;
	
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
		this.clanSecretObject = new ClanNinja(clanSecretString);
	}
	
	private int extorquerMefiant(Commercant c) {
		int argentInit = getArgent();
		super.extorquer(c);
		return getArgent() - argentInit;
	}
	
	@Override
	public void extorquer(Commercant c) {
		int argentInit = getArgent();
		super.extorquer(c);
		int argentVol = getArgent() - argentInit;
		if (argentVol < SEUIL_ARGENT) {
			memoire = c;
			revenirExtorquer();
		}
	}
	
	public void revenirExtorquer() {
		while (extorquerMefiant(memoire) != 0);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("(mon clan secret est " + this.clanSecretString +" et maintenant que tu le sais, je vais devoir te tuer)");
	}
	

}

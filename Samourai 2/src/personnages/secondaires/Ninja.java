package personnages.secondaires;

import personnages.principaux.Yakuza;

public class Ninja extends Yakuza{
	
	private String clanSecret;
	private static final String[] clansNinja = {"of Shadows", "of Mist", "of Clouds", "of Fog", "of Darkness"};
	
	public Ninja(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson, clan);
	}
	
	@Override
	public void direBonjour() {
		
	}
	

}

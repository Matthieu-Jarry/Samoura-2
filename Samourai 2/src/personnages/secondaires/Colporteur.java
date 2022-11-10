package personnages.secondaires;

import personnages.principaux.Commercant;

public class Colporteur extends Commercant{

	public Colporteur(String nom, int argent) {
		super(nom, argent);
	}
	
	@Override
	public int seFaireExtorquer() {
		int argent = getArgent()/2;
		perdreArgent(argent);
		parler("Je me suis fait extorquer, mais j'ai quand même pu sauver la moitié de mon argent hihihi");
		return argent;
	}

}

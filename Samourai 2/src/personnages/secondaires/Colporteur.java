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
		parler("Je me suis fait extorquer, mais j'ai quand m�me pu sauver la moiti� de mon argent hihihi");
		return argent;
	}

}

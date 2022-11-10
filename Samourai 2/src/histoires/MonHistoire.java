package histoires;

import personnages.Humain;
import personnages.principaux.Commercant;
import personnages.principaux.Ronin;
import personnages.principaux.Yakuza;
import personnages.secondaires.Colporteur;
import personnages.secondaires.GrandMere;
import personnages.secondaires.Ninja;
import personnages.secondaires.Traitre;

public class MonHistoire {

	public static void main(String[] args) {
		  Humain humain = new Humain("Prof", 10, "Porto");
		  humain.direBonjour();
		  humain.boire();
		  Commercant commercant = new Commercant("Marchand", 35);
		  commercant.direBonjour();
		  Yakuza yakusa = new Yakuza("Yaku␣le␣noir", 42,
		                             "biere", "WarSong");
		  yakusa.direBonjour();
		  yakusa.extorquer(commercant);
		  Ronin ronin = new Ronin("Roro", 61, "sake");
		  ronin.donner(10, commercant );
		  ronin.provoquer(yakusa);
		  ronin.direBonjour();
		  
		  Colporteur colporteur = new Colporteur("Matthieu", 60);
		  
		  Traitre traitre = new Traitre("Traitre", 34, "sake", "Miamoto");
		  traitre.direBonjour();
		  traitre.extorquer(commercant);
		  traitre.extorquer(colporteur);
		  traitre.extorquer(colporteur);
		  traitre.extorquer(colporteur);
		  traitre.direBonjour();
		  traitre.faireLeGentil(colporteur, 24);
		  traitre.direBonjour();
		  
		  
		  GrandMere grandMere = new GrandMere("Eliane", 60);
		  grandMere.faireConnaissanceAvec(traitre);
		  grandMere.faireConnaissanceAvec(yakusa);
		  grandMere.ragoter();
		  
		  Ninja ninja = new Ninja("Nagato", 40, "bière", "Long Fangs");
		  ninja.direBonjour();

	}

}

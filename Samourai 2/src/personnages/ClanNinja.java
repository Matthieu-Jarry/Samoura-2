package personnages;

public class ClanNinja {
	
	private static String[] clansNinja = new String[30];
	private String clan;
	
	public ClanNinja(String clan) {
		this.clan = clan;
	}
	
	public static String[] getClans() {
		return clansNinja;
	}
	
	public String getClan() {
		return this.clan;
	}

}

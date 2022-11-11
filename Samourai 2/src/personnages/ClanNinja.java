package personnages;

public class ClanNinja {
	
	private static String[] clansNinja;
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

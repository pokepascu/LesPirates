package plateau;

public enum Type {
	
	NORMALE(13),
	LABUSE(1),
	DUEL(6),
	BONUS(4),
	MALUS(4),
	BONUX(1),
	MALUX(1),
	CASES(30),
	
	
	
	
	private int quantite;
	
	private Type(int quantite) {
		this.quantite = quantite;
	}
	
	public int getQuantite() {
		return quantite;
	}
}




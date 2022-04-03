
public class Sauce implements ISauce {
	private String nom;
	private Piquant niveauPiquant;
	private float kilocaloriesPour100g; // Dépend de la sauce choisie
	private static float quantiteEnGramme = 11.0f; // Même dose pour toutes les sauces
	
	public Sauce(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String nom() {
		return this.nom;
	}

	@Override
	public float getKilocaloriesPour100g() {
		return this.kilocaloriesPour100g;
	}

	@Override
	public void setKilocaloriesPour100g(float kc) {
		this.kilocaloriesPour100g = kc;
	}

	@Override
	public Piquant getNiveauPiquant() {
		return this.niveauPiquant;
	}
	
	@Override
	public void setNiveauPiquant(Piquant p) {
		this.niveauPiquant = p;
	}
	
	public float getQuantiteEnGramme() {
		return Sauce.quantiteEnGramme;
	}
	
	public String toString() {
		return "Sauce '" + nom() + "' (" + Sauce.quantiteEnGramme + "g)";
	}

}

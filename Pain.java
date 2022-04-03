
public class Pain implements IPain {
	private String nom;
	private float kilocaloriesPour100g; // Dépend du pain choisi
	private static float quantiteEnGramme = 55.0f; // Même masse pour tous les pains
	
	public Pain(String nom) {
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
	
	public float getQuantiteEnGramme() {
		return Pain.quantiteEnGramme;
	}
	
	public String toString() {
		return "Pain '" + nom() + "' (" + Pain.quantiteEnGramme + "g)";
	}

}

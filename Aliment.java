
public class Aliment implements IAliment {
	private String nom;
	private float kilocaloriesPour100g;
	
	public Aliment(String nom) {
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

	public String toString() {
		return this.nom;
	}
}


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
	public void setKilocaloriesPour100g(float q) throws nbKcalInvalideException {
		if(q > 0 && q < 1000) {
			this.kilocaloriesPour100g = q;
		} else {
			throw new nbKcalInvalideException();
		}
	}

	public String toString() {
		return this.nom;
	}
}

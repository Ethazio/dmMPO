import java.util.ArrayList;

public class Sandwich <P,S,I> {
	private String nom;
	private P pain;
	private S sauce;
	private ArrayList<Ingredient> ingredients = new ArrayList<>();
	
	public Sandwich(String nom, P pain, S sauce) {
		this.nom = nom;
		this.pain = pain;
		this.sauce = sauce;
	}
	
	public void composer(Ingredient i) throws alimentNonCompatibleException {
		try {
			this.ingredients.add(i);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deplacerIngredient(I ingredient, Sandwich s) {
		// TODO
	}
	
	public boolean ingredientCommun(Sandwich s) {
		// TODO
		return true;
	}
	
	public IAliment getIngredientPlusCaloriquePour100g() {
		// TODO
		return null;
	}

	public IAliment getIngredientPlusCalorique() {
		// TODO
		return null;
	}
	
	public String toString() {
		String res = "Sandwich '" + this.nom + "' :\n  - " + this.pain + "\n  - " + this.sauce;
		if(this.ingredients != null) {
			for(Ingredient ing: this.ingredients) {
				res += "\n  - " + ing;
			}
		}
		return res;
	}
}

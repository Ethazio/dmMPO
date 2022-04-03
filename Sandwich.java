import java.util.ArrayList;

public class Sandwich <P,S,A> {
	private String nom;
	private P pain;
	private S sauce;
	private ArrayList<A> ingredients;
	
	public Sandwich(String nom) {
		this.nom = nom;
	}
	
	public void composer(P pain, S sauce, ArrayList<A> ingredients) {
		this.pain = pain;
		this.sauce = sauce;
		this.ingredients = ingredients;
	}
	
	public void deplacerIngredient(A ingredient, Sandwich s) {
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
		for(A ing: this.ingredients) {
			res += "\n  - " + ing;
		}
		return res;
	}
}

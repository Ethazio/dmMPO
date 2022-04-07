import java.util.ArrayList;
import java.util.Collections;

public class Sandwich <P extends IAliment, S extends IAliment, I extends IAliment> {
	private String nom;
	private Ingredient<P> pain;
	private Ingredient<S> sauce;
	private ArrayList<Ingredient> ingredients = new ArrayList<>();
	
	public Sandwich(String nom, Ingredient<P> pain, Ingredient<S> sauce) {
		this.nom = nom;
		this.pain = pain;
		this.sauce = sauce;
	}
	
	public Ingredient<P> getPain() {
		return this.pain;
	}

	public Ingredient<S> getSauce() {
		return this.sauce;
	}

	public ArrayList<Ingredient> getIngredients() {
		return this.ingredients;
	}
	
	public void composer(Ingredient i) throws alimentNonCompatibleException {
		this.ingredients.add(i);
	}
	
	public void deplacerIngredient(I ingredient, Sandwich s) {
		// TODO
	}
	
	public <X extends IAliment, Y extends IAliment, Z extends IAliment> boolean ingredientCommun(Sandwich<X,Y,Z> s) {
		if(s.getPain().getAliment().equals(this.getPain().getAliment())) {
			return true;
		}
		if(s.getSauce().getAliment().equals(this.getSauce().getAliment())) {
			return true;
		}
		for(Ingredient i: this.getIngredients()) {
			for(Ingredient j: s.getIngredients()) {
				if(i.getAliment().equals(j.getAliment())) {
					return true;
				}
			}
		}
		return false;
	}
	
	public IAliment getIngredientPlusCaloriquePour100g() {
		IAliment res = this.pain.getAliment();
		if(res.getKilocaloriesPour100g() < this.sauce.getAliment().getKilocaloriesPour100g()) {
			res = this.sauce.getAliment();
		}
		for(Ingredient<IAliment> i: ingredients) {
			if(res.getKilocaloriesPour100g() < i.getAliment().getKilocaloriesPour100g()) {
				res = i.getAliment();
			}
		}
		return res;
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

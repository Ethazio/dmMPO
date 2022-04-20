import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Sandwich <P extends IAliment, S extends IAliment, I extends IAliment> implements Iterable<Ingredient> {
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
	
	public String getNom() {
		return this.nom;
	}

	public ArrayList<Ingredient> getIngredients() {
		return this.ingredients;
	}
	
	public void composer(Ingredient i) throws alimentNonCompatibleException {
		this.ingredients.add(i);
	}
	
	public void deplacerIngredient(Ingredient i, Sandwich s) throws alimentNonCompatibleException {
		if(!(i instanceof IPain) && !(i instanceof ISauce) && this.ingredients.contains(i)) {
			s.composer(i);
			ingredients.remove(i);
		} else {
			throw new alimentNonCompatibleException();
		}
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
	
	public IAliment getIngredientPlusCalorique() {
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
	
	public IAliment getIngredientPlusCaloriqueV2() {
		IAliment res = new Aliment(null);
		Iterator<Ingredient> it = this.iterator() ;
		Ingredient<IAliment> ing;
		while (it.hasNext()) {
			ing = it.next();
			if(res.getKilocaloriesPour100g() < ing.getAliment().getKilocaloriesPour100g()) {
				res = ing.getAliment();
			}
		}
		return res;
	}
	
	public IAliment getIngredientPlusCaloriqueV3() {
		return (IAliment) this.stream().max((x, y) -> Float.compare(((IAliment) x.getAliment()).getKilocaloriesPour100g(), ((IAliment) y.getAliment()).getKilocaloriesPour100g())).get().getAliment();
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

	@Override
	public Iterator<Ingredient> iterator() {
		return new SandwichIterator(this);
	}
	
	public Stream<Ingredient> stream() {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(this.iterator(),Spliterator.ORDERED), false);
	}
}

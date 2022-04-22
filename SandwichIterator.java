import java.util.ArrayList;
import java.util.Iterator;

public class SandwichIterator implements Iterator<Ingredient> {
	private ArrayList<Ingredient> liste = new ArrayList<>();
	private Iterator<Ingredient> iterateur_elements;
	
	public SandwichIterator(Sandwich s) {
		liste.add(s.getPain());
		liste.add(s.getSauce());
		liste.addAll(s.getIngredients());
		iterateur_elements = liste.iterator();
	}
	
	@Override
	public boolean hasNext() {
		return iterateur_elements.hasNext();
	}

	@Override
	public Ingredient next() {
		return iterateur_elements.next();
	}
	
}

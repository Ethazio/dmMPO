
public class SandwichVegetarien<P extends IAliment, S extends IAliment, I extends IAliment> extends Sandwich<P, S, I> {
	
	public SandwichVegetarien(String nom, Ingredient<P> pain, Ingredient<S> sauce) {
		super(nom, pain, sauce);
	}

	public void composer(Ingredient i) throws alimentNonCompatibleException {
		if(!(i.getAliment() instanceof IAlimentVegetarien)) {
			throw new alimentNonCompatibleException();
		} else {
			super.composer(i);
		}
	}
	
}


public class SandwichVegan<P extends IPain, S extends ISauce, I extends IAliment> extends SandwichVegetarien<P, S, I> {
	
	public SandwichVegan(String nom, Ingredient<P> pain, Ingredient<S> sauce) {
		super(nom, pain, sauce);
	}

	public void composer(Ingredient i) throws alimentNonCompatibleException {
		if(!(i.getAliment() instanceof IAlimentVegan)) {
			throw new alimentNonCompatibleException();
		} else {
			super.composer(i);
		}
	}
}

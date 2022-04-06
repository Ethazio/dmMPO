
public class SandwichVegetarien<P,S,I> extends Sandwich<P,S,I> {
	
	public SandwichVegetarien(String nom, P pain, S sauce) {
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

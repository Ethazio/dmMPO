
public class Ingredient<A> {
	private A aliment;
	private float quantiteEnGramme;
	
	public Ingredient() {
		
	}
	
	public A getAliment() {
		return this.aliment;
	}
	
	public void setAliment(A a) {
		this.aliment = a;
	}
	
	public float getQuantiteEnGramme() {
		return this.quantiteEnGramme;
	}
	
	public void setQuantiteEnGramme(float q) {
		this.quantiteEnGramme = q;
	}
	
	public String toString() {
		return aliment + " (" + this.quantiteEnGramme + "g)";
	}
}

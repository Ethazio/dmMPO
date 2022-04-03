
public interface IAliment {
	String nom();
	float getKilocaloriesPour100g();
	void setKilocaloriesPour100g(float kc);
	static float tauxConversionKcalVersKj() {
		return 4.1868f; // 1 kcal = 4.1868 kJ
	};
}

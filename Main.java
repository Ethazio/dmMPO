import java.util.ArrayList;
import java.util.Scanner;

// Source pour les valeurs caloriques : https://www.infocalories.fr/

public class Main {

	public static void main(String[] args) {
		
		IAlimentVegan tomate = new AlimentVegan("tomate");
		try {
			tomate.setKilocaloriesPour100g(21.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		Ingredient<IAlimentVegan> trancheTomate = new Ingredient<>();
		trancheTomate.setAliment(tomate);
		trancheTomate.setQuantiteEnGramme(50.0f);
		
		IAlimentVegan salade = new AlimentVegan("salade");
		try {
			salade.setKilocaloriesPour100g(13.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		Ingredient<IAlimentVegan> feuilleSalade = new Ingredient<>();
		feuilleSalade.setAliment(salade);
		feuilleSalade.setQuantiteEnGramme(15.0f);
		
//		IAliment bacon = new Aliment("bacon");
//		Ingredient<IAliment> trancheBacon = new Ingredient<>();
//		trancheBacon.setAliment(bacon);
//		trancheBacon.setQuantiteEnGramme(80.0f);
		
		IPain painComplet = new Pain("complet");
		try {
			painComplet.setKilocaloriesPour100g(200.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		
		IPain painItalien = new Pain("italien");
		try {
			painItalien.setKilocaloriesPour100g(200.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		
		ISauce ketchup = new Sauce("ketchup");
		try {
			ketchup.setKilocaloriesPour100g(100.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		
		ISauce mayo = new Sauce("mayo");
		try {
			mayo.setKilocaloriesPour100g(100.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		
		
		Ingredient<IPain> tranchePainComplet = new Ingredient<>();
		tranchePainComplet.setAliment(painComplet);
		tranchePainComplet.setQuantiteEnGramme(300.0f);
				
		Ingredient<ISauce> doseketchup = new Ingredient<>();
		doseketchup.setAliment(ketchup);
		doseketchup.setQuantiteEnGramme(30.0f);
		
		Ingredient<IPain> tranchePainItalien = new Ingredient<>();
		tranchePainItalien.setAliment(painItalien);
		tranchePainItalien.setQuantiteEnGramme(300.0f);
		
		Ingredient<ISauce> dosemayo = new Ingredient<>();
		dosemayo.setAliment(mayo);
		dosemayo.setQuantiteEnGramme(30.0f);
		
		
		
		
		SandwichVegan<IPain, ISauce, IAlimentVegan> bizarre = new SandwichVegan<>("bizarre", tranchePainComplet, doseketchup);
		Sandwich<IPain, ISauce, IAliment> chelou = new Sandwich<>("chelou", tranchePainItalien, dosemayo);

		try {
			bizarre.composer(feuilleSalade);
			bizarre.composer(trancheTomate);
		} catch (alimentNonCompatibleException e) {
			System.out.println("tu ne peux pas faire cela");
		}
		
		System.out.println(bizarre);
		System.out.println(chelou);
		
		System.out.println(bizarre.ingredientCommun(chelou));
		
//		ArrayList<Sandwich> sandwichs = new ArrayList<>();
//		
//		System.out.println("-----------------------");
//		System.out.println("Bienvenue chez Subway !");
//		System.out.println("-----------------------");
//		System.out.println("Que voulez-vous faire ?");
//		System.out.println("[1] : Créer un sandwich");
//		System.out.println("[2] : Voir vos sandwichs");
//		System.out.println("[3] : Manger un sandwich");
//		Scanner scan = new Scanner(System.in);
//		String choix = scan.next();
//		switch(choix) {
//			case "1":
//				System.out.println("-- Création de votre sandwich --");
//				
//				// NOM DU SANDWICH
//				String nom;
//				System.out.println("Entrez le nom de votre nouveau sandwich (pas d'espaces) :");
//				nom = scan.next();
//				
//				// REGIME
//				String typeRegime;
//				do {
//					System.out.println("Suivez-vous un régime particulier ?");
//					System.out.println("[1] : Non");
//					System.out.println("[2] : Oui, végétarien");
//					System.out.println("[3] : Oui, végan");
//					typeRegime = scan.next();
//				} while(!typeRegime.equals("1") && !typeRegime.equals("2") && !typeRegime.equals("3"));
//				String regime = "";
//				switch(typeRegime) {
//					case "1":
//						regime = "non";
//						break;
//					case "2":
//						regime = "végétarien";
//						break;
//					case "3":
//						regime = "végan";
//						break;
//				}
//				
//				// PAIN
//				String typePain;
//				do {
//					System.out.println("Quel pain désirez-vous ?");
//					System.out.println("[1] : Normal");
//					System.out.println("[2] : Sésames");
//					System.out.println("[3] : Multi-céréales");
//					typePain = scan.next();
//				} while(!typePain.equals("1") && !typePain.equals("2") && !typePain.equals("3"));
//				IPain pain = null;
//				switch(typePain) {
//					case "1":
//						pain = new Pain("Normal");
//						pain.setKilocaloriesPour100g(249.0f);
//						break;
//					case "2":
//						pain = new Pain("Sésames");
//						pain.setKilocaloriesPour100g(289.0f);
//						break;
//					case "3":
//						pain = new Pain("Multi-céréales");
//						pain.setKilocaloriesPour100g(294.0f);
//						break;
//				}
//				
//				// SAUCE
//				String typeSauce;
//				do {
//					System.out.println("Quelle sauce désirez-vous ?");
//					System.out.println("[1] : Ketchup");
//					System.out.println("[2] : Mayonaise");
//					System.out.println("[3] : Moutarde");
//					typeSauce = scan.next();
//				} while(!typeSauce.equals("1") && !typeSauce.equals("2") && !typeSauce.equals("3"));
//				ISauce sauce = null;
//				switch(typeSauce) {
//					case "1":
//						sauce = new Sauce("Ketchup");
//						sauce.setKilocaloriesPour100g(112.0f);
//						sauce.setNiveauPiquant(Piquant.DOUX);
//						break;
//					case "2":
//						sauce = new Sauce("Mayonaise");
//						sauce.setKilocaloriesPour100g(687.0f);
//						sauce.setNiveauPiquant(Piquant.DOUX);
//						break;
//					case "3":
//						sauce = new Sauce("Moutarde");
//						sauce.setKilocaloriesPour100g(155.0f);
//						sauce.setNiveauPiquant(Piquant.FORT);
//						break;
//				}
//				
//				// INGREDIENTS
//				ArrayList<Ingredient> ingredients = new ArrayList<>();
//				String typeIngr;
//				do {
//					System.out.println("Quel ingrédient désirez-vous ?");
//					System.out.println("[1] : Tomate");
//					System.out.println("[2] : Salade");
//					System.out.println("[3] : Jambon");
//					System.out.println("[4] : Beurre");
//					System.out.println("[5] : Oeuf");
//					System.out.println("[6] : Oignon");
//					System.out.println("[7] : Ce sera tout !");
//					typeIngr = scan.next();
//					Ingredient ingr = null;
//					switch(typeIngr) {
//						case "1":
//							ingr = new Ingredient<IAlimentVegan>();
//							IAlimentVegan tomate = new AlimentVegan("Tomate");
//							tomate.setKilocaloriesPour100g(21.0f);
//							ingr.setAliment(tomate);
//							ingr.setQuantiteEnGramme(12.0f);
//							break;
//						case "2":
//							ingr = new Ingredient<IAlimentVegan>();
//							IAlimentVegan salade = new AlimentVegan("Salade");
//							salade.setKilocaloriesPour100g(13.0f);
//							ingr.setAliment(salade);
//							ingr.setQuantiteEnGramme(4.0f);
//							break;
//						case "3":
//							ingr = new Ingredient<IAlimentVegan>();
//							IAliment jambon = new Aliment("Jambon");
//							jambon.setKilocaloriesPour100g(134.0f);
//							ingr.setAliment(jambon);
//							ingr.setQuantiteEnGramme(50.0f);
//							break;
//						case "4":
//							ingr = new Ingredient<IAlimentVegan>();
//							IAlimentVegan beurre = new AlimentVegan("Beurre");
//							beurre.setKilocaloriesPour100g(760.0f);
//							ingr.setAliment(beurre);
//							ingr.setQuantiteEnGramme(12.5f);
//							break;
//						case "5":
//							ingr = new Ingredient<IAlimentVegan>();
//							IAlimentVegan oeuf = new AlimentVegan("Oeuf");
//							oeuf.setKilocaloriesPour100g(73.0f);
//							ingr.setAliment(oeuf);
//							ingr.setQuantiteEnGramme(60.0f);
//							break;
//						case "6":
//							ingr = new Ingredient<IAlimentVegan>();
//							IAlimentVegan oignon = new AlimentVegan("Oignon");
//							oignon.setKilocaloriesPour100g(43.0f);
//							ingr.setAliment(oignon);
//							ingr.setQuantiteEnGramme(12.0f);
//							break;
//					}
//					if(ingr != null) {
//						ingredients.add(ingr);
//					}
//				} while(!typeIngr.equals("7"));
//				
//				// CREATION SANDWICH
//				Sandwich s;
//				switch(regime) {
//					case "non":
//						s = new Sandwich<IPain, ISauce, IAliment>(nom, pain, sauce);
//						break;
//					case "végétarien":
//						s = new Sandwich<IPain, ISauce, IAlimentVegetarien>(nom, pain, sauce);
//						break;
//					case "végan":
//						s = new Sandwich<IPain, ISauce, IAlimentVegan>(nom, pain, sauce);
//						break;
//					default:
//						s = new Sandwich<IPain, ISauce, IAliment>(nom, pain, sauce);
//						break;
//				}
//				s.composer(ingredients);
//				System.out.println("Récapitulatif de votre sandwich :");
//				System.out.println(s);
//				System.out.println("C'est bon pour vous ?");
//				System.out.println("[1] Oui");
//				System.out.println("[2] Non");
//				String ok = scan.next();
//				if(ok.equals("1")) {
//					System.out.println("Ok, je vous l'amène tout de suite.");
//					sandwichs.add(s);
//				} else {
//					System.out.println("Ah mince, désolé !");
//				}
//				break;
//			case "2":
//				System.out.println("Voici vos sandwich :");
//				break;
//			case "3":
//				System.out.println("Entrez le nom du sandwich que vous voulez manger :");
//				break;
//			default:
//				System.out.println("Ce choix n'existe pas !");
//		}
//		System.out.println("Merci, au revoir !");
//		scan.close();
	}

}

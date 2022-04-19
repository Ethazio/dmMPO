import java.util.ArrayList;
import java.util.Scanner;

// Source pour les valeurs caloriques : https://www.infocalories.fr/

public class Main {

	public static void main(String[] args) {
		/*
		IPain painBlanc = new Pain("blanc");
		try {
			painBlanc.setKilocaloriesPour100g(216.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		
		ISauce sauceKetchup = new Sauce("ketchup");
		try {
			sauceKetchup.setKilocaloriesPour100g(112.0f);
			sauceKetchup.setNiveauPiquant(Piquant.TRES_DOUX);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		
		IAliment steakBoeuf = new Aliment("steak boeuf");
		try {
			steakBoeuf.setKilocaloriesPour100g(211.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		
		IAlimentVegan tomate = new AlimentVegan("tomate");
		try {
			tomate.setKilocaloriesPour100g(21.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		
		IAlimentVegetarien oeuf = new AlimentVegetarien("oeuf");
		try {
			oeuf.setKilocaloriesPour100g(73.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		
		Ingredient<IPain> tranchePain = new Ingredient<>();
		tranchePain.setAliment(painBlanc);
		tranchePain.setQuantiteEnGramme(78.0f);
		Ingredient<ISauce> doseSauce = new Ingredient<>();
		doseSauce.setAliment(sauceKetchup);
		doseSauce.setQuantiteEnGramme(30.0f);
		Ingredient steakBoeufaa = new Ingredient<IAliment>();
		steakBoeufaa.setAliment(steakBoeuf);
		steakBoeufaa.setQuantiteEnGramme(200.0f);
		Sandwich<IPain,ISauce,IAliment> s = new Sandwich<>("aa",tranchePain,doseSauce);
		try {
			s.composer(steakBoeufaa);
		} catch (alimentNonCompatibleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Ingredient<IPain> tranchePain2 = new Ingredient<>();
		tranchePain2.setAliment(painBlanc);
		tranchePain2.setQuantiteEnGramme(78.0f);
		Ingredient<ISauce> doseSauce2 = new Ingredient<>();
		doseSauce2.setAliment(sauceKetchup);
		doseSauce2.setQuantiteEnGramme(30.0f);
		Ingredient<IAlimentVegetarien> trancheOeuf = new Ingredient<>();
		trancheOeuf.setAliment(oeuf);
		trancheOeuf.setQuantiteEnGramme(30.0f);
		
		SandwichVegetarien<IPain,ISauce,IAliment> s2 = new SandwichVegetarien<>("bb",tranchePain2,doseSauce2);
		try {
			s2.composer(trancheOeuf);
		} catch (alimentNonCompatibleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(s);
		System.out.println(s2);
		
		try {
			s.deplacerIngredient(tranchePain, s2);
		} catch (alimentNonCompatibleException e) {
			System.out.println("NOPE");
		}
		
		try {
			s2.deplacerIngredient(trancheOeuf, s);
		} catch (alimentNonCompatibleException e) {
			System.out.println("NOPEE");
		}
		
		System.out.println(s);
		System.out.println(s2);
		*/
		
	
		// CREATION DES PAINS
		IPain painBlanc = new Pain("blanc");
		try {
			painBlanc.setKilocaloriesPour100g(216.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		
		IPain painComplet = new Pain("complet");
		try {
			painComplet.setKilocaloriesPour100g(189.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		
		IPain painItalien = new Pain("italien");
		try {
			painItalien.setKilocaloriesPour100g(200.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		
		
		// CREATION DES SAUCES
		ISauce sauceKetchup = new Sauce("ketchup");
		try {
			sauceKetchup.setKilocaloriesPour100g(112.0f);
			sauceKetchup.setNiveauPiquant(Piquant.TRES_DOUX);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		
		ISauce sauceMayo = new Sauce("mayo");
		try {
			sauceMayo.setKilocaloriesPour100g(687.0f);
			sauceMayo.setNiveauPiquant(Piquant.TRES_DOUX);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		
		ISauce sauceMoutarde = new Sauce("moutarde");
		try {
			sauceMoutarde.setKilocaloriesPour100g(155.0f);
			sauceMoutarde.setNiveauPiquant(Piquant.DOUX);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		
		
		// CREATION DES INGREDIENTS
		IAlimentVegan tomate = new AlimentVegan("tomate");
		try {
			tomate.setKilocaloriesPour100g(21.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		
		IAlimentVegan salade = new AlimentVegan("salade");
		try {
			salade.setKilocaloriesPour100g(13.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		
		IAliment bacon = new Aliment("bacon");
		try {
			bacon.setKilocaloriesPour100g(541.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		
		IAlimentVegan concombre = new AlimentVegan("concombre");
		try {
			concombre.setKilocaloriesPour100g(10.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		
		IAlimentVegetarien oeuf = new AlimentVegetarien("oeuf");
		try {
			oeuf.setKilocaloriesPour100g(73.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		
		IAlimentVegan oignon = new AlimentVegan("oignon");
		try {
			oignon.setKilocaloriesPour100g(43.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		
		IAliment steakBoeuf = new Aliment("steak boeuf");
		try {
			steakBoeuf.setKilocaloriesPour100g(211.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		
		IAlimentVegan steakSoja = new AlimentVegan("steak soja");
		try {
			steakSoja.setKilocaloriesPour100g(177.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		
		IAliment poulet = new Aliment("poulet");
		try {
			poulet.setKilocaloriesPour100g(102.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		
		IAlimentVegan avocat = new AlimentVegan("avocat");
		try {
			avocat.setKilocaloriesPour100g(360.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		
		IAlimentVegan tofu = new AlimentVegan("tofu");
		try {
			tofu.setKilocaloriesPour100g(76.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		
		IAliment thon = new Aliment("thon");
		try {
			thon.setKilocaloriesPour100g(117.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		
		IAlimentVegetarien cheddar = new AlimentVegetarien("cheddar");
		try {
			cheddar.setKilocaloriesPour100g(402.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		
		IAlimentVegetarien feta = new AlimentVegetarien("feta");
		try {
			feta.setKilocaloriesPour100g(264.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("frerot t'abuses");
		}
		
		
		// DEBUT DU PROGRAMME
		ArrayList<Sandwich> sandwichs = new ArrayList<>();
		
		System.out.println("-----------------------------");
		System.out.println("Bienvenue chez PXXLSandwich !");
		System.out.println("-----------------------------");
		Scanner scan = new Scanner(System.in);
		String choix = "";
		do {
			System.out.println("\nQue voulez-vous faire ?");
			System.out.println("[1] : Créer un sandwich");
			System.out.println("[2] : Voir vos sandwichs");
			System.out.println("[3] : Manger un sandwich");
			System.out.println("[4] : Savoir si ingrédient en commun entre A et B");
			System.out.println("[5] : Déplacer un aliment de A vers B");
			System.out.println("[6] : Quitter le restaurant");
			choix = scan.next();
			switch(choix) {
				case "1":
					System.out.println("-- Création de votre sandwich --");
					
					// NOM DU SANDWICH
					String nom = "";
					boolean nomOK = false;
					while(!nomOK) {
						nomOK = true;
						System.out.println("Entrez le nom de votre nouveau sandwich (pas d'espaces) :");
						nom = scan.next();
						for(Sandwich s: sandwichs) {
							if(nom.equals(s.getNom())) {
								System.out.println("Ce nom est déjà utilisé !");
								nomOK = false;
							}
						}
					}
					
					// REGIME
					String typeRegime;
					do {
						System.out.println("Suivez-vous un régime particulier ?");
						System.out.println("[1] : Non");
						System.out.println("[2] : Oui, végétarien");
						System.out.println("[3] : Oui, végan");
						typeRegime = scan.next();
					} while(!typeRegime.equals("1") && !typeRegime.equals("2") && !typeRegime.equals("3"));
					String regime = "";
					switch(typeRegime) {
						case "1":
							regime = "non";
							break;
						case "2":
							regime = "végétarien";
							break;
						case "3":
							regime = "végan";
							break;
					}
					
					// PAIN
					String typePain;
					do {
						System.out.println("Quel pain désirez-vous ?");
						System.out.println("[1] : Blanc");
						System.out.println("[2] : Complet");
						System.out.println("[3] : Italien");
						typePain = scan.next();
					} while(!typePain.equals("1") && !typePain.equals("2") && !typePain.equals("3"));
					Ingredient<IPain> tranchePain = new Ingredient<>();
					switch(typePain) {
						case "1":
							tranchePain.setAliment(painBlanc);
							tranchePain.setQuantiteEnGramme(78.0f);
							break;
						case "2":
							tranchePain.setAliment(painComplet);
							tranchePain.setQuantiteEnGramme(82.0f);
							break;
						case "3":
							tranchePain.setAliment(painItalien);
							tranchePain.setQuantiteEnGramme(71.0f);
							break;
					}
					
					// SAUCE
					String typeSauce;
					do {
						System.out.println("Quelle sauce désirez-vous ?");
						System.out.println("[1] : Ketchup");
						System.out.println("[2] : Mayonaise");
						System.out.println("[3] : Moutarde");
						typeSauce = scan.next();
					} while(!typeSauce.equals("1") && !typeSauce.equals("2") && !typeSauce.equals("3"));
					Ingredient<ISauce> doseSauce = new Ingredient<>();
					switch(typeSauce) {
						case "1":
							doseSauce.setAliment(sauceKetchup);
							doseSauce.setQuantiteEnGramme(30.0f);
							break;
						case "2":
							doseSauce.setAliment(sauceMayo);
							doseSauce.setQuantiteEnGramme(30.0f);
							break;
						case "3":
							doseSauce.setAliment(sauceMoutarde);
							doseSauce.setQuantiteEnGramme(30.0f);
							break;
					}
					
					Sandwich s;
					switch(regime) {
						case "non":
							s = new Sandwich<IPain, ISauce, IAliment>(nom, tranchePain, doseSauce);
							break;
						case "végétarien":
							s = new SandwichVegetarien<IPain, ISauce, IAlimentVegetarien>(nom, tranchePain, doseSauce);
							break;
						case "végan":
							s = new SandwichVegan<IPain, ISauce, IAlimentVegan>(nom, tranchePain, doseSauce);
							break;
						default:
							s = new Sandwich<IPain, ISauce, IAliment>(nom, tranchePain, doseSauce);
							break;
					}
					
					// INGREDIENTS
					String nomIngr;
					System.out.println("Tapez le nom de l'ingrédient que vous désirez (ou 'ok' si terminé) :");
					System.out.println("- SteakBoeuf");
					System.out.println("- Bacon");
					System.out.println("- Poulet");
					System.out.println("- Thon");
					System.out.println("- Oeuf");
					System.out.println("- Tofu");
					System.out.println("- SteakSoja");
					System.out.println("- Tomate");
					System.out.println("- Salade");
					System.out.println("- Concombre");
					System.out.println("- Avocat");
					System.out.println("- Oignon");
					System.out.println("- Cheddar");
					System.out.println("- Feta");
					do {
						nomIngr = scan.next().toLowerCase();
						Ingredient ingr = null;
						switch(nomIngr) {
							case "ok":
								break;
							case "steakboeuf":
								ingr = new Ingredient<IAliment>();
								ingr.setAliment(steakBoeuf);
								ingr.setQuantiteEnGramme(200.0f);
								break;
							case "bacon":
								ingr = new Ingredient<IAliment>();
								ingr.setAliment(bacon);
								ingr.setQuantiteEnGramme(18.0f);
								break;
							case "poulet":
								ingr = new Ingredient<IAliment>();
								ingr.setAliment(poulet);
								ingr.setQuantiteEnGramme(210.0f);
								break;
							case "thon":
								ingr = new Ingredient<IAliment>();
								ingr.setAliment(thon);
								ingr.setQuantiteEnGramme(150.0f);
								break;
							case "oeuf":
								ingr = new Ingredient<IAlimentVegetarien>();
								ingr.setAliment(oeuf);
								ingr.setQuantiteEnGramme(70.0f);
								break;
							case "tofu":
								ingr = new Ingredient<IAlimentVegan>();
								ingr.setAliment(tofu);
								ingr.setQuantiteEnGramme(100.0f);
								break;
							case "steaksoja":
								ingr = new Ingredient<IAlimentVegan>();
								ingr.setAliment(steakSoja);
								ingr.setQuantiteEnGramme(180.0f);
								break;
							case "tomate":
								ingr = new Ingredient<IAlimentVegan>();
								ingr.setAliment(tomate);
								ingr.setQuantiteEnGramme(34.0f);
								break;
							case "salade":
								ingr = new Ingredient<IAlimentVegan>();
								ingr.setAliment(salade);
								ingr.setQuantiteEnGramme(21.0f);
								break;
							case "concombre":
								ingr = new Ingredient<IAlimentVegan>();
								ingr.setAliment(concombre);
								ingr.setQuantiteEnGramme(17.0f);
								break;
							case "avocat":
								ingr = new Ingredient<IAlimentVegan>();
								ingr.setAliment(avocat);
								ingr.setQuantiteEnGramme(35.0f);
								break;
							case "oignon":
								ingr = new Ingredient<IAlimentVegan>();
								ingr.setAliment(oignon);
								ingr.setQuantiteEnGramme(7.0f);
								break;
							case "cheddar":
								ingr = new Ingredient<IAlimentVegetarien>();
								ingr.setAliment(cheddar);
								ingr.setQuantiteEnGramme(14.0f);
								break;
							case "feta":
								ingr = new Ingredient<IAlimentVegetarien>();
								ingr.setAliment(feta);
								ingr.setQuantiteEnGramme(14.0f);
								break;
							default:
								System.out.println("Cet ingrédient n'existe pas !");
						}
						if(ingr != null) {
							try {
								s.composer(ingr);
								System.out.println("Ingrédient ajouté !");
							} catch (alimentNonCompatibleException e) {
								System.out.println("Cet ingrédient est incompatible avec votre régime alimentaire !");
							}
						}
					} while(!nomIngr.equals("ok"));
					
					// CREATION SANDWICH
					System.out.println("Récapitulatif de votre commande :");
					System.out.println(s);
					System.out.println("C'est bon pour vous ?");
					System.out.println("[1] Oui");
					System.out.println("[2] Non");
					String ok = scan.next();
					if(ok.equals("1")) {
						System.out.println("Ok, je vous l'amène tout de suite.");
						sandwichs.add(s);
					} else {
						System.out.println("Ah mince, désolé !");
					}
					break;
				case "2":
					if(sandwichs.isEmpty()) {
						System.out.println("Vous n'avez pas de sandwich. Une petite faim ?");
					} else {
						System.out.println("Voici vos sandwich :");
						for(Sandwich sand: sandwichs) {
							System.out.println(sand);
							System.out.println("  > Ingrédient le plus calorique : " + sand.getIngredientPlusCaloriquePour100g() + " avec " + sand.getIngredientPlusCaloriquePour100g().getKilocaloriesPour100g() + " kcal/100g");
						}
					}
					break;
				case "3":
					System.out.println("Entrez l'index du sandwich que vous voulez manger :");
					int index = scan.nextInt();
					if(index >= sandwichs.size()) {
						System.out.println("Index invalide !");
					} else {
						sandwichs.remove(index);
						System.out.println("* miam *\nAppétissant !");
					}
					break;
				case "4":
					System.out.println("Entrez l'index du sandwich A :");
					int indexA = scan.nextInt();
					if(indexA >= sandwichs.size()) {
						System.out.println("Index invalide !");
						break;
					}
					System.out.println("Entrez l'index du sandwich B :");
					int indexB = scan.nextInt();
					if(indexB >= sandwichs.size()) {
						System.out.println("Index invalide !");
						break;
					}
					if(sandwichs.get(indexA).ingredientCommun(sandwichs.get(indexB))) {
						System.out.println("Les sandwichs A et B ont au moins 1 ingrédient en commun");
					} else {
						System.out.println("Les sandwichs A et B n'ont aucun ingrédient en commun");
					}
					break;
				case "5":
					System.out.println("Entrez l'index du sandwich duquel enlever l'ingrédient :");
					int index1 = scan.nextInt();
					if(index1 >= sandwichs.size()) {
						System.out.println("Index invalide !");
						break;
					}
					System.out.println("Entrez l'index du sandwich auquel ajouter l'ingrédient :");
					int index2 = scan.nextInt();
					if(index2 >= sandwichs.size()) {
						System.out.println("Index invalide !");
						break;
					}
					System.out.println("Choisissez un ingrédient à déplacer :");
					for(int i=0; i<sandwichs.get(index1).getIngredients().size(); i++) {
						System.out.println("[" + i + "] " + sandwichs.get(index1).getIngredients().get(i));
					}
					int ingrId = scan.nextInt();
					if(ingrId >= sandwichs.get(index1).getIngredients().size()) {
						System.out.println("Index invalide !");
						break;
					}
					Ingredient aDeplacer = (Ingredient) sandwichs.get(index1).getIngredients().get(ingrId);
					try {
						sandwichs.get(index1).deplacerIngredient(aDeplacer, sandwichs.get(index2));
						System.out.println("Ingrédient déplacé avec succès !");
					} catch (alimentNonCompatibleException e) {
						System.out.println("Impossible de déplacer cet ingrédient !");
					}
					break;
				case "6":
					System.out.println("Merci, au revoir !");
					break;
				default:
					System.out.println("Ce choix n'existe pas !");
			}
		} while(!choix.equals("6"));
		scan.close();
	}
}

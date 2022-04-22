import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// Source pour les valeurs caloriques : https://www.infocalories.fr/

public class Main {

	public static void main1() {

		//---- Création des aliments ----//
		
		IPain painBlanc = new Pain("blanc");
		try {
			painBlanc.setKilocaloriesPour100g(216.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("Le nombre de kilocalories pour 100g doit être compris entre 0 et 1000");
		}

		IPain painComplet = new Pain("complet");
		try {
			painComplet.setKilocaloriesPour100g(189.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("Le nombre de kilocalories pour 100g doit être compris entre 0 et 1000");
		}

		ISauce sauceKetchup = new Sauce("ketchup");
		try {
			sauceKetchup.setKilocaloriesPour100g(112.0f);
			sauceKetchup.setNiveauPiquant(Piquant.TRES_DOUX);
		} catch (nbKcalInvalideException e1) {
			System.out.println("Le nombre de kilocalories pour 100g doit être compris entre 0 et 1000");
		}

		ISauce sauceMayonnaise = new Sauce("mayonnaise");
		try {
			sauceMayonnaise.setKilocaloriesPour100g(687.0f);
			sauceMayonnaise.setNiveauPiquant(Piquant.TRES_DOUX);
		} catch (nbKcalInvalideException e1) {
			System.out.println("Le nombre de kilocalories pour 100g doit être compris entre 0 et 1000");
		}

		IAliment steakBoeuf = new Viande("steak boeuf");
		try {
			steakBoeuf.setKilocaloriesPour100g(211.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("Le nombre de kilocalories pour 100g doit être compris entre 0 et 1000");
		}

		IAlimentVegan steakSoja = new AlimentVegan("steak soja");
		try {
			steakSoja.setKilocaloriesPour100g(177.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("Le nombre de kilocalories pour 100g doit être compris entre 0 et 1000");
		}

		IAlimentVegan tomate = new Legume("tomate");
		try {
			tomate.setKilocaloriesPour100g(21.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("Le nombre de kilocalories pour 100g doit être compris entre 0 et 1000");
		}

		IAlimentVegan salade = new Legume("salade");
		try {
			salade.setKilocaloriesPour100g(13.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("Le nombre de kilocalories pour 100g doit être compris entre 0 et 1000");
		}

		IAlimentVegetarien oeuf = new AlimentVegetarien("oeuf");
		try {
			oeuf.setKilocaloriesPour100g(73.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("Le nombre de kilocalories pour 100g doit être compris entre 0 et 1000");
		}

		IAlimentVegan avocat = new Legume("avocat");
		try {
			avocat.setKilocaloriesPour100g(360.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("Le nombre de kilocalories pour 100g doit être compris entre 0 et 1000");
		}

		IAlimentVegetarien cheddar = new ProduitLaitier("cheddar");
		try {
			cheddar.setKilocaloriesPour100g(402.0f);
		} catch (nbKcalInvalideException e1) {
			System.out.println("Le nombre de kilocalories pour 100g doit être compris entre 0 et 1000");
		}

		//---- Sandwich n°1 ----//

		Ingredient<IPain> tranchePainComplet = new Ingredient<>();
		tranchePainComplet.setAliment(painComplet);
		tranchePainComplet.setQuantiteEnGramme(78.0f);

		Ingredient<ISauce> doseSauceKetchup = new Ingredient<>();
		doseSauceKetchup.setAliment(sauceKetchup);
		doseSauceKetchup.setQuantiteEnGramme(30.0f);

		Ingredient<IAliment> partSteakBoeuf = new Ingredient<>();
		partSteakBoeuf.setAliment(steakBoeuf);
		partSteakBoeuf.setQuantiteEnGramme(200.0f);

		Ingredient<IAlimentVegan> trancheTomate = new Ingredient<>();
		trancheTomate.setAliment(tomate);
		trancheTomate.setQuantiteEnGramme(200.0f);

		Ingredient<IAlimentVegan> feuilleSalade = new Ingredient<>();
		feuilleSalade.setAliment(salade);
		feuilleSalade.setQuantiteEnGramme(200.0f);

		Sandwich<IPain, ISauce, IAliment> sandwich = new Sandwich<>("Mon Sandwich préféré", tranchePainComplet, doseSauceKetchup);
		try {
			sandwich.composer(partSteakBoeuf);
			sandwich.composer(trancheTomate);
			sandwich.composer(feuilleSalade);
		} catch (alimentNonCompatibleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//---- Sandwich n°2 ----//

		Ingredient<IPain> tranchePainBlanc = new Ingredient<>();
		tranchePainBlanc.setAliment(painBlanc);
		tranchePainBlanc.setQuantiteEnGramme(78.0f);

		Ingredient<ISauce> doseSauceMayonnaise = new Ingredient<>();
		doseSauceMayonnaise.setAliment(sauceMayonnaise);
		doseSauceMayonnaise.setQuantiteEnGramme(30.0f);

		Ingredient<IAlimentVegetarien> oeufDur = new Ingredient<>();
		oeufDur.setAliment(oeuf);
		oeufDur.setQuantiteEnGramme(200.0f);

		Ingredient<IAlimentVegan> feuilleSalade2 = new Ingredient<>();
		feuilleSalade2.setAliment(salade);
		feuilleSalade2.setQuantiteEnGramme(200.0f);

		Ingredient<IAlimentVegetarien> trancheCheddar = new Ingredient<>();
		trancheCheddar.setAliment(cheddar);
		trancheCheddar.setQuantiteEnGramme(200.0f);

		SandwichVegetarien<IPain, ISauce, IAlimentVegetarien> sandwichVegetarien = new SandwichVegetarien<>("Mon Sandwich végétarien", tranchePainBlanc, doseSauceMayonnaise);
		try {
			sandwichVegetarien.composer(oeufDur);
			sandwichVegetarien.composer(feuilleSalade);
			sandwichVegetarien.composer(trancheCheddar);
		} catch (alimentNonCompatibleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//---- Sandwich n°3 ----//

		Ingredient<IPain> tranchePainComplet2 = new Ingredient<>();
		tranchePainComplet2.setAliment(painComplet);
		tranchePainComplet2.setQuantiteEnGramme(78.0f);

		Ingredient<ISauce> doseSauceKetchup2 = new Ingredient<>();
		doseSauceKetchup2.setAliment(sauceKetchup);
		doseSauceKetchup2.setQuantiteEnGramme(30.0f);

		Ingredient<IAlimentVegan> partSteakSoja = new Ingredient<>();
		partSteakSoja.setAliment(steakSoja);
		partSteakSoja.setQuantiteEnGramme(200.0f);

		Ingredient<IAlimentVegan> morceauAvocat = new Ingredient<>();
		morceauAvocat.setAliment(avocat);
		morceauAvocat.setQuantiteEnGramme(200.0f);

		Ingredient<IAlimentVegan> trancheTomate2 = new Ingredient<>();
		trancheTomate2.setAliment(tomate);
		trancheTomate2.setQuantiteEnGramme(200.0f);

		SandwichVegan<IPain, ISauce, IAlimentVegan> sandwichVegan = new SandwichVegan<>("Mon Sandwich vegan", tranchePainComplet, doseSauceKetchup);
		try {
			sandwichVegan.composer(partSteakSoja);
			sandwichVegan.composer(morceauAvocat);
			sandwichVegan.composer(trancheTomate);
		} catch (alimentNonCompatibleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Liste des sandwichs :");
		System.out.println(sandwich);
		System.out.println(sandwichVegetarien);
		System.out.println(sandwichVegan);

		//---- Affichage de l'ingrédient le plus calorique pour chacun des sandwichs ----//
		
		System.out.println("Ingrédient le plus calorique :");
		System.out.println(sandwich.getIngredientPlusCaloriqueV3());
		System.out.println(sandwichVegetarien.getIngredientPlusCaloriqueV3());
		System.out.println(sandwichVegan.getIngredientPlusCaloriqueV3());

		//---- Deplacement d'un ingrédient du sandwich vegan vers le sandwich vegetarien ----//

		try {
			System.out.println("Déplacement d'un ingrédient");
			System.out.println("Avant :");
			System.out.println(sandwichVegan);
			System.out.println(sandwichVegetarien);
			sandwichVegan.deplacerIngredient(morceauAvocat, sandwichVegetarien);
			System.out.println("Après :");
			System.out.println(sandwichVegan);
			System.out.println(sandwichVegetarien);
		} catch (alimentNonCompatibleException e) {
			System.out.println("Régime alimentaire incompatible !");
		}

		//---- Méthode ingrédient commun ----//
		
		System.out.println("Ingrédient commun ?");
		System.out.println(sandwich.ingredientCommun(sandwichVegan));
		
		
		//---- Instructions provoquant des erreurs ----//
		
		// Ajout de boeuf dans un sandwich vegan :
		sandwichVegan.composer(partSteakBoeuf);
		
		// Ajout de pain en plus dans un sandwich :
		sandwich.composer(tranchePainBlanc);
		
		// Création d'un sandwich avec une sauce au lieu du pain :
		Sandwich<IPain, ISauce, IAliment> sandwichSauceAuLieuDePain = new Sandwich<>("sandwichSauceAuLieuDePain", doseSauceMayonnaise, doseSauceKetchup);

		// Déplacement de boeuf dans un sandwich vegan :
		sandwich.deplacerIngredient(partSteakBoeuf, sandwichVegan);
		
		// Création d'un aliment ayant 0 Kcal
		IAliment eau = new Aliment("eau");
		eau.setKilocaloriesPour100g(0.0f);
		
		// Création d'un aliment ayant plus de 1000 Kcal
		IAliment uranium = new Aliment("uranium 235");
		uranium.setKilocaloriesPour100g(999999.9f);
	}

	public static void main2() throws nbKcalInvalideException {
		// CREATION DES PAINS
		IPain painBlanc = new Pain("blanc");
		painBlanc.setKilocaloriesPour100g(216.0f);

		IPain painComplet = new Pain("complet");
		painComplet.setKilocaloriesPour100g(189.0f);

		IPain painItalien = new Pain("italien");
		painItalien.setKilocaloriesPour100g(200.0f);

		// CREATION DES SAUCES
		ISauce sauceKetchup = new Sauce("ketchup");
		sauceKetchup.setKilocaloriesPour100g(112.0f);
		sauceKetchup.setNiveauPiquant(Piquant.TRES_DOUX);

		ISauce sauceMayo = new Sauce("mayo");
		sauceMayo.setKilocaloriesPour100g(687.0f);
		sauceMayo.setNiveauPiquant(Piquant.TRES_DOUX);

		ISauce sauceMoutarde = new Sauce("moutarde");
		sauceMoutarde.setKilocaloriesPour100g(155.0f);
		sauceMoutarde.setNiveauPiquant(Piquant.DOUX);

		// CREATION DES INGREDIENTS
		IAlimentVegan tomate = new Legume("tomate");
		tomate.setKilocaloriesPour100g(21.0f);

		IAlimentVegan salade = new Legume("salade");
		salade.setKilocaloriesPour100g(13.0f);

		IAliment bacon = new Viande("bacon");
		bacon.setKilocaloriesPour100g(541.0f);

		IAlimentVegan concombre = new Legume("concombre");
		concombre.setKilocaloriesPour100g(10.0f);

		IAlimentVegetarien oeuf = new AlimentVegetarien("oeuf");
		oeuf.setKilocaloriesPour100g(73.0f);

		IAlimentVegan oignon = new Legume("oignon");
		oignon.setKilocaloriesPour100g(43.0f);

		IAliment steakBoeuf = new Viande("steak boeuf");
		steakBoeuf.setKilocaloriesPour100g(211.0f);

		IAlimentVegan steakSoja = new AlimentVegan("steak soja");
		steakSoja.setKilocaloriesPour100g(177.0f);

		IAliment poulet = new Viande("poulet");
		poulet.setKilocaloriesPour100g(102.0f);

		IAlimentVegan avocat = new Legume("avocat");
		avocat.setKilocaloriesPour100g(360.0f);

		IAlimentVegan tofu = new AlimentVegan("tofu");
		tofu.setKilocaloriesPour100g(76.0f);

		IAliment thon = new Viande("thon");
		thon.setKilocaloriesPour100g(117.0f);

		IAlimentVegetarien cheddar = new ProduitLaitier("cheddar");
		cheddar.setKilocaloriesPour100g(402.0f);

		IAlimentVegetarien feta = new ProduitLaitier("feta");
		feta.setKilocaloriesPour100g(264.0f);

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
			switch (choix) {
				case "1":
					System.out.println("-- Création de votre sandwich --");

					// NOM DU SANDWICH
					String nom = "";
					boolean nomOK = false;
					while (!nomOK) {
						nomOK = true;
						System.out.println("Entrez le nom de votre nouveau sandwich (pas d'espaces) :");
						nom = scan.next();
						for (Sandwich s : sandwichs) {
							if (nom.equals(s.getNom())) {
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
					} while (!typeRegime.equals("1") && !typeRegime.equals("2") && !typeRegime.equals("3"));
					String regime = "";
					switch (typeRegime) {
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
					} while (!typePain.equals("1") && !typePain.equals("2") && !typePain.equals("3"));
					Ingredient<IPain> tranchePain = new Ingredient<>();
					switch (typePain) {
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
					} while (!typeSauce.equals("1") && !typeSauce.equals("2") && !typeSauce.equals("3"));
					Ingredient<ISauce> doseSauce = new Ingredient<>();
					switch (typeSauce) {
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

					// CREATION INSTANCE
					Sandwich s;
					switch (regime) {
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
						switch (nomIngr) {
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
						if (ingr != null) {
							try {
								s.composer(ingr);
								System.out.println("Ingrédient ajouté !");
							} catch (alimentNonCompatibleException e) {
								System.out.println("Cet ingrédient est incompatible avec votre régime alimentaire !");
							}
						}
					} while (!nomIngr.equals("ok"));

					// RECAPITULATIF
					System.out.println("Récapitulatif de votre commande :");
					System.out.println(s);
					System.out.println("  > Ingrédient le plus calorique : " + s.getIngredientPlusCaloriqueV3()
							+ " avec " + s.getIngredientPlusCalorique().getKilocaloriesPour100g() + " kcal/100g");
					System.out.println("C'est bon pour vous ?");
					System.out.println("[1] Oui");
					System.out.println("[2] Non");
					String ok = scan.next();
					if (ok.equals("1")) {
						System.out.println("Ok, je vous l'amène tout de suite.");
						sandwichs.add(s);
					} else {
						System.out.println("Ah mince, désolé !");
					}
					break;
				case "2":
					if (sandwichs.isEmpty()) {
						System.out.println("Vous n'avez pas de sandwich. Une petite faim ?");
					} else {
						System.out.println("Voici vos sandwich :");
						for (Sandwich sand : sandwichs) {
							System.out.println(sand);
							System.out.println("  > Ingrédient le plus calorique : "
									+ sand.getIngredientPlusCaloriqueV3() + " avec "
									+ sand.getIngredientPlusCalorique().getKilocaloriesPour100g() + " kcal/100g");
						}
					}
					break;
				case "3":
					System.out.println("Choisissez le sandwich que vous voulez manger :");
					for (int i = 0; i < sandwichs.size(); i++) {
						System.out.println("[" + ((int) i + 1) + "] Sandwich '" + sandwichs.get(i).getNom() + "'");
					}
					int index = scan.nextInt() - 1;
					if (index >= sandwichs.size()) {
						System.out.println("Index invalide !");
					} else {
						sandwichs.remove(index);
						System.out.println("* miam *\nAppétissant !");
					}
					break;
				case "4":
					System.out.println("Choisissez le sandwich A :");
					for (int i = 0; i < sandwichs.size(); i++) {
						System.out.println("[" + ((int) i + 1) + "] Sandwich '" + sandwichs.get(i).getNom() + "'");
					}
					int indexA = scan.nextInt() - 1;
					if (indexA >= sandwichs.size()) {
						System.out.println("Index invalide !");
						break;
					}
					System.out.println("Choisissez le sandwich B :");
					for (int i = 0; i < sandwichs.size(); i++) {
						System.out.println("[" + ((int) i + 1) + "] Sandwich '" + sandwichs.get(i).getNom() + "'");
					}
					int indexB = scan.nextInt() - 1;
					if (indexB >= sandwichs.size()) {
						System.out.println("Index invalide !");
						break;
					}
					if (sandwichs.get(indexA).ingredientCommun(sandwichs.get(indexB))) {
						System.out.println("Les sandwichs A et B ont au moins 1 ingrédient en commun");
					} else {
						System.out.println("Les sandwichs A et B n'ont aucun ingrédient en commun");
					}
					break;
				case "5":
					System.out.println("Choisissez le sandwich duquel enlever l'ingrédient :");
					for (int i = 0; i < sandwichs.size(); i++) {
						System.out.println("[" + ((int) i + 1) + "] Sandwich '" + sandwichs.get(i).getNom() + "'");
					}
					int index1 = scan.nextInt() - 1;
					if (index1 >= sandwichs.size()) {
						System.out.println("Index invalide !");
						break;
					}
					System.out.println("Choisissez le sandwich auquel ajouter l'ingrédient :");
					for (int i = 0; i < sandwichs.size(); i++) {
						System.out.println("[" + ((int) i + 1) + "] Sandwich '" + sandwichs.get(i).getNom() + "'");
					}
					int index2 = scan.nextInt() - 1;
					if (index2 >= sandwichs.size()) {
						System.out.println("Index invalide !");
						break;
					}
					System.out.println("Choisissez un ingrédient à déplacer :");
					for (int i = 0; i < sandwichs.get(index1).getIngredients().size(); i++) {
						System.out.println("[" + ((int) i + 1) + "] " + sandwichs.get(index1).getIngredients().get(i));
					}
					int ingrId = scan.nextInt() - 1;
					if (ingrId >= sandwichs.get(index1).getIngredients().size()) {
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
		} while (!choix.equals("6"));
		scan.close();
	}

	public static void main(String[] args) {
		System.out.println("Tapez 1 pour le programme de test, et 2 pour la simulation de restaurant :");
		Scanner scan = new Scanner(System.in);
		int choix = scan.nextInt();
		switch (choix) {
			case 1:
				main1();
				break;
			case 2:
				try {
					main2();
				} catch (nbKcalInvalideException e) {
					System.out.println("Une erreur est survenue !");
				}
				break;
			default:
				System.out.println("Choix inexistant !");
		}
		scan.close();
	}
}

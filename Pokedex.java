import java.util.Scanner;

public class Pokedex {
	// creates the pokemon array by getting the size inputted by the user in
	// Project4
	public Pokemon[] Pokemon = new Pokemon[Project4.getSize()];

	// lists pokemon
	public void listPokemon() {
		// if the first slot is empty, the rest of the array is empty
		if (Pokemon[0] == null) {
			System.out.println("Your Pokedex is currently empty!");
		} else {
			for (int i = 0; i < Pokemon.length; i++) {
				if (Pokemon[i] != null) {
					System.out.println((i + 1) + ". " + Pokemon[i].species);
				}
			}
		}
	}

	// method for adding pokemon
	public void addPokemon(Pokemon pkm) {

		// checks if the pokemon can be added
		for (int i = 0; i < Pokemon.length; i++) {
			if (Pokemon[Pokemon.length - 1] != null) {
				System.out.println("Your Pokedex is already holding the max amount!");
				break;
			} else if (Pokemon[i] != null) {
				if (Pokemon[i].species.equals(pkm.species)) {
					System.out.println("Your Pokedex is already storing that Pokemon!");
					break;

				}
				// only adds pokemon if the slot in the array is empty
			} else if (Pokemon[i] == null) {
				Pokemon[i] = pkm;
				break;
			}
		}
	}

	// method for checking stats
	public void checkStats(String pkm_nm) {
		// boolean to check if the pokemon exists
		Boolean PkmExists = false;
		for (int i = 0; i < Pokemon.length; i++) {
			if(Pokemon[i]!=null){
			if (pkm_nm.equals(Pokemon[i].species)) {
				System.out.println("The stats for " + Pokemon[i].species + " are:");
				System.out.println("Attack: " + Pokemon[i].attack);
				System.out.println("Defense: " + Pokemon[i].defense);
				System.out.println("Speed: " + Pokemon[i].speed);
				PkmExists = true;
				break;
			} else {
				PkmExists = false;
			}
		}
		}
		if (PkmExists == false) {
			System.out.println("The Pokemon could not be found!");
		}
	}

	public void sortPokemon() {
		int min;
		
		for (int j = 0; j < Pokemon.length; j++) {
			if(Pokemon[j]!=null){
				
			min = j;
			for (int i = j + 1; i < Pokemon.length; i++) {
				// if a new min is found, its index will be stored
				if(Pokemon[i]!=null){if (Pokemon[i].species.compareTo(Pokemon[min].species) < 0) {
					min = i;
				}}
			}
			// swapping pokemon
			if (min != j) {
				Pokemon hold = Pokemon[j];
				Pokemon hold2 = Pokemon[min];
				Pokemon[j] = hold2;
				Pokemon[min] = hold;
			}
			}}
		
		

	}

	// constructor
	public Pokedex(int size) {
		Pokemon[] Pokemon = new Pokemon[size];
	}

}

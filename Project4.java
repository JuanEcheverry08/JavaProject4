import java.util.Scanner;
public class Project4 {

	public static int size;

	// method for displaying the menu
	public static void mainMenu() {
		System.out.println("");
		System.out.println("1. List Pokemon");
		System.out.println("2. Add Pokemon");
		System.out.println("3. Check a Pokemon's Stats");
		System.out.println("4. Sort Pokemon");
		System.out.println("5. Exit");
		System.out.println("");
		System.out.println("What would you like to do?");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to your new PokeDex!");
		System.out.println("How many Pokemon are in your region? ");
		size = input.nextInt();
		Pokedex Dex = new Pokedex(size);
		System.out.println("Your new Pokedex can hold " + size + " pokemon. Let's start using it!");
		int choice = 0;
		do {
			mainMenu();
			choice = input.nextInt();
			// list pokemon
			if (choice == 1) {
				Dex.listPokemon();
			}
			// add pokemon
			else if (choice == 2) {
				System.out.println("Please enter the Pokemon's name: ");
				String name = input.next();
				Pokemon newpkm = new Pokemon(name, ((name.length() * 4) + 2), (name.length() * 2) + 7,
						(name.length() * 3) + 5);
				Dex.addPokemon(newpkm);
			}
			// check stats
			else if (choice == 3) {
				System.out.println("Please enter the Pokemon of interest: ");
				String pkm = input.next();
				Dex.checkStats(pkm);
			}
			// sort pokemons
			else if (choice == 4) {
				Dex.sortPokemon();
			}
			// exits
			else if (choice == 5) {
			} else
			// invalid input
			{

				System.out.println("That’s not a valid input choice. Try again!");
			}

		} while (choice != 5);
	}

	// size getter to pass to the pokedex class
	public static int getSize() {
		return size;
	}
}

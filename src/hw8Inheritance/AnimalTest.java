package hw8Inheritance;

public class AnimalTest {
	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.animalInfo();
		System.out.println("-------");

		Mammal mammal = new Mammal();
		mammal.mamalInfo();
		mammal.animalInfo();
		System.out.println("_____");

		Dog dog = new Dog();
		dog.dogInfo();
		dog.mamalInfo();
		dog.animalInfo();
		System.out.println("----------");

		BullDog bulldog = new BullDog();
		bulldog.bullDogInfo();
		bulldog.dogInfo();
		bulldog.mamalInfo();
		bulldog.animalInfo();
		System.out.println("________");

		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();
		System.out.println("________");

		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();
		System.out.println("--------");

		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();
		System.out.println("-----");

		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();
		System.out.println("-----");

		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();
		System.out.println("\n-----");
		
		
		/* Example of Single Inheritance : 
		 * Bird is the the parent class, Robin is the child class.
		 * Bird-> Robin
		 * 
		 * Example of Multilevel Inheritance:
		 * Animal -> Reptile -> Snake -> Cobra .
		 * 
		 * Example of Hierarchical inheritance :
		 *                 Animal
		 *                 
		 *       Reptile   Mammal   Bird  
		 * 
		 * 
		 */
		

	}
}

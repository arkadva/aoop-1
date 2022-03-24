package diet;

import animals.Animal;
import food.EFoodType;
import food.IEdible;

public class Omnivore implements IDiet {
	// apparently it is to avoid code duplication?
	private IDiet omnivore;
	private IDiet herbivore;
	
	public Omnivore() {
		omnivore = new Omnivore();
		herbivore = new Herbivore();
	}
	
	@Override
	public boolean canEat(EFoodType food) {
		if (food != EFoodType.NOTFOOD)
			return true;
		return false;
	}

	@Override
	public double eat(Animal animal, IEdible food) {
		// assuming one will return 0?
		// what is the return type for?
		return omnivore.eat(animal, food) + herbivore.eat(animal, food);
	}
}

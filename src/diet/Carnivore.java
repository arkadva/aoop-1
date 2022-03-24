package diet;

import animals.Animal;
import food.EFoodType;
import food.IEdible;

public class Carnivore implements IDiet {
	@Override
	public boolean canEat(EFoodType food) {
		 return food == EFoodType.MEAT;
	}

	@Override
	public double eat(Animal animal, IEdible food) {
		if (canEat(food.getFoodType())) {
			animal.setWeight(animal.getWeight() * 1.1);
		}
		return 0;
	}
}

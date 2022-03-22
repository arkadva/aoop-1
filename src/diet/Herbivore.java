package diet;

import animals.Animal;
import food.EFoodType;
import food.IEdible;
import mobility.Point;

public class Herbivore extends Animal implements IDiet {

	public Herbivore(String name, Point point) {
		super(name, point);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canEat(EFoodType food) {
		return food == EFoodType.VEGETABLE;
	}

	@Override
	public double eat(Animal animal, IEdible food) {
		if (canEat(food.getFoodType())) {
			// eat..
		}
		return 0;
	}

}

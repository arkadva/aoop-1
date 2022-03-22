package diet;

import animals.Animal;
import food.EFoodType;
import food.IEdible;
import mobility.Point;

public class Omnivore extends Animal implements IDiet {

	public Omnivore(String name, Point point) {
		super(name, point);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canEat(EFoodType food) {
		if (food != EFoodType.NOTFOOD)
			return true;
		return false;
	}

	@Override
	public double eat(Animal animal, IEdible food) {
		if (canEat(food.getFoodType())) {
			// eat..
		}
		return 0;
	}

}

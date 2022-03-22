package diet;
import animals.Animal;
import animals.Lion;
import food.EFoodType;
import food.IEdible;
import mobility.Point;

public class Carnivore extends Animal implements IDiet {

	public Carnivore(String name, Point point) {
		super(name, point);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canEat(EFoodType food) {
		 return food == EFoodType.MEAT;
	}

	@Override
	public double eat(Animal animal, IEdible food) {
		if (canEat(food.getFoodType())) {
			// eat..
		}
		return 0;
	}

	
}

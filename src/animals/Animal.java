package animals;
import food.*;
import diet.*;
import animals.*;
import mobility.Mobile;
import mobility.Point;

public abstract class Animal extends Mobile implements IEdible {
	private String name;
	private double weight;
	private IDiet diet;
	
	
	public Animal(String name, Point point) {
		super(point);
		this.name = name;
	}
	
	public void makeSound() {
		if (this instanceof Lion) {
			((Lion)this).roar();
		} else if (this instanceof Bear) { 
			((Bear)this).roar();
		} else if (this instanceof Elephant) { 
			((Elephant)this).chew();
		} else if (this instanceof Giraffe) { 
			((Giraffe)this).chew();
		} else if (this instanceof Turtle) { 
			((Turtle)this).chew();
		}
	}
	
	public boolean setWeight(double weight) {
		if (weight > 0) {
			this.weight = weight;
			return true;
		}
		return false;
	}
	
	public EFoodType getFoodType() {
		if (this instanceof Lion)
			return EFoodType.NOTFOOD;
		return EFoodType.MEAT;
	}
}

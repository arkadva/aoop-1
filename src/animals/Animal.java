package animals;
import food.*;
import diet.*;
import mobility.Mobile;
import mobility.Point;
import utilities.MessageUtility;

public abstract class Animal extends Mobile implements IEdible {
	private String name;
	private double weight;
	private IDiet diet;
	
	
	public Animal(String name, Point point) {
		super(point);
		this.name = name;
	}
	
	public void makeSound() {
		// what?
		// https://moodle.sce.ac.il/mod/hsuforum/discuss.php?d=53 
	}
	
	public boolean setWeight(double weight) {
		if (weight > 0) {
			this.weight = weight;
			MessageUtility.logSetter("Animal", "setWeight()", weight, true);
			return true;
		}
		MessageUtility.logSetter("Animal", "setWeight()", weight, false);
		return false;
	}
	
	public double getWeight() {
		MessageUtility.logGetter("Animal", "getWeight()", this.weight);
		return this.weight;
	}
	
	public boolean setDiet(IDiet diet) {
		this.diet = diet;
		return true;
	}

	public EFoodType getFoodType() {
		if (this instanceof Lion) { // this is wrong
			MessageUtility.logGetter("Animal", "getFoodType()", EFoodType.NOTFOOD);
			return EFoodType.NOTFOOD;
		}
		MessageUtility.logGetter("Animal", "getFoodType()", EFoodType.MEAT);
		return EFoodType.MEAT;
	}
}

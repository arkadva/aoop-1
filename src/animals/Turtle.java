package animals;

import diet.Herbivore;
import mobility.Point;
import utilities.MessageUtility;

public class Turtle extends Animal {
	private int age;
	private static final int MAX_AGE = 500;
	
	public Turtle(String name) {
		this(name, new Point(80, 0));
	}
	
	public Turtle(String name, Point point) {
		super(name, point);
		setWeight(1);
		setAge(1);
		setDiet(new Herbivore());
	}
	
	public boolean setAge(int age){
		if (0 <= age && age <= MAX_AGE) {
			this.age = age;
			MessageUtility.logSetter("Turtle", "setAge()", age, true);
			return true;
		}
		MessageUtility.logSetter("Turtle", "setAge()", age, false);
		return false;
	}
	
	public int getAge() {
		MessageUtility.logGetter("Turtle", "getAge()", this.age);
		return this.age;
	}
	
	public void chew() {
		// ??
	}
}

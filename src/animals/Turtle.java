package animals;

import diet.Herbivore;
import mobility.Point;

public class Turtle extends Herbivore {
	private int age;
	private static final int MAX_AGE = 500;
	
	public Turtle(String name) {
		super(name, new Point(80, 0));
		setWeight(1);
		this.age = 1;
	}
	
	public Turtle(String name, Point point) {
		super(name, point);
		setWeight(1);
		this.age = 1;
	}
	
	public void chew() {
		
	}
}

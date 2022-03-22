package animals;

import mobility.Point;
import diet.Herbivore;

public class Elephant extends Herbivore {
	private double trunkLength;
	private static final double MAX_LENGTH = 3;
	private static final double MIN_LENGTH = 0.5;
	
	public Elephant(String name) {
		super(name, new Point(50, 90));
		setWeight(500);
		this.trunkLength = 1;
	}
	
	public Elephant(String name, Point point) {
		super(name, point);
		setWeight(500);
		this.trunkLength = 1;
	}
	
	public void chew() {
		// ??
	}
}

package animals;

import diet.Herbivore;
import mobility.Point;

public class Giraffe extends Herbivore {
	private double neckLength;
	private static final double MAX_LENGTH = 2.5;
	private static final double MIN_LENGTH = 1;
	
	public Giraffe(String name) {
		super(name, new Point(50, 0));
		setWeight(450);
		this.neckLength = 1.5;
	}
	
	public Giraffe(String name, Point point) {
		super(name, point);
		setWeight(450);
		this.neckLength = 1.5;
	}
	
	public void chew() {
		// ?
	}
}

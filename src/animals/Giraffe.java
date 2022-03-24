package animals;

import diet.Herbivore;
import mobility.Point;
import utilities.MessageUtility;

public class Giraffe extends Animal {
	private double neckLength;
	private static final double MAX_LENGTH = 2.5;
	private static final double MIN_LENGTH = 1;
	
	public Giraffe(String name) {
		this(name, new Point(50, 0));
	}
	
	public Giraffe(String name, Point point) {
		super(name, point);
		setWeight(450);
		setNeckLength(1.5);
		setDiet(new Herbivore());
	}
	
	public boolean setNeckLength(double neckLength) {
		if (MIN_LENGTH <= neckLength && neckLength <= MAX_LENGTH) {
			this.neckLength = neckLength;
			MessageUtility.logSetter("Giraffe", "setNeckLength()", neckLength, true);
			return true;
		}
		MessageUtility.logSetter("Giraffe", "setNeckLength()", neckLength, false);
		return false;
	}
	
	public double getNeckLength() {
		MessageUtility.logGetter("Giraffe", "getNeckLength()", this.neckLength);
		return this.neckLength;
	}
	
	public void chew() {
		// ??
	}
}

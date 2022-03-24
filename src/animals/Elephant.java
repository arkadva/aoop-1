package animals;

import diet.Herbivore;
import mobility.Point;
import utilities.MessageUtility;

public class Elephant extends Animal {
	private double trunkLength;
	private static final double MAX_LENGTH = 3;
	private static final double MIN_LENGTH = 0.5;
	
	public Elephant(String name) {
		this(name, new Point(50, 90));
	}
	
	public Elephant(String name, Point point) {
		super(name, point);
		setWeight(500);
		setTrunkLength(1);
		setDiet(new Herbivore());
	}
	
	public boolean setTrunkLength(double trunkLength) {
		if (MIN_LENGTH <= trunkLength && trunkLength <= MAX_LENGTH) {
			this.trunkLength = trunkLength;
			MessageUtility.logSetter("Elephant", "setTrunkLength()", trunkLength, true);
			return true;
		}
		MessageUtility.logSetter("Elephant", "setTrunkLength()", trunkLength, false);
		return false;
	}
	
	public double getTrunkLength() {
		MessageUtility.logGetter("Elephant", "getTrunkLength()", trunkLength);
		return trunkLength;
	}

	public void chew() {
		// ??
	}
}

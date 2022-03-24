package animals;

import diet.Carnivore;
import mobility.Point;
import utilities.MessageUtility;

public class Lion extends Animal {
	private int scarCount;
	
	public Lion(String name) {
		this(name, new Point(20, 0));
	}
	
	public Lion(String name, Point point) {
		super(name, point);
		setWeight(408.2);
		setScarCount(0);
		setDiet(new Carnivore());
	}
	
	public boolean setScarCount(int scarCount) {
		if (scarCount >= 0) {
			this.scarCount = scarCount;
			MessageUtility.logSetter("Lion", "setScarCount()", scarCount, true);
			return true;
		}
		MessageUtility.logSetter("Lion", "setScarCount()", scarCount, false);
		return false;
	}
	
	public int getScarCount() {
		MessageUtility.logGetter("Lion", "getScarCount()", this.scarCount);
		return this.scarCount;
	}
	
	public void roar() {
		// ??
	}

}

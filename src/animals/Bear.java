package animals;

import diet.Omnivore;
import mobility.Point;
import utilities.MessageUtility;

public class Bear extends Animal {
	private String furColor;
	
	public Bear(String name) {
		this(name, new Point(100, 5));
	}
	
	public Bear(String name, Point point) {
		super(name, point);
		setWeight(308.2);
		setFurColor("GRAY");
		setDiet(new Omnivore());
	}
	
	public boolean setFurColor(String furColor) {
		if (furColor.equals("GRAY") || furColor.equals("WHITE") || furColor.equals("BLACK")) {
			this.furColor = furColor;
			MessageUtility.logSetter("Bear", "setFurColor()", furColor, true);
			return true;
		}
		MessageUtility.logSetter("Bear", "setFurColor()", furColor, false);
		return false;
	}
	
	public String getFurColor() {
		MessageUtility.logGetter("Bear", "getFurColor()", this.furColor);
		return furColor;
	}
	
	public void roar() {
		// ??
	}
}

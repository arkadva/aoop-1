package animals;
import diet.Omnivore;
import mobility.Point;

public class Bear extends Omnivore {
	private String furColor;
	
	public Bear(String name) {
		super(name, new Point(100, 5));
		furColor = "GRAY";
		setWeight(308.2);
	}
	
	public Bear(String name, Point point) {
		super(name, point);
		furColor = "GRAY";
		setWeight(308.2);
	}
	
	
	public void roar() {
		// ??
	}
}

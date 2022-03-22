package animals;
import diet.Carnivore;
import mobility.Point;

public class Lion extends Carnivore {
	private int scarCount;
	
	public Lion(String name) {
		super(name, new Point(20, 0));
		setWeight(408.2);
		scarCount = 0;
	}
	
	public Lion(String name, Point point) {
		super(name, point);
		setWeight(408.2);
		scarCount = 0;
	}
	
	public void roar() {
		// ??
	}

}

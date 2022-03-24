package mobility;
import utilities.MessageUtility;

public class Point {
	private static final int MAX_X = 800;
	private static final int MAX_Y = 600;
	private static final int MIN_X = 0;
	private static final int MIN_Y = 0;
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public boolean setY(int y) {
		if (MIN_Y <= y && y <= MAX_Y) {
			this.y = y;
			MessageUtility.logSetter("Point", "setY()", y, true);
			return true;
		}
		MessageUtility.logSetter("Point", "setY()", y, false);
		return false;
	}
	
	public boolean setX(int x) {
		if (MIN_X <= x && x <= MAX_X) {
			this.x = x;
			MessageUtility.logSetter("Point", "setX()", x, true);
			return true;
		}
		MessageUtility.logSetter("Point", "setX()", x, false);
		return false;
	}
	
	public int getX() {
		MessageUtility.logGetter("Point", "getX()", x);
		return this.x;
	}
	
	public int getY() {
		MessageUtility.logGetter("Point", "getY()", y);
		return this.y;
	}

	public static boolean cheackBounderies(Point newLocation) {
		if (MIN_X <= newLocation.getX() && newLocation.getX() <= MAX_X)
			if (MIN_Y <= newLocation.getY() && newLocation.getY() <= MAX_Y)
				return true;
		return false;
	}
}

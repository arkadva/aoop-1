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
		// consider using setY and setX
		this.x = x;
		this.y = y;
	}
	
	public boolean setY(int y) {
		if (y <= MAX_Y && y >= MIN_Y) {
			this.y = y;
			MessageUtility.logSetter("Point", "setY()", y, true);
			return true;
		}
		MessageUtility.logSetter("Point", "setY()", y, false);
		return false;
	}
	
	public boolean setX(int x) {
		if (x <= MAX_X && x >= MIN_X) {
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
}

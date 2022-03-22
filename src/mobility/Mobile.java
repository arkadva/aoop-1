package mobility;

import utilities.MessageUtility;

public abstract class Mobile implements Ilocatable {
	private Point location;
	private double totalDistance;
	
	public Mobile(Point point) {
		this.location = point;
		this.totalDistance = 0.0;
	}

	public void addTotalDistance(double distance) {
		this.totalDistance += distance;
	}
	
	public double calcDistance(Point point) {
		return Math.sqrt(Math.pow(point.getX() - this.location.getX(), 2) + Math.pow(point.getY() - this.location.getY(), 2));
	}
	
	public double move(Point point) {
		double distance = calcDistance(point);
		addTotalDistance(distance);
		return distance;
	}
	
	@Override
	public Point getLocation() {
		MessageUtility.logGetter("Mobile", "getLocation()", location);
		return location;
	}
	
	@Override
	public boolean setLocation(Point point) {
		this.location = point;
		MessageUtility.logSetter("Mobile", "getLocation()", location, true);
		return true;
	}
}

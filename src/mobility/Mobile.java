package mobility;

import utilities.MessageUtility;

public abstract class Mobile implements Ilocatable {
	private Point location;
	private double totalDistance;
	
	public Mobile(Point point) {
		this.location = point;
		this.setTotalDistance(0.0);
	}

	public void addTotalDistance(double distance) {
		this.setTotalDistance(this.getTotalDistance() + distance);
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
	public boolean setLocation(Point point) {
		move(point);
		MessageUtility.logSetter("Mobile", "setLocation()", location, true);
		return true;
	}
	
	@Override
	public Point getLocation() {
		MessageUtility.logGetter("Mobile", "getLocation()", this.location);
		return location;
	}

	public boolean setTotalDistance(double totalDistance) {
		if (totalDistance >= 0) {
			this.totalDistance = totalDistance;
			MessageUtility.logSetter("Mobile", "setTotalDistance()", totalDistance, true);
			return true;
		}
		MessageUtility.logSetter("Mobile", "setTotalDistance()", totalDistance, false);
		return false;
	}
	
	public double getTotalDistance() {
		MessageUtility.logGetter("Mobile", "getTotalDistance()", this.totalDistance);
		return totalDistance;
	}
}

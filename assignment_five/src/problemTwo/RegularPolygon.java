package problemTwo;

public class RegularPolygon {
	
	private int numberOfSides;
	private double sideLength;
	private double xCoordinate;
	private double yCoordinate;
	
	public RegularPolygon() {
		numberOfSides = 3;
		sideLength = 1;
		xCoordinate = 0;
		yCoordinate = 0;
	}
	
	public RegularPolygon(int s, double l) {
		this();
		this.numberOfSides = s;
		this.sideLength = l;
	}
	
	public RegularPolygon(int s, double l, double x, double y) {
		this(s, l);
		xCoordinate = x;
		yCoordinate = y;
	}
	
	public int getNumberOfSideS() {
		return this.numberOfSides;
	}
	public double getSideLength() {
		return this.sideLength;
	}
	public double getX() {
		return this.xCoordinate;
	}
	public double getY() {
		return this.yCoordinate;
	}
	public double getPerimeter() {
		return this.numberOfSides * this.sideLength;
	}
	public double getArea() {
		return (this.numberOfSides * this.sideLength * this.sideLength)/ (4.0 * Math.tan(Math.PI / this.numberOfSides));
	}
	
	

}

package problemThree;

public class LinearEquation {
	
	private double a, b, c, d, e, f;
	
	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public double getD() {
		return d;
	}
	public double getE() {
		return e;
	}
	public double getF() {
		return f;
	}
	
	public void setA(double a) {
		this.a = a;
	}
	public void setB(double b) {
		this.b = b;
	}
	public void setC(double c) {
		this.c = c;
	}
	public void setD(double d) {
		this.d = d;
	}
	public void setE(double e) {
		this.e = e;
	}
	public void setF(double f) {
		this.f = f;
	}
	
	public double getX() {
		return ((e*d)-(b*f))/ resultsOFabdc();
	}
	public double getY() {
		return ((a*f)-(e*c))/ resultsOFabdc();
	}
	
	public boolean isSolvable() {
		return resultsOFabdc() != 0;
	}
	
	public double resultsOFabdc() {
		return ((a * d) - (b * c));
	}

}

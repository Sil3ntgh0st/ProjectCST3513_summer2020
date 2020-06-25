package problemFour;

public class Location {
	
	public int row;
	public int column;
	public double maxValue;
	
	public Location(int row, int column, double maxValue) {
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}
	
	public static Location showLargest(double[][] a) {
		
		int row = 0;
		int column = 0;
		double maxValue = a[row][column];
		
		for(int i = 0; i < a.length; i++) {
			for(int n = 0; n < a[i].length; n++) {
				if(maxValue < a[i][n]) {
					maxValue = a[i][n];
					row = i;
					column = n;
				}
			}
		}
		return new Location(row,column,maxValue);
	}

}

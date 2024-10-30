package studio7;

public class Rectangle {
	private double width;
	private double length;
	
	
	public Rectangle(double width, double length) {
		this.width=width;
		this.length=length;
	}
	
	
	public String toString() {
		return "width: "+width+" length: "+length;
	}
	public boolean isSquare(Rectangle a) {
		
		if (width == length) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double getPerimeter(Rectangle a) {
		return (this.width+this.length)*2;
	}
	
	public double getArea(Rectangle a) {
		return a.width*a.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle ab=new Rectangle(1,2);
	}

}



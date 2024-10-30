package studio7;

public class Complex {
	private double real;
	private double imaginary;
	
	public Complex(double real , double imaginary ) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public Complex add(Complex a , Complex b) {
		double newA = a.real + b.real;
		double newB = b.imaginary + b.imaginary;
		Complex c= new Complex(newA,newB);
		return c;
	}
	public Complex mutiply(Complex a , Complex b) {
		double newA = a.real*b.real-a.imaginary*b.imaginary;
		double newB = a.real*b.imaginary+a.imaginary*b.real;
		Complex c= new Complex(newA,newB);
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

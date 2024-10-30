package studio7;

public class Fraction {
	private int num;
	private int den;
	
	public Fraction(int num, int den) {
		this.num = num;
		this.den = den;
	}
	
	public double add(Fraction a, Fraction b) {
		double newDen=a.den*b.den;
		double newNum=a.num*b.den+b.num*a.den;
		return newNum/newDen;
	}
	
	public double mulitply (Fraction a, Fraction b) {
		double newDen=a.den*b.den;
		double newNum=a.num*b.num;
		return newNum/newDen;
	}
	
	public double reciprocal () {
		return this.den/this.num;
	}
	
	public double simplify () {
		for (int i=1;i<this.den;i++) {
			
			if (this.den%i == 0 && this.num%i == 0) {
				return (this.num/i)/(this.den/i);
			}
		}
		return this.num/this.den;
	}

	public static void main(String[] args) {

	}

}

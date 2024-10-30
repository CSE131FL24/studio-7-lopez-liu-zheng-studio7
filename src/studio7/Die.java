package studio7;

public class Die {
private int n;
private int roll;

public Die(int n, int roll) {
	this.n=n;
	this.roll=roll;
}

public String toString() {
	return "nuber of sides: "+n+"random integer: "+roll;
}

public int randomInt() {
	roll = (int) (Math.random()*n) + 1;
	return roll;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

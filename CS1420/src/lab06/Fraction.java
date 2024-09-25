package lab06;

/**
 * This class represents a fraction; e.g., 1/2.
 * 
 * @author Erin Parker and Eric Heisler
 * @version 2023-9-20
 */
public class Fraction {
	
	private int numerator;
	private int denominator;
	
	/**
	 * This constructor builds a "default" Fraction object 0/1.
	 */
	public Fraction() {
		numerator = 0;
		denominator = 1;
	}
	
	/**
	 * This constructor builds a Fraction object, given a numerator and denominator.
	 * 
	 * @param numerator - value for initializing the numerator
	 * @param denominator - value for initializing the denominator
	 */
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	/**
	 * This constructor builds a Fraction object, with given numerator, and the denominator is 1.
	 *
	 * @param numerator
	 */
	public Fraction(int numerator) {
		this.numerator = numerator;
		this.denominator = 1;
	}
	
	/**
	 * Getter method for accessing the numerator of this Fraction object.
	 * 
	 * @return the numerator
	 */
	public int getNumerator() {
		return numerator;
	}
	
	/**
	 * Getter method for accessing the denominator of this Fraction object.
	 * 
	 * @return the denominator
	 */
	public int getDenominator() {
		return denominator;
	}
	
	/**
	 * This method calculates the decimal-point equivalent of this Fraction object.
	 * 
	 * @return the decimal-point equivalent
	 */
	public double toDouble() {
		return numerator / (double) denominator;
	}
	
	/**
	 * This method generates a textual representation of this Fraction object.
	 * 
	 * @return a string containing the textual representation
	 */
	public String toString() {
		return numerator + "/" + denominator;
	}
	
	/**
	 * This method determines whether this Fraction object and the given
	 * object are equal.
	 * 
	 * @param other - the other object to compare
	 * @return true if the two objects are equal, false otherwise
	 */
	public boolean equals(Object other) {
		if (!(other instanceof Fraction))
			return false;
		Fraction otherFraction = (Fraction) other;
		return this.numerator == otherFraction.numerator && 
				this.denominator == otherFraction.denominator;
	}

	/**
	 * This method swaps the numerator and denominator of current object
	 */
	public void reciprocal() {
		int temp = this.numerator;
		this.numerator = this.denominator;
		this.denominator = temp;
	}

	/**
	 * This method computes the GCD of this Fraction object's numerator and denominator.
	 *
	 * @return the GCD
	 */
	private int gcd() {
		//	while b is not 0
		//   	set t to b
		//   	set b to a mod b
		//   	set a to t
		//
		//	when the loop terminates, a is the GCD
		int a = this.numerator;
		int b = this.denominator;

		while (b != 0) {
			int t = b;
			b = a % b;
			a = t;
		}
		return a;
	}

	/**
	 * This method reduced this Fraction object to its simplest form.
	 */
	public void reduce() {
		int gcd = this.gcd();
		this.numerator = this.numerator / gcd;
		this.denominator = this.denominator / gcd;
	}

	/**
	 * this method return a Fraction object the same as current one
	 *
	 * @return a Fraction has the same numerator and denominator
	 */
	public Fraction copy() {
		return new Fraction(this.numerator, this.denominator);
	}

	/**
	 * this method return a Fraction object that is twice as big as current one
	 *
	 * @return a Fraction has 2*numerator and the same denominator
	 */
	public Fraction twiceAsBig() {
		return new Fraction(this.numerator * 2, this.denominator);
	}
}
package lab06;

public class FractionPractice {
    public static void main(String args[]) {
        // create four fraction 5/1, 1/2, 3/4, and 1/1
        Fraction f1 = new Fraction(5, 1);
        Fraction f2 = new Fraction(1, 2);
        Fraction f3 = new Fraction(3, 4);
        Fraction f4 = new Fraction(1, 1);

        System.out.println(f1.toString());
        System.out.println(f2.getDenominator());
        System.out.println(f3.getDenominator());
        System.out.println(f4.toDouble());

        Fraction f5 = new Fraction(42, 56);
        String original = f5.toString();
        f5.reduce();
        System.out.println(original + " can be reduce to: " + f5.toString());
    }
}

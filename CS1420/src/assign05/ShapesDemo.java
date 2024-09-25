package assign05;

/**
 * This class uses objects of the Rectangle and Circle classes.
 * It uses several methods from each class to confirm that they
 * are working correctly.
 * 
 * @author Prof. Heisler and Zifan Zuo
 * @version 2024-9-24
 */
public class ShapesDemo {
	/**
	 * The main method simply calls the demo methods for each part.
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * After creating the Rectangle class in part 1,
		 * this method checks your Rectangle class.
		 */
		demoPartOne();
		
		/*
		 * After creating the Circle class in part 2,
		 * uncomment this method call to check Circle.
		 */
		 // demoPartTwo();
	}
	
	/**
	 * This method works with only the Rectangle class for assignment part 1.
	 */
	public static void demoPartOne() {
		// Create some Rectangle objects
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(5, 7, 10, 20);
		// TODO create two more rectangles, r3 and r4:
		// r3 is a 5 X 15 rectangle at (-10, 8)
		// r4 is a 2 X 2 rectangle at (1, 1)
		
		// NOTE: See the checkResult method at the end of this class.
		
		// getX
		checkResult("getX", "5", "" + r2.getX());
		// TODO add one more check of this method
		
		// getY
		checkResult("getY", "7", "" + r2.getY());
		// TODO add one more check of this method
		
		// getWidth
		checkResult("getWidth", "10", "" + r2.getWidth());
		// TODO add one more check of this method
		
		// getHeight
		checkResult("getHeight", "20", "" + r2.getHeight());
		// TODO add one more check of this method
		
		// move
		r1.move(4,  12);
		checkResult("move x", "4", "" + r1.getX());
		checkResult("move y", "12", "" + r1.getY());
		// TODO add one more check of this method
		
		// scale
		r1.scale(11,  2);
		checkResult("scale width", "11", "" + r1.getWidth());
		checkResult("scale height", "2", "" + r1.getHeight());
		// TODO add one more check of this method
		
		// largerThan
		checkResult("largerThan", "false", "" + r1.largerThan(r2));
		// TODO add one more check of this method
		
		// toString
		checkResult("toString", "10 x 20 rectangle at (5, 7)", r2.toString());
		// TODO add one more check of this method
		
		// bounding rectangle
		Rectangle boundR1R2 = r1.boundingRectangle(r2);
		checkResult("boundingRectangle", "11 x 20 rectangle at (4, 7)", "" + boundR1R2);
		// TODO add one more check of this method
	}
	
	/**
	 * This method works with both classes for assignment part 2.
	 */
	public static void demoPartTwo() {
		// Create some Circle objects
		Circle c1 = new Circle();
		Circle c2 = new Circle(4, 5, 6);
		// TODO create two more circles, c3 and c4:
		// c3 is an r = 10 circle at (0, 0)
		// c4 is an r = 2 circle at (88, 88)
		
		// getX
		checkResult("getX", "4", "" + c2.getX());
		// TODO add one more check of this method
		
		// getY
		checkResult("getY", "5", "" + c2.getY());
		// TODO add one more check of this method
		
		// getRadius
		checkResult("getRadius", "6", "" + c2.getRadius());
		// TODO add one more check of this method
		
		// move
		c1.move(-2,  -3);
		checkResult("move x", "-2", "" + c1.getX());
		checkResult("move y", "-3", "" + c1.getY());
		// TODO add one more check of this method
		
		// scale
		c1.scale(10);
		checkResult("scale", "10", "" + c1.getRadius());
		// TODO add one more check of this method
		
		// largerThan
		checkResult("largerThan", "true", "" + c1.largerThan(c2));
		// TODO add one more check of this method
		
		// toString
		checkResult("toString", "r = 6 circle at (4, 5)", c2.toString());
		// TODO add one more check of this method
		
		// bounding rectangle 1
		Rectangle boundC2 = c2.boundingRectangle();
		checkResult("bounding rectangle 1", "12 x 12 rectangle at (-2, -1)", "" + boundC2);
		// TODO add one more check of this method
		
		// bounding rectangle 2
		Rectangle boundC1C2 = c1.boundingRectangle(c2);
		checkResult("bounding rectangle 2", "22 x 24 rectangle at (-12, -13)", "" + boundC1C2);
		// TODO add one more check of this method
	}
	
	/**
	 * A private helper method for printing out a useful message.
	 * 
	 * @param description - what is being checked
	 * @param expected - expected output
	 * @param actual - actual output
	 */
	private static void checkResult(String description, String expected, String actual) {
		System.out.println("Checking " + description + ":");
		System.out.println("Expected: " + expected);
		System.out.println("   Yours: " + actual);
		System.out.println();
	}
}

package assign05;

/**
 * CS1420 assginment05 Circle.java
 * This class is the representation of a circle and some methods to deal with circle
 *
 * @author Zifan Zuo
 * @version 2024-9-25
 */
public class Circle {
    private int positionX;
    private int positionY;
    private int radius;

    /**
     * the default constructor of circle
     */
    public Circle() {
        this.positionX = 0;
        this.positionY = 0;
        this.radius = 1;
    }

    /**
     * Constructor of a circle, takes the coordinate of (x, y) and radius as parametor.
     *
     * @param positionX the x coordinate of the center of this circle
     * @param positionY the y coordinate of the center of this circle
     * @param radius the radius of this circle
     */
    public Circle(int positionX, int positionY, int radius) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.radius = radius;
    }

    /**
     * this method returns the value of the x coordinate of the center of this Circle.
     *
     * @return the x coordinate of the center of this circle
     */
    public int getX() {
        return this.positionX;
    }

    /**
     * This method returns the value of the y coordinate of the center of this Circle.
     *
     * @return the y coordinate of the center of this circle
     */
    public int getY() {
        return this.positionY;
    }

    /**
     * This method returns the radius of this Circle.
     *
     * @return the radius of this circle
     */
    public int getRadius() {
        return this.radius;
    }

    /**
     * This method changes the position of this Circle to be centered at (newX, newY).
     *
     * @param newX the new x coordinate of the center of this Circle
     * @param newY the new y coordinate of the center of this Circle
     */
    public void move(int newX, int newY) {
        this.positionX = newX;
        this.positionY = newY;
    }

    /**
     * This method changes the radius of this Circle. The new radius will be (radius * factor).
     *
     * @param factor the factor of current radious
     */
    public void scale(double factor) {
        this.radius = (int)(this.radius * factor);
    }

    /**
     * This method compares this Circle with the other Circle to determine if this one is larger than the other.
     *
     * @param other another circle
     * @return if this circle is larger than the circle, other.
     */
    public boolean largerThan(Circle other) {
        return this.radius > other.radius;
    }

    /**
     * This method creates and returns a Rectangle representing the smallest rectangle that completely surrounds this Circle.
     *
     * @return a rectangle that surrounds this circle.
     */
    public Rectangle boundingRectangle() {
        return new Rectangle(this.positionX - this.radius, this.positionY - this.radius, 2 * this.radius, 2 * this.radius);
    }

    /**
     * his method creates and returns a Rectangle representing the smallest rectangle that completely surrounds this and another Circle.
     *
     * @param other another Circle
     * @return the bounding rectangle for these two circle.
     */
    public Rectangle boundingRectangle(Circle other) {
        int newX, newY, newWidth, newHeight;
        newX = Math.min(this.positionX - this.radius, other.positionX - other.radius);
        newY = Math.min(this.positionY - this.radius, other.positionY - other.radius);
        newWidth = Math.max(this.positionX + this.radius, other.positionX + other.radius) - newX;
        newHeight = Math.max(this.positionY + this.radius, other.positionY + other.radius) - newY;
        return new Rectangle(newX, newY, newWidth, newHeight);
    }

    /**
     * This method returns a String representing this Circle.
     *
     * @return a string representing this circle
     */
    public String toString() {
        return "r = " + this.radius + " circle at (" + this.positionX + ", " + this.positionY + ")";
    }
}

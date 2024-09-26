package assign05;

/**
 * CS1420 assignment05 Rectangle.java
 * this class is the representation of a Rectangle and some method to deal with rectangle
 *
 * @author Zifan Zuo
 * @version 2024-9-25
 */
public class Rectangle {
    private int positionX;
    private int positionY;
    private int width;
    private int height;

    /**
     * The default Constructor of Rectangle
     */
    public Rectangle() {
        this.positionX = 0;
        this.positionY = 0;
        this.width = 1;
        this.height = 1;
    }

    /**
     * Constructor of Rectangle, take the coordinate, width, and height of a rectangle
     * as parameter.
     *
     * @param positionX the x coordinate of this rectangle
     * @param positionY the y coordinate of this rectangle
     * @param width the width of rectangle
     * @param height the height of rectangle
     */
    public Rectangle(int positionX, int positionY, int width, int height) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.width = width;
        this.height = height;
    }

    /**
     * this method returns the x coordinate of the position of this rectangle
     *
     * @return the x coordinate of this rectangle
     */
    public int getX() {
        return this.positionX;
    }

    /**
     * this method returns the y coordinate of the position of this rectangle
     *
     * @return the y coordinate of this rectangle
     */
    public int getY() {
        return this.positionY;
    }

    /**
     * this method returns the width of this rectangle
     *
     * @return width of this rectangle
     */
    public int getWidth() {
        return this.width;
    }

    /**
     * this method returns the height of this rectangle
     *
     * @return height of this rectangle
     */
    public int getHeight() {
        return this.height;
    }

    /**
     * this method change the position of this rectangle to (newX, newY)
     *
     * @param newX the new x coordinate
     * @param newY the new y coordinate
     */
    public void move(int newX, int newY) {
        this.positionX = newX;
        this.positionY = newY;
    }

    /**
     * this method changes the width and the height of this rectangle by times
     * corresponding factors.
     *
     * @param xFactor the factor to be timed by width
     * @param yFactor the factor to be timed by height
     */
    public void scale(double xFactor, double yFactor) {
        this.width = (int)(this.width * xFactor);
        this.height = (int)(this.height * yFactor);
    }

    /**
     * a helper method to calculate the area of this rectangle
     *
     * @return the area of this rectangle
     */
    private int area() {
        return this.height * this.width;
    }

    /**
     * this method compares the area of this rectangle and other rectangle
     * to determine if this one is larger than the other.
     *
     * @param other a rectangle to be compared with this rectangle
     * @return true if this rectangle is bigger
     */
    public boolean largerThan(Rectangle other) {
        return this.area() > other.area();
    }

    /**
     * this method create and return the bounding rectangle, which means the smallest
     * rectangle that completely surrounds both this and other rectangle.
     *
     * @param other another rectangle
     * @return the bounding rectangle
     */
    public Rectangle boundingRectangle(Rectangle other) {
        int newX, newY, newWidth, newHeight;
        newX = Math.min(this.positionX, other.positionX);
        newY = Math.min(this.positionY, other.positionY);
        newWidth = Math.max(this.positionX + this.width, other.positionX + other.width) - newX;
        newHeight = Math.max(this.positionY + this.height, other.positionY + other.height) - newY;
        return new Rectangle(newX, newY, newWidth, newHeight);
    }

    /**
     * this method returns a String representing the Rectangle
     *
     * @return a String representing the Rectangle
     */
    public String toString() {
        return this.width + " x " + this.height + " rectangle at (" + this.positionX + ", " + this.positionY + ")";
    }
}

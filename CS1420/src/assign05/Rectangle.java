package assign05;

public class Rectangle {
    private int positionX;
    private int positionY;
    private int width;
    private int height;

    public Rectangle() {
        this.positionX = 0;
        this.positionY = 0;
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(int positionX, int positionY, int width, int height) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.width = width;
        this.height = height;
    }
}

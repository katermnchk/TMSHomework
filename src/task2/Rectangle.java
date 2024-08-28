package task2;

public class Rectangle extends Figure{
    private final int length;
    private final int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getSquare() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Type of the figure is circle" +
                "\nIt's sides are: " + length + ", " + width +
                "\nIt's perimeter = " + getPerimeter() +
                "\nIt's square is " + getSquare();
    }
}

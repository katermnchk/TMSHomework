package task2;

public class Circle extends Figure{
    private final int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Type of the figure is circle" +
                "\nIt's radius is " + radius +
                "\nIt's perimeter = " + getPerimeter() +
                "\nIt's square is " + getSquare();
    }
}

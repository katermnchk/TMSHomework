package task2;

public class Triangle extends Figure{
    private final int firstSide;
    private final int secondSide;
    private final int thirdSide;

    public Triangle(int firstSide, int secondSide, int thirdSide){
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double getPerimeter() {
        return firstSide + secondSide + thirdSide;
    }

    @Override
    public double getSquare() {
        double halfPerimeter = getPerimeter()/2;
        return Math.sqrt(halfPerimeter *
                (halfPerimeter - firstSide) *
                (halfPerimeter - secondSide) *
                (halfPerimeter - thirdSide));
    }

    @Override
    public String toString() {
        return "Type of the figure is triangle" +
                "\nIt's sides are: " + firstSide + ", " + secondSide + ", " + thirdSide +
                "\nIt's perimeter is " + getPerimeter() +
                "\nIt's square is " + getSquare();
    }
}

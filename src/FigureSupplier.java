import java.util.Random;

public class FigureSupplier {
    public  static final double minDouble = 0.0;
    public  static final double maxDouble = 100.0;


    public  double getRandom(){
        Random random = new Random();
        double randomDouble = random.nextDouble(minDouble,maxDouble);
        return randomDouble;
    }

    public Circle getRandomCircle() {
        Circle circle1 = new Circle(ColorSupplier.getRandomColor(), getRandom());
        return circle1;
    }

    public Square getRandomSquare() {
        Square square1 = new Square(ColorSupplier.getRandomColor(), getRandom(),getRandom());
        return square1;
    }

    public Rectangle getRandomRectangle() {
        Rectangle rectangle = new Rectangle(ColorSupplier.getRandomColor(), getRandom(),getRandom());
        return rectangle;
    }

    public RightTriangle getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle(ColorSupplier.getRandomColor(), getRandom(), getRandom());
        return rightTriangle;
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {

        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(ColorSupplier.getRandomColor(), getRandom(),
                getRandom(),getRandom());
        return isoscelesTrapezoid;
    }

    public Figure getRandomFigure() {
        Random random1 = new Random();
        int randomInt = random1.nextInt(0, 4);
        if (randomInt == 0) {
            return getRandomCircle();
        }
        if (randomInt == 1) {
            IsoscelesTrapezoid figure;
            return figure = new FigureSupplier().getRandomIsoscelesTrapezoid();
        }
        if (randomInt == 2) {
            Rectangle figure;
            return figure = new FigureSupplier().getRandomRectangle();
        }
        if (randomInt == 3) {
            RightTriangle figure;
            return figure = new FigureSupplier().getRandomRightTriangle();
        }
        if (randomInt == 4) {
            Square figure;
            return figure = new FigureSupplier().getRandomSquare();
        }
        Circle circle = new FigureSupplier().getRandomCircle();
        return circle;
    }

    public Figure getDefaultFigures() {
        return new Circle("White", 20);
    }
}

import java.util.Random;

public class FigureSupplier {


    Random random = new Random();
    double randomDouble = random.nextDouble(0.0, 100.0);

    public Circle getRandomCircle() {
        Random random = new Random();
        double randomDouble = random.nextDouble(0.0, 100.0);
        Circle circle1 = new Circle(ColorSupplier.getRandomColor(), randomDouble);
        return circle1;
    }

    public Square getRandomSquare() {
        Random random = new Random();
        double randomDouble = random.nextDouble(0.0, 100.0);
        double randomDouble1 = random.nextDouble(0.0, 100.0);
        Square square1 = new Square(ColorSupplier.getRandomColor(), randomDouble, randomDouble1);
        return square1;
    }

    public Rectangle getRandomRectangle() {
        Random random = new Random();
        double randomDouble = random.nextDouble(0.0, 100.0);
        double randomDouble1 = random.nextDouble(0.0, 100.0);
        Rectangle rectangle = new Rectangle(ColorSupplier.getRandomColor(), randomDouble, randomDouble1);
        return rectangle;
    }

    public RightTriangle getRandomRightTriangle() {
        Random random = new Random();
        double randomDouble = random.nextDouble(0.0, 100.0);
        double randomDouble1 = random.nextDouble(0.0, 100.0);
        RightTriangle rightTriangle = new RightTriangle(ColorSupplier.getRandomColor(), randomDouble, randomDouble1);
        return rightTriangle;
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        Random random = new Random();
        double randomDouble = random.nextDouble(0.0, 100.0);
        double randomDouble1 = random.nextDouble(0.0, 100.0);
        double randomDouble2 = random.nextDouble(0.0, 100.0);
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(ColorSupplier.getRandomColor(), randomDouble, randomDouble1, randomDouble2);
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

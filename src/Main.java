
public class Main {
    public static void main(String[] args) {


        Circle circle = new Circle(ColorSupplier.getRandomColor(), 11.0);
        circle.draw();

        FigureSupplier figureSupplier = new FigureSupplier();
        figureSupplier.getRandomRectangle().draw();
        figureSupplier.getRandomRectangle().draw();
        figureSupplier.getRandomSquare().draw();
        figureSupplier.getRandomRightTriangle().draw();
        figureSupplier.getRandomIsoscelesTrapezoid().draw();
        figureSupplier.getRandomFigure().draw();
        figureSupplier.getRandomFigure().draw();
        figureSupplier.getDefaultFigures().draw();


    }

}
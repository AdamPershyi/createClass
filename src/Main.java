
public class Main {
    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figuresArray = {figureSupplier.getRandomFigure(), figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(), new Circle("White",31),
                new Rectangle("Black",5, 6),
        new Square("Yellow",11,22)};
        for( Figure s : figuresArray) {
            s.draw();
        }



    }

}
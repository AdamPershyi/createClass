public class IsoscelesTrapezoid extends Figure {

    double height;
    double sideA;
    double sideB;
    double trapezoidArea = (sideA + sideB) / 2 * height;

    public IsoscelesTrapezoid(String color, double height, double sideA, double sideB) {
        super(color);
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return (sideA + sideB) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure : Isisceles Trapezoid, area :" + Math.round(area()) + ", side A : "
                + Math.round(sideA) + ", side B : " + Math.round(sideB) + ", height : " + Math.round(height) + ", color : " + getColor());

    }
}

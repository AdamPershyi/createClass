public class Circle extends Figure {
    double diameter;

    public Circle(String color, double diameter) {
        super(color);
        this.diameter = diameter;
    }

    @Override
    public double area() {
        return diameter / 2.0;

    }

    @Override
    public void draw() {
        System.out.println("Figure : Circle, area : " + Math.round(area()) + ".units, color : " + getColor());
    }
}

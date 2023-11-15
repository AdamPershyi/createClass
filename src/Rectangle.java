public class Rectangle extends Figure {
    double length;
    double width;

    String Color;
    double areaRectangle = length * width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }


    @Override
    public double area() {
        return areaRectangle = length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure : Rectangle, area : " + Math.round(area()) + ".units, lenght : " + Math.round(length) + ", width :" + Math.round(width) + ", color : " + getColor());

    }
}

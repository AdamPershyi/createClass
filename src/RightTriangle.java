public class RightTriangle extends Figure {
    double height;
    double width;

    String Color;
    double areaRightTriangle = (height * width) / 2.0;

    public RightTriangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;

    }

    @Override
    public double area() {
        return (height * width) / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure : Right Triangle, area :" + Math.round(area()) + ", height : " + Math.round(height) + ", width :" + Math.round(width) + ", color : " + getColor());

    }
}

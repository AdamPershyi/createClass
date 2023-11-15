public class Square extends Figure {


    public double length;

    public String Color;
    public double areaSquare;

    public Square(String color, double areaSquare, double length) {
        super(color);
        this.areaSquare = areaSquare;
        this.length = length;

    }

    @Override
    public double area() {


        return length * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure : Square, area : " + Math.round(area()) + " units, side :" + Math.round(length) + " units, color : " + getColor());

    }


}

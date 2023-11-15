public abstract class  Figure implements Drawable, AreaFigures {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

import java.util.Random;

public class ColorSupplier {


    public static String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        Color color1 = Color.values()[index];


        return color1.toString();
    }
}

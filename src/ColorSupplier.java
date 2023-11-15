import java.util.Random;

public class ColorSupplier {


    public static String getRandomColor() {
        int index = new Random().nextInt(Enum.Color.values().length);
        Enum.Color color1 = Enum.Color.values()[index];


        return color1.toString();
    }
}

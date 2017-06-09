/**
 * Created by Anatoliy on 08.06.2017.
 */
public class Demo {
    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.drain();
        ChocolateBoiler chocolateBoiler1 = ChocolateBoiler.getInstance();
        chocolateBoiler1.drain();
    }

}

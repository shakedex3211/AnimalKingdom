import java.util.Random;
import java.util.regex.*;

public class __Test {
    public static void main(String[] args) {
        CatTypes a;
        Random b = new Random();

        int[] t = new int[7];

        for (int i = 0; i < 7; i++) {
            t[i] = 0;
        }

        for (int i = 0; i < 100; i++) {
            t[new Random().nextInt(5)]++;
        }

        for (int i = 0; i < 7; i++) {
            System.out.println(t[i]);
        }

    }
}

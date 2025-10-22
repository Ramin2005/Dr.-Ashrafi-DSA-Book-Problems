
public class Ch1_Problem7 {

    public static int GCD(int a, int b) {
        if (a < b) {
            return GCD(b, a);
        }
        if (a % b == 0) {
            return b;
        }
        return GCD(b, (a % b));
    }
}

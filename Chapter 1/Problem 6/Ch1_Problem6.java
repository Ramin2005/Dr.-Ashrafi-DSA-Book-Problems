
public class Ch1_Problem6 {

    public static int Multiply(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return (a + Multiply(a, (b - 1)));
    }
}

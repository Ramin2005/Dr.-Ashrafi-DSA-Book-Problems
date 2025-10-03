public class Ch1_Problem4 {
    public static void Binary(int n) {
        int mod = n % 2;
        n /= 2;
        if (n != 0)
            Binary(n);
        System.out.print(mod);
    }
}

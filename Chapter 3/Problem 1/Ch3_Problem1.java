
public class Ch3_Problem1 {

    public static long fib(int n) {

        if (n < 2) {
            return 1;
        }

        long[] fibs = new long[(n + 1)];

        fibs[0] = 1;
        fibs[1] = 1;

        for (int i = 2; i <= n; i++) {

            fibs[i] = fibs[(i - 1)] + fibs[(i - 2)];

        }

        return fibs[n];
    }
    
}

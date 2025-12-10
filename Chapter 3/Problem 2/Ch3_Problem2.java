
public class Ch3_Problem2 {

    public static long c(int n, int r) {

        if (r > n) {

            return 0;

        }

        long[][] list = new long[n + 1][n + 1];

        for (int i = 0; i < n + 1; i++) {

            list[i][0] = 1;

        }

        for (int i = 1; i < n + 1; i++) {

            for (int j = 1; j < i + 1; j++) {

                list[i][j] = list[i - 1][j - 1] + list[i - 1][j];

            }

        }

        list[n][n] = 1;

        return list[n][r];
    }

}

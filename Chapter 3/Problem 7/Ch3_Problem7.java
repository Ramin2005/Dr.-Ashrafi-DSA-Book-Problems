
public class Ch3_Problem7 {

    public static boolean isTranspose(int[][] a, int[][] b) {

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[0].length; j++) {

                if (a[i][j] != b[j][i]) {

                    return false;

                }

            }

        }

        return true;
    }
}

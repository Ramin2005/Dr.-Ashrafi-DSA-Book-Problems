
public class Ch3_Problem5 {

    public static void changeValue(int[][] list) {
        int length = list.length;

        // part a
        for (int i = 0; i < length; i++) {

            ++list[i][i];

        }

        // part b
        for (int i = 0; i < length; i++) {

            --list[i][length - i - 1];

        }

        // part c
        for (int j = 1; j < length - 1; j++) {

            for (int i = 0; i < length / 2 - Math.abs(length / 2 - j); i++) {

                list[i][j] += 2;

            }

        }

        // part d
        for (int j = 1; j < length - 1; j++) {

            for (int i = length / 2 + (int) Math.abs((float) length / 2 - 0.5 - (float) j) + 1; i < length; i++) {

                list[i][j] -= 2;

            }

        }

        // part e
        for (int i = 0; i < length; i++) {

            for (int j = 0; j < length; j++) {

            }

        }

        // part f
        for (int i = 0; i < length; i++) {

            for (int j = 0; j < length; j++) {

            }

        }

    }

    public static void main(String[] args) {
        int n = 12;
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = n * i + j;
            }
        }

        changeValue(a);

        for (int[] temp : a) {
            for (int l : temp) {
                System.out.printf("%-4d", l);
            }
            System.out.println();
        }
    }
}

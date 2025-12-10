
public class Ch3_Problem6 {

    public static void khayamPascal(int n) {

        long[][] list = new long[n][n];

        for (int i = 0; i < n; i++) {

            list[i][0] = 1;

        }

        for (int i = 1; i < n; i++) {

            for (int j = 1; j < i + 1; j++) {

                list[i][j] = list[i - 1][j - 1] + list[i - 1][j];

            }

        }

        list[n - 1][n - 1] = 1;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i + 1; j++) {

                System.out.print(list[i][j] + " ");

            }

            System.out.println();

        }
    }


    public static void main(String[] args) {
        khayamPascal(3);
    }
}

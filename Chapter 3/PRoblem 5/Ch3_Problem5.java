
import java.util.Scanner;

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
        for (int j = 0; j < length; j++) {

            int temp = length / 2 - (int) Math.abs((float) length / 2 - 0.5 - j);

            if (length % 2 == 0) {
                --temp;
            }

            for (int i = 0; i < temp; i++) {

                list[i][j] += 2;

            }

        }

        // part d
        for (int j = 0; j < length; j++) {

            int temp = length / 2 + (int) Math.abs((float) length / 2 - 0.5 - j) + 1;

            for (int i = temp; i < length; i++) {

                list[i][j] -= 2;

            }

        }

        // part e
        for (int i = 0; i < length; i++) {

            int temp = length / 2 - (int) Math.abs((float) length / 2 - 0.5 - i);

            if (length % 2 == 0) {
                --temp;
            }

            for (int j = 0; j < temp; j++) {

                list[i][j] += 3;

            }

        }

        // part f
        for (int i = 0; i < length; i++) {

            int temp = length / 2 + (int) Math.abs((float) length / 2 - 0.5 - i) + 1;

            for (int j = temp; j < length; j++) {

                list[i][j] -= 3;

            }

        }

    }

    public static void main(String[] args) {
        System.out.print("Enter number of rows & columns: ");
        int n = (new Scanner(System.in)).nextInt();
        System.out.println();

        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = n * i + j + 1;
            }
        }

        changeValue(a);

        for (int[] temp : a) {
            if (n < 10) {
                for (int l : temp) {
                    System.out.printf("%-4d", l);
                }
            } else {
                for (int l : temp) {
                    System.out.printf("%d ", l);
                }
            }
            System.out.println();
        }
    }
}


public class Ch1_Problem2 {

    public static double Average(int[] Arr, int n) {
        if (n == 1) {
            return Arr[0];
        }

        return (Arr[(n - 1)] / Arr.length) + Average(Arr, (n - 1));
    }
}

public class Ch1_Problem2 {
    public static double f(int[] Arr, int n) {
        if (n == 1)
            return Arr[0];

        return (Arr[(n - 1)] / Arr.length) + f(Arr, (n - 1));
    }
}
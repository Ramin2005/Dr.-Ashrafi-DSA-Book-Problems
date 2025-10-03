public class Ch1_Problem3 {
    public static void Reverse(int[] Arr, int[] ReverseArr, int n) {
        if (n == 1)
            ReverseArr[0] = Arr[(Arr.length - n)];
        ReverseArr[(n - 1)] = Arr[(Arr.length - n)];
        Reverse(Arr, ReverseArr, (n - 1));
    }
}

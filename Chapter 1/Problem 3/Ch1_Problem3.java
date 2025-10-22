
public class Ch1_Problem3 {

    // approach 1
    // Reverse(Array, ReverseEmptyArray, ArrayLength, ArrayLength)
    public static void Reverse(int[] Arr, int[] ReverseArr, int n, int m) {
        if (n == 1) {
            ReverseArr[0] = Arr[(m - n)];
        }

        ReverseArr[(n - 1)] = Arr[(m - n)];
        --n;
        Reverse(Arr, ReverseArr, n, m);
    }

    // approach 2
    // Reverse(Array, 0, ArrayLength)
    public static void Reverse(int[] Arr, int n, int m) {
        if ((m - n) < 1) {
            return;
        }
        --m;
        int temp = Arr[n];
        Arr[n] = Arr[m];
        Arr[m] = temp;
        ++n;
        Reverse(Arr, n, m);
    }

    // approach 3
    // Reverse(Array, 0)
    void Reverse(int[] Arr, int n) {
        if (Arr.length == n) {
            return;
        }
        int temp = Arr[n];
        ++n;
        Reverse(Arr, n);
        System.out.print(temp + " ");
    }
}

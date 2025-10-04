
import java.util.ArrayList;
import java.util.List;

public class Ch1_Problem10 {

    static List<Long> Factorials = new ArrayList<>() {
        {
            add((long) 1);
            add((long) 1);
        }
    };

    public static long Factorial(int n) {
        for (int i = Factorials.size(); i <= n; i++) {
            Factorials.add(Factorials.get(i - 1) * i);
        }

        return Factorials.get(n);
    }

    public static double sumInverseFactorials(int n) {
        if (n == 1) {
            return 1;
        }
        return (1 / Factorial(n)) + sumInverseFactorials(n - 1);
    }

}

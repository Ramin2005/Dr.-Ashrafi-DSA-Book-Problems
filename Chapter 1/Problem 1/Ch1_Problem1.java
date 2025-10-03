public class Ch1_Problem1 {
    public static int Quotient(int Dividend, int Divisor) {
        if (Dividend < Divisor)
            return 0;
        return 1 + Quotient((Dividend - Divisor), Divisor);
    }
}

public class Ch1_Problem13 {
    public static void HanoiMoves(int n, char s, char d, char a) {
        if (n == 1) System.out.println(s + "->" + d);
        else{
            HanoiMoves((n - 1), s, a, d);
            System.out.println(s + "->" + d);
            HanoiMoves((n - 1), a, d, s);
        }
    }
}

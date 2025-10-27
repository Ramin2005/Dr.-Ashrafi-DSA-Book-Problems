
public class Ch1_Problem14 {

    public static void HanoiForce(int n, char s, char d, char a) {
        if (n == 1) {
            System.out.println(s + " -> " + a);
            System.out.println(a + " -> " + d);
        } else {
            HanoiForce((n - 1), s, d, a);
            System.out.println(s + " -> " + a);
            HanoiForce((n - 1), d, s, a);
            System.out.println(a + " -> " + d);
            HanoiForce((n - 1), s, d, a);
        }
    }

}

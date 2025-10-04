
public class Ch1_Problem8 {

    public static void printTruthTable(int n, String s) { //printTruthTable( , "");
        if (n == 1) {
            System.out.println(s + "0");
            System.out.println(s + "1");
        } else {
            printTruthTable((n - 1), (s + "0 "));
            printTruthTable((n - 1), (s + "1 "));
        }
    }
}

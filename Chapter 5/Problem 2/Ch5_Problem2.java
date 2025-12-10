
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Ch5_Problem2 {

    public static Set<Object> Sub(Stack<Object> s, Queue<Object> q) {
        Set<Object> out = new HashSet<>();

        Object[] temp = s.toArray();

        for (Object a : temp) {
            out.add(a);
        }

        temp = q.toArray();

        for (Object a : temp) {
            out.add(a);
        }

        return out;
    }
}

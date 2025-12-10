
import java.util.Arrays;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Ch5_Problem2 {

    public static Set<Object> Sub(Stack<Object> s, Queue<Object> q) {
        Set<Object> out = new HashSet<>();

        out.addAll(Arrays.asList(s.toArray()));

        out.addAll(Arrays.asList(q.toArray()));

        return out;
    }
}

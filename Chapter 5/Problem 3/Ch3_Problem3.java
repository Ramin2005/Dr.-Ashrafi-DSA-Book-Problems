
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Ch3_Problem3 {

    public static void stackReverser(Stack<Object> s) {
        Queue<Object> temp = new ArrayDeque<>();

        while (!s.isEmpty()) {
            temp.offer(s.pop());
        }

        while (!temp.isEmpty()) {
            s.push(temp.poll());
        }
    }
}

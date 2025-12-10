
import java.util.ArrayDeque;
import java.util.Queue;

public class Ch4_Problem5 {

    public static Queue<Object> reverse(Queue<Object> q) {

        Queue<Object> help = new ArrayDeque<>();

        Object[] temp = q.toArray();
        Queue<Object> qq = new ArrayDeque<>();

        for (Object a : temp) {
            qq.offer(a);
        }

        re(qq, help);
        return help;
    }

    private static void re(Queue<Object> q, Queue<Object> help) {
        if (q.isEmpty()) {
            return;
        }

        Object temp = q.poll();

        re(q, help);

        help.offer(temp);
    }
}

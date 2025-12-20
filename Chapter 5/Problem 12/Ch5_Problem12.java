
import java.util.ArrayDeque;

public class Ch5_Problem12 {

    public class Stack {

        private ArrayDeque<Object> queue1 = new ArrayDeque<>();

        public Stack() {

        }

        public void push(Object Value) {

            ArrayDeque<Object> queue2 = new ArrayDeque<>();

            while (!this.queue1.isEmpty()) {

                queue2.add(this.queue1.poll());

            }

            this.queue1.add(Value);

            while (!queue2.isEmpty()) {

                this.queue1.add(queue2.poll());

            }
        }

        public Object pop() {

            if (this.queue1.isEmpty()) {

                throw new RuntimeException("Stack is empty!");

            }

            return this.queue1.poll();

        }

    }

}

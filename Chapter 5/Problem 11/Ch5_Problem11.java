
import java.util.Stack;

public class Ch5_Problem11 {

    public class Queue {

        private Stack<Object> stack = new Stack<>();
        private int size;

        public Queue() {
            this.size = 0;
        }

        public void enQueue(Object value) {

            this.stack.push(value);
            ++this.size;

        }

        public Object deQueue() throws Exception {

            if (this.size == 0) {

                throw new Exception("Queue is empty!");

            }

            Object temp;

            Stack<Object> helperStack = new Stack<>();

            while (!this.stack.isEmpty()) {

                helperStack.push(this.stack.pop());

            }

            temp = helperStack.pop();

            while (!helperStack.isEmpty()) {

                this.stack.push(helperStack.pop());

            }

            --this.size;

            return temp;
        }

    }
}

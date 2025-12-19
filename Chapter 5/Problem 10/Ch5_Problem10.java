
import java.util.HashSet;
import java.util.Stack;

public class Ch5_Problem10 {

    // prefixed to infix
    /**
     *
     * Converts any prefix string to infix string.
     *
     * @param String - Prefixed string
     * @param HashSet - HashSet of operators
     * @return String - Returns infixed string
     * @throws RuntimeException - If have invalid data in input
     */
    public static String preFixToInFix(String preFixed, HashSet<String> operatorsSet) {

        // input check statement:
        if (operatorsSet.isEmpty()) {

            throw new RuntimeException("Operator set must have at least one element!");

        }

        // taking ready input for tokenize
        String clone = preFixed
                .replaceAll("\\s*([()])\\s*", " $1 ")
                // first adds a space to the left end right of all "(" and ")" 
                .replaceAll("\\s+", " ")
                // after replace all spaces,tabs and next lines with one space
                .trim();
        // after remove spaces of the left and right

        // help data structures:
        String[] tokenized = clone.split(" ");

        Stack<String> help = new Stack<>();

        for (int i = tokenized.length - 1; i > -1; i--) {

            String token = tokenized[i];

            if (operatorsSet.contains(token)) {

                if (help.isEmpty()) {

                    throw new RuntimeException("Postfix string is invalid!");

                }
                String temp1 = help.pop();

                if (help.isEmpty()) {

                    throw new RuntimeException("Postfix string is invalid!");

                }
                String temp2 = help.pop();

                String temp3 = String.format("(%s %s %s)", temp1, token, temp2);

                help.push(temp3);

            } else {

                help.push(token);

            }

        }

        String out = help.pop();

        if (!help.isEmpty()) {

            throw new RuntimeException("Postfix string is invalid!");

        }

        return out;
    }
}

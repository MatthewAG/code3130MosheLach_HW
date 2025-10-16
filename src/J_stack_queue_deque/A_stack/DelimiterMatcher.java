package J_stack_queue_deque.A_stack;

import java.util.List;

public class DelimiterMatcher {
    private final String expression;

    public DelimiterMatcher(String expression) {
        this.expression = expression;
    }

    /**
     * Determines if the delimiters in the expression are properly matched.
     * (A classic stack application.)
     */
    public boolean isMatched() {
        Stack3130<Character> stack = new ArrayStack3130<>(); // or LinkedStack3130

        for (char ch : expression.toCharArray()) {
            if (isOpeningDelimiter(ch)) {
                stack.push(ch);
            } else if (isClosingDelimiter(ch)) {
                if (stack.isEmpty()) {
                    return false; // nothing to match with
                }

                if (!matches(stack.pop(), ch)) {
                    return false; // mismatched delimiter
                }
            }

            // for debugging
            // IO.println("ch = " + ch + ", stack = " + stack);
        }

        return stack.isEmpty(); // were all opening delimiters matched?
    }

    // parallel Lists (better done with a Map, but we didn't learn that yet)
    private static final List<Character> OPENING_DELIMITERS = List.of('(', '[', '{');
    private static final List<Character> CLOSING_DELIMITERS = List.of(')', ']', '}');

    private static boolean isOpeningDelimiter(char ch) {
        return OPENING_DELIMITERS.contains(ch);
    }

    private static boolean isClosingDelimiter(char ch) {
        return CLOSING_DELIMITERS.contains(ch);
    }

    private static boolean matches(char opening, char closing) {
        return OPENING_DELIMITERS.indexOf(opening) == CLOSING_DELIMITERS.indexOf(closing);
    }

    // demo
    static void main() {
        String[] valid = {
                "()(()){([()])}",
                "( ) ( ( ) ) {( [ ( )  ] ) } ",
                "(3) (3 + (4 - 5) ) {( [ ( )  ] ) } ",
                "((()(()){([()])}))",
                "[(5+x)-(y+z)]"
        };

        String[] invalid = {
                ")(()){([()])}",
                "({[])}",
                "([]"
        };

        for (String s : valid) {
            DelimiterMatcher matcher = new DelimiterMatcher(s);

            if (matcher.isMatched()) {
                IO.println("Error evaluating valid: " + s);
            }
        }

        for (String s : invalid) {
            DelimiterMatcher matcher = new DelimiterMatcher(s);

            if (matcher.isMatched()) {
                IO.println("Error evaluating invalid: " + s);
            }
        }
    }
}

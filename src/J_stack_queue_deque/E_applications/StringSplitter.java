package J_stack_queue_deque.E_applications;

import java.util.*;

/**
 * A StringSplitter breaks up a string into a sequence of tokens using
 * both whitespace and a list of special characters that are each
 * considered tokens. The special characters in this case are used
 * to tokenize an arithmetic expression. For example, the expression:
 *      2*3.8/(4.95-7.8)
 * would be tokenized as
 *      2 * 3.8 / ( 4.95 - 7.8 )
 * even though it has no whitespace to separate these tokens.
 * (From Building Java Programs ch. 14, with some modifications.)
 */
public class StringSplitter {
    private final Queue<Character> characters;
    private String token;

    private static final Set<Character> SPECIAL_CHARACTERS = Set.of('(', ')', '+', '-', '*', '/', '^');

    public StringSplitter(String expression) {
        characters = new ArrayDeque<>(expression.length());

        for (int i = 0; i < expression.length(); i++) {
            characters.add(expression.charAt(i));
        }

        findNext();
    }

    public boolean hasNext() {
        return token != null;
    }

    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        String result = token;
        findNext();
        return result;
    }

    private void findNext() {
        while (!characters.isEmpty() && Character.isWhitespace(characters.peek())) {
            characters.remove();
        }

        if (characters.isEmpty()) {
            token = null;
        } else if (SPECIAL_CHARACTERS.contains(characters.peek())) {
            token = String.valueOf(characters.remove());
        } else { // build a token
            StringBuilder sb = new StringBuilder().append(characters.remove());
            boolean done = false;

            while (!characters.isEmpty() && !done) {
                char ch = characters.peek();

                if (Character.isWhitespace(ch) || SPECIAL_CHARACTERS.contains(ch)) {
                    done = true;
                } else {
                    sb.append(characters.remove());
                }
            }

            token = sb.toString();
        }
    }

    // small demo
    static void main() {
        StringSplitter stringSplitter = new StringSplitter("2*3.8/(4.95-7.8)");

        while (stringSplitter.hasNext()) {
            IO.print(stringSplitter.next() + " ");
        }
    }
}
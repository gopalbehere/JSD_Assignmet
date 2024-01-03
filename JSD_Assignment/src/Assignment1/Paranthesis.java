package Assignment1;
import java.util.Stack;

public class Paranthesis {



    public static int findClosingParen(String sentence, int openingPos) {
        if (sentence == null || openingPos < 0 || openingPos >= sentence.length()) {
            throw new IllegalArgumentException("Invalid input");
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = openingPos; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);

            if (currentChar == '(') {
                stack.push(i);
            } else if (currentChar == ')') {
                if (stack.isEmpty()) {
                    throw new IllegalArgumentException("No corresponding opening parenthesis");
                }

                int matchingOpeningPos = stack.pop();
                if (matchingOpeningPos == openingPos) {
                    return i;
                }
            }
        }

        throw new IllegalArgumentException("No corresponding closing parenthesis");
    }

    public static void main(String[] args) {
        String sentence = "Sometimes (when I nest my parenthesis (also called parentheticals) too many times (like this (and this))) they get quite confusing.";
        int openingPos = 10;
        System.out.print(sentence.length());

        int closingPos = findClosingParen(sentence, openingPos);
        System.out.println("Position of the closing parenthesis: " + closingPos);
    }
}

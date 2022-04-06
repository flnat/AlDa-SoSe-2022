package Aufgabe2;

import java.util.Stack;
import java.util.Scanner;

import edu.princeton.cs.algs4.*;


public class PostfixCalculator {

    private final static String ADD = "+";
    private final static String SUB = "-";
    private final static String MUL = "*";
    private final static String DIV = "/";

    private final String input;

    PostfixCalculator(String input) {
        this.input = new In(input).readLine();
    }

    public double calculate() {
        Stack<Double> operands = new Stack<>();
        Scanner expressionParser = new Scanner(this.input);
        double first;
        double second;


        while (expressionParser.hasNext()) {
            String expression = expressionParser.next();
            try {
                double operand = Double.parseDouble(expression);
                operands.push(operand);
            } catch (NumberFormatException e) {
                switch (expression) {
                    //
                    case ADD:
                        operands.push(operands.pop() + operands.pop());
                        break;
                    case SUB:
                        first = operands.pop();
                        second = operands.pop();
                        operands.push(second - first);
                        break;
                    case MUL:
                        operands.push(operands.pop() * operands.pop());
                        break;
                    case DIV:
                        first = operands.pop();
                        second = operands.pop();
                        operands.push(second / first);
                        break;
                }
            }
        }
        return operands.pop();
    }
}

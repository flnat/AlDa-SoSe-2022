package Aufgabe2.PostfixCalc;


public class PostfixCalculatorClient {
    public static void main(String[] args) {
        PostfixCalculator postfixCalculator = new PostfixCalculator("resources//calc.txt");
        System.out.println(postfixCalculator.calculate());
    }

}

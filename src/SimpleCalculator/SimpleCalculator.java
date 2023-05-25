package src.SimpleCalculator;

public class SimpleCalculator {
    private double operand1;
    private double operand2;

    public SimpleCalculator() {
    }

    public SimpleCalculator(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }


    public double add(double num1, double num2) {
        return num1 + num2;
    }
    public  double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public  double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public  double divide(double num1, double num2) {
        return num1 / num2;
    }


}

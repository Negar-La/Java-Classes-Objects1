package src.SimpleCalculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        SimpleCalculator obj1 = new SimpleCalculator();


        Scanner myScanner = new Scanner(System.in);
        try {
            do {
                System.out.println("Please choose one of these options? ");
                System.out.println("1-addition | 2-subtraction | 3-multiplication | 4-division | 5-exit ");
                int operation = Integer.parseInt(myScanner.nextLine());
                if (operation == 5) {
                    System.out.println("Thank you");
                    break;
                } else {
                    System.out.println("please choose two numbers!\nNumber 1: ");
                    double num1 = Double.parseDouble(myScanner.nextLine());
                    System.out.println("Number 2: ");
                    double num2 = Double.parseDouble(myScanner.nextLine());

                    switch (operation) {
                        case 1:
                            System.out.println("The result of the calculation is: " + obj1.add(num1, num2));
                            break;
                        case 2:
                            System.out.println("The result of the calculation is: " + obj1.subtract(num1, num2));
                            break;
                        case 3:
                            System.out.println("The result of the calculation is: " + obj1.multiply(num1, num2));
                            break;
                        default:
                        case 4:
                            System.out.println("The result of the calculation is: " + obj1.divide(num1, num2));
                            break;
                    }
                }
            } while (true);
        } catch(NumberFormatException ex){
            System.out.println("Sorry! not a valid entry!");
        }
    }
}

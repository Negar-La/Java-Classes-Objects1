package src.RefactorIntoObjects;

import java.util.Scanner;

public class InterestCalculator {

        int compoundFrequency;
        double interestRate;

        public void myFunction(){
            Scanner inputReader = new Scanner(System.in);
            System.out.println("How much do you want to invest ($)? ");
            double principal = Double.parseDouble(inputReader.nextLine());


            System.out.println("How many years are investing? ");
            int years = Integer.parseInt(inputReader.nextLine());

            System.out.println("What is the annual interest rate % growth (%)? ");
            double annualInterest = Double.parseDouble(inputReader.nextLine());

            System.out.println("How often does the capital compound? annually | semiannually | quarterly | monthly | daily ");
            String compoundType = inputReader.nextLine();

            //calculate interest rate and compound frequency based on user input
            switch (compoundType){
                case "annually":
                    compoundFrequency = 1;
                    break;
                case  "semiannually":
                    compoundFrequency = 2;
                    break;
                case "monthly":
                    compoundFrequency = 12;
                    break;
                case "daily":
                    compoundFrequency = 365;
                    break;
                case "quarterly":
                default:
                    compoundFrequency = 4;
                    break;
            }

            interestRate = annualInterest / compoundFrequency;

            System.out.println("Calculating...");

            //calculate and display results for each year
            for(int i = 1; i <= years; i++){
                double currentBalance = principal;
                for(int j = 0; j<compoundFrequency; j++){
                    currentBalance = currentBalance *(1+(interestRate/100));
                }

                double earnings = currentBalance- principal;
                System.out.println("Year " + (i) +":");
                System.out.println("Began with:" + principal);
                System.out.println("Earned: " + earnings );
                System.out.println("Ended with " + currentBalance);

                principal = currentBalance; //set the principal for the next year
            }

        }



}

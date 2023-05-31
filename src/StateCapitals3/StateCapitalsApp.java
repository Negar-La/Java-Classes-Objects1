package src.StateCapitals3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StateCapitalsApp {
    public static void main(String[] args) throws Exception {
        Map<String, Capital> states = new HashMap<>();

        FileReader obj = new FileReader("MoreStateCapitals.txt");
        BufferedReader b = new BufferedReader(obj);
        Scanner sc = new Scanner(b);

        String[] record;

        while(sc.hasNextLine()){
            String currentLine = sc.nextLine();
            record = currentLine.split("::");
            String state = record[0];
            String capitalName = record[1];
            int population = Integer.parseInt(record[2]);
            double sqrMileage = Double.parseDouble((record[3]));
            Capital capital = new Capital(capitalName, population, sqrMileage);
            states.put(state, capital);
        }

        System.out.println(states.size() + " STATE/CAPITAL PAIRS LOADED.\n==============================");

        for(String s : states.keySet()){
            //Hint: Use the key set to get each Capital object out of the map one by one and then print each field of the Capital object to the screen.
            Capital obj1 = states.get(s);
            String capitalName = obj1.getName();
            int population = obj1.getPopulation();
            double sqrMileage = obj1.getSquareMileage();
            System.out.println(s + " - " + capitalName + " | Pop: " + population +  " | Area: " + sqrMileage);
        }

        sc = new Scanner(System.in);   //using scanner with System.in

        try{
            System.out.println("\nPlease enter the lower limit for capital city population: ");
            int userAnswer = Integer.parseInt(sc.nextLine());

            System.out.println("LISTING CAPITALS WITH POPULATIONS GREATER THAN "+ userAnswer + ":\n");

            for(String s: states.keySet()){
                Capital obj1 = states.get(s);
                String capitalName = obj1.getName();
                int population = obj1.getPopulation();
                double sqrMileage = obj1.getSquareMileage();
                if(population > userAnswer)
                    System.out.println(s + " - " + capitalName + " | Pop: " + population +  " | Area: " + sqrMileage);
            }

            System.out.println("\nPlease enter the upper limit for capital city sq mileage:");
            double userMileage = Double.parseDouble(sc.nextLine());

            System.out.println("LISTING CAPITALS WITH AREAS LESS THAN " + userMileage + ":\n");

            for(String s: states.keySet()){
                Capital obj1 = states.get(s);
                String capitalName = obj1.getName();
                int population = obj1.getPopulation();
                double sqrMileage = obj1.getSquareMileage();
                if(sqrMileage < userMileage)
                    System.out.println(s + " - " + capitalName + " | Pop: " + population +  " | Area: " + sqrMileage);
            }
        }catch(NumberFormatException nfe){
            System.out.println("Error: Invalid input");
        }






    }
}

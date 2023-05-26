package src.StateCapitals2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;


public class StateCapitals2 {
    public static void main(String[] args) throws Exception{
        Map<String, String> states = new HashMap<>();

        //reading from the file = unmarshalling the file saved in the project top level.
        FileReader obj = new FileReader("StateCapitals.txt");
        BufferedReader b = new BufferedReader(obj);
        Scanner sc = new Scanner(b);

        Random myRandom = new Random();
        Scanner userInput = new Scanner(System.in);

        String[] place = new String[2];   //place is an array of Strings with the length of 2.
        int count = 0;
        while(sc.hasNextLine()){
            //System.out.println(sc.nextLine()); //gives us the text file in the console
            String currentLine = sc.nextLine();
            place = currentLine.split("::");
            //System.out.println(place[0]);
            states.put(place[0], place[1]);
            count++;
        }

        //print out how many state/capital pairs are inside your map.
        System.out.println(count + " STATES & CAPITALS ARE LOADED.");
        System.out.println("=======");
        System.out.println("HERE ARE THE STATES :");

        //print out all the state names=keys
        Set<String> keys = states.keySet();    //or just in 1 line:     System.out.println(states.keySet());
        for(String s : keys){
            System.out.print(s + ", ");
        }

        //Choose a random state, and prompt the user to input its capital.
        List<String> keyList = new ArrayList<>(keys); //create an array list of only keys
        int randomIndex = myRandom.nextInt(keyList.size()); //random number between 0-49   keyList.size() = 50
        String randomState = keyList.get(randomIndex);

        System.out.println("\nREADY TO TEST YOUR KNOWLEDGE? WHAT IS THE CAPITAL OF " + randomState + " ?");
        String capitalAnswer = userInput.nextLine();
        if(capitalAnswer.equalsIgnoreCase(states.get(randomState))) { //retrieve the correct answer.
            System.out.println("NICE WORK! " + capitalAnswer + " IS CORRECT!");
        } else {
            System.out.println("WRONG! THE CORRECT ANSWER IS " + states.get(randomState));
        }

    }
}

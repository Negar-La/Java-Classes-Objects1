package src.RefactorIntoObjects;

import java.util.Random;
import java.util.Scanner;

public class LuckySeven {

        int rolls = 0;
        int maxMoney = 0;
        int maXMoneyRolls = 0;

        Scanner userInput = new Scanner(System.in);


        public void myFunction() {
            System.out.println("How many dollars do you have?");
            int money = Integer.parseInt(userInput.nextLine());
            // roll the dice until player has no money left
            while (money > 0){
               int dice1 = randomDice();
               int dice2 = randomDice();

                if(dice1 + dice2 == 7) {
                    money = money + 4;
                    rolls++;
                } else {
                    money = money -1;
                    rolls++;
                }

                if(money > maxMoney) {
                    maxMoney = money;
                    maXMoneyRolls = rolls;

                }
                //  System.out.println("Money "+ money);
                //  System.out.println("maxMoney "+ maxMoney);
            }
            
            displayMessage("You are broke after " + rolls + " rolls.");
            displayMessage("You should have quit after " + maXMoneyRolls + " rolls when you had " + maxMoney + ".");

        }

    private int randomDice() {
        Random myRandom = new Random();
        int dice = myRandom.nextInt(6)+1;  // 1-6
        return dice;
    }

    private void displayMessage(String s) {
        System.out.println(s);

    }



}

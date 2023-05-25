package src.UserIO;

public class TestingUserIO {
    public static void main(String[] args) {
        // we create a new UserIOImpl object on the heap, but we point to it with a UserIO reference.
        UserIO userIO = new UserIOImpl();
      int smallNum = userIO.readInt("Give me a small number :");
      int bigNum = userIO.readInt("Now give me a much bigger number! :");
      if(bigNum < smallNum) {
          userIO.print("Hey! " + smallNum +" is BIGGER than " + bigNum);
          userIO.print("I guess I can fix it.");
          int swapNum = bigNum;     //Using swapNum to fix this, so we have the correct range: smallNum-bigNum
          bigNum = smallNum;
          smallNum = swapNum;
      }
      //calling readInt method with 3 parameters:
      int betweenNum = userIO.readInt("Now give me one in between! : ", smallNum, bigNum);
//        System.out.println("smallNum : "+ smallNum);
      userIO.print("I like the number "+betweenNum+"!");
    }
}

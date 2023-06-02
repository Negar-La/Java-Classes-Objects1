package src.Exceptions;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] integerArray = {1, 2, 3, 4};

        //System.out.println(integerArray[6]);  //ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 4

        try{
            System.out.println(integerArray[6]);
        } catch (java.lang.ArrayIndexOutOfBoundsException e){  //e is the object from class exception
            System.out.println(e.getMessage()+ "  ArrayIndexOutOfBoundsException");
        }

        //or   using general Exception class
        /*
        try{
            System.out.println(integerArray[6]);
        } catch (Exception e){                    //using general Exception class
            System.out.println(e.getMessage()+ "  ArrayIndexOutOfBoundsException");
        }

         */
    }
}

package src.Exceptions;

public class ArithmeticException {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        //int c = a/b;
        //System.out.println(c);        //ArithmeticException: / by zero

        //--------try-catch-----------

        try{
            int c = a/b;
            System.out.println(c);
        } catch(java.lang.ArithmeticException e){ //search for the error exception
            System.out.println(e.getMessage() + "  you cannot divide by zero.");
        }
    }
}

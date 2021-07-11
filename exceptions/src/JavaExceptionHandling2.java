import java.io.*;
import java.util.*;

public class JavaExceptionHandling2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        try {
           Integer number1 = scanner.nextInt();
           Integer number2 = scanner.nextInt();
           System.out.println(number1/number2);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (InputMismatchException  e) {
            System.out.println("java.util.InputMismatchException");
        }

        scanner.close();
    }
}
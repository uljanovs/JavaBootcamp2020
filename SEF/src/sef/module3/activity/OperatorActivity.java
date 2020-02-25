package sef.module3.activity;

/**
 * @author
 */
public class OperatorActivity {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Declare numbers to be operated
        int i = 8;
        int j = 5;
        // Subtract numbers
        int result = i - j;
        // Print result
        System.out.println("Difference = " + result);
        // Add numbers
        result = i + j;
        // Print result
        if (result < 0 || i > j) {
            System.out.println("Addition = " + result);
        } else {
            System.out.println("Hello");
        }
    }
}

public class sample.java {
    public static void main(String[] args) {
        // Number of rows for the pattern
        int rows = 5;

        // Loop for each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}


import java.util.*;

public class LowerTriangle {
    public static void main(String[] args) {
        System.out.println("Input the size of n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // outer-loop
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("* ");
            }
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();

        }
        sc.close();
    }
}

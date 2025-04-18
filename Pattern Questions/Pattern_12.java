import java.util.*;
public class Pattern_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int sp = 2*n-3;
        while(row <= n) {
            // star
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            // Space
            int j = 1;
            while(j <= sp) {
                System.out.print("  ");
                j++;
            }
            int k = 1;
            if(row == n) {
                k = 2;
            }
            while(k <= star) {
                System.out.print("* ");
                k++;
            }
            row++;
            sp -= 2;
            star++;
            System.out.println();
        }
    }
}

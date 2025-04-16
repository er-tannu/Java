import java.util.*;
public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = row;
        int sp = n+n-row;
        while( row <= n) {
            int i = 1;
            while ( i <= sp ) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while ( j <= star) {
                System.out.print("* ");
                j++;
            }
            row++;
            sp -= 2;
            star++;
            System.out.println();
        }
    }
}

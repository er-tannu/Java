import java.util.*;
public class Pattern_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int sp = n-1;
        while(row <= n) {
            int i = 1;
            while(i <= sp) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while(j <= star) {
                if (j % 2 == 0) {
                    System.out.print("! ");
                } else {
                    System.out.print("* ");
                }
                j++;
            }
            row++;
            star +=2;
            sp--;
            System.out.println();
        }
    }
}

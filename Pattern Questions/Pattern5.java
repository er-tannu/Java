public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        while( row <= n) {
            int sp = 1;
            while( sp <= n-row) {
                System.out.print("  ");
                sp++;
            }
            int star = 1;
            while(star <= row) {
                System.out.print("* ");
                star++;
            }
            row++;
            System.out.println();
        }
    }
}
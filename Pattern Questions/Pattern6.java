public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        while( row <= n) {
            int sp = 1;
            while ( sp < row ) {
                System.out.print("  ");
                sp++;
            }
            int star = 5;
            while ( star >= row) {
                System.out.print("* ");
                star--;
            }
            row++;
            System.out.println();
        }
    }    
}
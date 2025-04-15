public class Pattern4 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        while(row <= n) {
            int star = row;
            while(star <= n) {
                System.out.print("* ");
                star++;
            }
            System.out.println();
            row++;
        }
    }
}
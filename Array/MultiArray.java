import java.util.*;
public class MultiArray {

    // Find the location of element from matrix
    public static boolean search(int matrix[][], Scanner sc) {
        System.out.print("Enter the key which you want to find the location: ");
        int key = sc.nextInt();
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.println("Found at cell: (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not Found");
        return false;
    }

    // Largest and Smallest value
    public static void largestSmallest(int matrix[][]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(max < matrix[i][j]) {
                    max = matrix[i][j];
                }
                if(min > matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("Maximum value is: " + max);
        System.out.println("Minimum value is: " + min);
    }

    // Display 2D Array
    public static void print(int matrix[][]) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        } 
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];

        // Input values of Array
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }               
        System.out.println("Your Array is: ");
        print(matrix);
        System.out.println(search(matrix, sc));

        largestSmallest(matrix);
    }
}
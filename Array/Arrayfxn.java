import java.util.*;

public class Arrayfxn {
    public static int linearSearch(int arr[], int key) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void largest(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Maximum value is: " + max);
    }

    public static void smallest(int arr[]) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Minimum value is: " + min);
    }

    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length-1;

        while(start < end) {
            int mid = start + (end-start)/2;
            if(arr[mid] == key) {
                return mid;
            } else if(arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void reverse(int arr[]) {
        int first = 0;
        int last = arr.length-1;
        while(first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void pair(int arr[]) {
        int totalpair = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
                totalpair++;
            }
            System.out.println();
        }
        System.out.println("Total pairs of array is: " + totalpair);
    }

    public static void subPairs(int arr[]) { // 90, 78, 56, 34, 12    O(n3)
        int currsum = 0;
        int max = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                currsum = 0;
                for(int k=i; k<=j; k++) {
                    currsum += arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            if(max < currsum) {
                max = currsum;
            }
            System.out.println();
        }
        System.out.println("Maximum sum of array: " + max);
    }

    public static void prefix(int arr[]) { // O(n2)
        int currsum = 0;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                currsum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
            }
            if(max < currsum) {
                max = currsum;
            }
        }
        System.out.println("Maximum sum of array is: " + max);
    }

    public static void kadanes(int arr[]) { // O(n)
        int currsum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            currsum += arr[i];
            max = Math.max(currsum, max);
        }
        System.out.println("Maximum element of array is: " + max);
    }
    public static void main(String[] args) {
        int arr[] = {12, 34, 56, 78, 90};
        int key = 78;

        System.out.println("----------Linear Search-----------");
        int index = linearSearch(arr, key);
        if(index == -1) {
            System.out.println("Element not Found");
        } else {
            System.out.println("Element at index: " + index);
        }

        System.out.println("------------Binary Search-----------------");
        int bs = binarySearch(arr, key);
        if(bs == -1) {
            System.out.println("ELement not Found");
        } else {
            System.out.println("Element at index: " + bs);
        }

        smallest(arr);
        largest(arr);

        System.out.println("---------Array Reverse-----------");
        reverse(arr);
        System.out.println("------------Pairs of Array------------");
        pair(arr);
        System.out.println("-------------Sub Pairs Array-----------");
        subPairs(arr);
        System.out.println("----------------Prefix-------------");
        prefix(arr);
        System.out.println("-------------Kadanes's----------------");
        kadanes(arr);
    }
    
}
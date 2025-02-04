package javalab;
import java.util.Scanner;

public class Quicksort {

    static int partition(int A[], int lb, int ub) {
        int pivot = A[ub];
        int i = lb - 1;
        for (int j = lb; j < ub; j++) {
            if (A[j] <= pivot) {
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }

        int temp = A[i + 1];
        A[i + 1] = A[ub];
        A[ub] = temp;

        return (i + 1);
    }

    static void quicksort(int A[], int lb, int ub) {
        if (lb < ub) {
            int loc = partition(A, lb, ub);
            quicksort(A, lb, loc - 1);
            quicksort(A, loc + 1, ub);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int len = s.nextInt();
        int num[] = new int[len];

        System.out.println("Length of the array is: " + len);
        for (int i = 0; i < len; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            num[i] = s.nextInt();
        }

        System.out.println("Unsorted Array: ");
        for (int i = 0; i < len; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println("\n");

        quicksort(num, 0, len - 1);

        System.out.println("Sorted Array: ");
        for (int i = 0; i < len; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
package input;

import java.util.Scanner;

import sorting.MergeSort;

public class MergeSortInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input for the array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();

        // Initialize and sort using MergeSort
        MergeSort mergeSort = new MergeSort(array);
        mergeSort.sort();
    }
}
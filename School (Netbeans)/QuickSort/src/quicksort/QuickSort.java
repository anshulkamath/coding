/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author anshulkamath
 */
public class QuickSort {

    public static int[] quickSort(int[] arr, int low, int high) 
    {
        if (arr == null || arr.length == 0)
                return null;

        if (low >= high)
                return null;

        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) 
        {
                while (arr[i] < pivot) 
                {
                        i++;
                }

                while (arr[j] > pivot) 
                {
                        j--;
                }

                if (i <= j) 
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
        }

        // Recursion
        if (low < j)
                quickSort(arr, low, j);

        if (high > i)
                quickSort(arr, i, high);
        
        return arr;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int[] c = new int[10];
        
        for (int i = 0; i < (c.length - 1); i++)
        {
            c[i] = (int)(Math.random() * 10);
        }
        
        c = quickSort(c, c[0], c.length - 1);
        
        for (int i = 0; i < (c.length - 1); i++)
        {
            System.out.println(c[i]);
        }
        
    }
    
}

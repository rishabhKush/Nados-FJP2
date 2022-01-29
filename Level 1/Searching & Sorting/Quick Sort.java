//https://nados.io/question/quick-sort

//See RK Notes for more clarification pg-65

import java.io.*;
import java.util.*;

public class Main {

  public static void quickSort(int[] arr, int left, int right) {
    //write your code here
    if(left > right){
      //no ele  -> base case -> already return
      return;
    }

    int pivotIndx = partition(arr,arr[right],left,right);
    //partition around last element -> last ele is at current index

    //partion of LEFT part of pivot
    quickSort(arr,left, pivotIndx-1);
    //partition on RIGHT part of pivot
    quickSort(arr,pivotIndx+1,right);
    
    
  }

  public static int partition(int[] arr, int pivot, int lo, int hi) {
    System.out.println("pivot -> " + pivot);
    int i = lo, j = lo;
    while (i <= hi) {
      if (arr[i] <= pivot) {
        swap(arr, i, j);
        i++;
        j++;
      } else {
        i++;
      }
    }
    System.out.println("pivot index -> " + (j - 1));
    return (j - 1);
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    quickSort(arr, 0, arr.length - 1);
    print(arr);
  }

}
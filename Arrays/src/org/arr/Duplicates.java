package org.arr;

import java.util.HashMap;

public class Duplicates 
{
   static void removeDuplicates(int[] a, int n){
        HashMap<Integer, Boolean> mp = new HashMap<>();
 
        for (int i = 0; i < n; ++i) {
            if (mp.get(a[i]) == null){
                System.out.print(a[i] + " ");
                mp.put(a[i], true);
            }
        }
    }
   public static void main(String[] args){
      int[] arr = {10,10,20,50,60,80,60,50};
      int n = arr.length;
      removeDuplicates(arr, n);
   }
}
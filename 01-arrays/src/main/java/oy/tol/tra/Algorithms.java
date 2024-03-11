package oy.tol.tra;


public class Algorithms {
   public static <T > void swap(T[] array, int x, int y) {

      T tmp = array[x];
      array[x] = array[y];
      array[y] = tmp;
   }
    public static <T extends Comparable<T>> void sort(T [] array) {
    
      int i = array.length-1;
      
      for(int j = i; j > 0; --j)
      {
         for(int k = 0; k <= j - 1; ++k)
         {
            if(array[k].compareTo(array[k+1]) > 0 )
            {
               swap(array, k, k+1);
            }
         }
      }

    }

    // ...
    public static <T> void reverse(T [] array) {
       
            int i = 0;
            while (i < array.length / 2) {
               swap(array, i, array.length-i-1);
               i++;
            }
        
    }
}


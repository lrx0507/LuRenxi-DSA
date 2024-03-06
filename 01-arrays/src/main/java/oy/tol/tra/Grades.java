package oy.tol.tra;

public class Grades {
   
   private Integer [] grades = null;

   public Grades(Integer [] grades) {
      this.grades = new Integer [grades.length];
      for (int counter = 0; counter < grades.length; counter++) {
         this.grades[counter] = grades[counter];
      }
   }

   
   public void reverse() {
     
     /*  int i = 0;
      while (i < grades.length/2) {
         int temp = grades[i];
         grades[i] = grades[grades.length-i-1];
         grades[grades.length-i-1] = temp;
         i++;
     }*/
     Algorithms.reverse(grades);
   }

   public void sort() {
      /*int i = grades.length-1;
      
      for(int j = i; j > 0; --j)
      {
         for(int k = 0; k <= j - 1; ++k)
         {
            if(grades[k] > grades[k+1])
            {
               int tmp = grades[k];
               grades[k] = grades[k+1];
               grades[k+1] = tmp;
            }
         }
      }*/
      Algorithms.sort(grades);
   }

   public Integer [] getArray() {
      return grades;
   }
}

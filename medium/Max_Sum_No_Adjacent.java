//https://www.geeksforgeeks.org/maximum-sum-such-that-no-two-elements-are-adjacent/
import java.util.*;

class GFG{

    static int max_sum(int arr[], int n){
      int incl = arr[0];
      int excl = 0;
      int new_excl = 0;

      for(int i = 1; i<n; i++){
          new_excl = Math.max(incl, excl);

          incl = excl + arr[i];
          excl = new_excl;
      }

      return Math.max(incl,excl);
    }
    public static void main(String[] args){
      //int arr[] = {5, 5, 10, 100, 10, 5};
      int arr[] = {5,  5, 10, 40, 50, 35};
      int n = arr.length;
      System.out.println(max_sum(arr,n));
    }
}

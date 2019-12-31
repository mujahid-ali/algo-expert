//https://www.geeksforgeeks.org/given-an-array-a-and-a-number-x-check-for-pair-in-a-with-sum-as-x/

import java.util.*;

class GFG{
  static void findPair(int arr[], int sum){
    int n = arr.length;

    HashSet<Integer> hs = new HashSet<Integer>();
    for(int i = 0; i<n; i++){
      int temp = sum - arr[i];

      if(hs.contains(temp)){
        System.out.println(temp +" " + arr[i]);
      }
      hs.add(arr[i]);
    }

  }

  public static void main(String[] args){
    int arr[] = {1,4,45,6,10,-8};
    int sum = 16;
    findPair(arr,sum);
  }
}

//https://www.geeksforgeeks.org/coin-change-dp-7/
import java.util.Arrays;
class GFG{

  static int count(int arr[], int m, int n){
    if(n == 0)
      return 1;

    if(n < 0)
      return 0;

    if(m <= 0 && n >= 1 )
      return 0;

    return count(arr, m-1, n) + count(arr, m, n-arr[m-1]);
  }

  static int dp(int arr[], int m, int n){
    int table[] = new int[n+1];
    Arrays.fill(table,0);
    table[0] = 1;

    for(int i = 0; i<m; i++){
      for(int j = arr[i]; j <= n; j++){
        table[j] += table[j-arr[i]];
      }
    }
    return table[n];
  }
  public static void main(String[] args){
    int arr[] = {1,2,3};
    int m = arr.length;
    int n = 10;
    System.out.println(count(arr,m,n));
    System.out.println(dp(arr,m,n));
  }
}

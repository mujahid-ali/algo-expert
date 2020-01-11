//https://www.geeksforgeeks.org/find-minimum-number-of-coins-that-make-a-change/

class GFG{

  static int dp_coin_change(int arr[], int m, int value){
    int table[] = new int[value +1];
    for(int i = 1; i<=value; i++){
      table[i]  = Integer.MAX_VALUE;
    }
    table[0] = 0;

    for(int i = 1; i<= value; i++){
      for(int j = 0; j < m; j++){
        if(arr[j] <= i){
          int remaining = table[i-arr[j]];
          if(remaining < Integer.MAX_VALUE && remaining + 1 < table[i]){
            table[i] = remaining + 1;
          }
        }
      }
    }
    return table[value];
  }
  public static void main(String[] args){
    int arr[] = {9, 6, 5, 1};
    int m = arr.length;
    int value = 11;

    System.out.println(dp_coin_change(arr, m, value));
    System.out.println(dp_coin_change(arr, m, 10));
    System.out.println(dp_coin_change(arr, m, 100));
    System.out.println(dp_coin_change(arr, m, 1));
    System.out.println(dp_coin_change(arr, m, 17));

  }
}

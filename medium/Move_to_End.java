//https://www.geeksforgeeks.org/move-zeroes-end-array/
class GFG{

  public void move_to_end(int arr[], int n){
    int count = 0;
    for(int i = 0; i<n; i++){
      if(arr[i] != 0){
        arr[count++] = arr[i];
      }
    }
    while(count < n){
      arr[count++] = 0;
    }

  }
  public static void main(String[] args){
    int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
    int n = arr.length;
    GFG g = new GFG();
    g.move_to_end(arr,n);
    for(int i = 0; i<n; i++){
      System.out.print(arr[i] + " ");
    }
  }
}

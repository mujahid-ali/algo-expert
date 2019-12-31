
class Program {
  public static int getNthFib(int n) {
    // Write your code here.
    if(n == 0)
      return 0;

    if(n == 1)
        return 1;
    int res = 0, a=0,b=1;
    for(int i = 2; i<=n; i++){
      res = a + b;
      a = b;
      b = res;
    }
    return res;
  }

  public static void main(String[] args){
    int n = 9;
    System.out.println(getNthFib(n));
  }
}

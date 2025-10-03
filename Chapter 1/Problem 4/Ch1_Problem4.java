public class Ch1_Problem4{
  public static void f(int n){
  int temp = n % 2;
  n /= 2;
  if(n != 0) f(n);
  System.out.print(temp);
  }
}

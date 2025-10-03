public class Ch1_problem5{
  public static int f(int Arr[], int n){
  if(n == 1) return Arr[0];
  int temp1 = f(Arr, (n - 1));
  int temp2 = Arr[(n -1)]
  if(temp1 > temp2) return temp1;
  return temp2;
  }
}

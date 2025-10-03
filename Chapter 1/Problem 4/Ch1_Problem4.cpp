#include <iostream>
using namespace std;

void f(int n){
  int temp = n % 2;
  n /= 2;
  if(n != 0) f(n);
  cout << temp;
}

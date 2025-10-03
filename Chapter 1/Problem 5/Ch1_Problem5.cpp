#include <iostream>
using namespace std;

int Max(int Arr[], int n)
{
    if (n == 1)
        return Arr[0];
    int temp1 = Max(Arr, (n - 1));
    int temp2 = Arr[(n - 1)];
    if (temp1 > temp2)
        return temp1;
    return temp2;
}

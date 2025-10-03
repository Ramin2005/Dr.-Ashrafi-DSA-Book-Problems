#include <iostream>
using namespace std;

void Reverse(int Arr[], int ReverseArr[], int n)
{
    if (n == 1)
        ReverseArr[0] = Arr[(sizeof(Arr) - n)];
    ReverseArr[(n - 1)] = Arr[(sizeof(Arr) - n)];
    Reverse(Arr, ReverseArr, (n - 1));
}
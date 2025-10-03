#include <iostream>
using namespace std;

double Average(int Arr[], int n)
{
    if (n == 1)
        return Arr[0];

    return (Arr[(n - 1)] / sizeof(Arr)) + Average(Arr, (n - 1));
}
#include <iostream>
using namespace std;

// approach 1
// Reverse(Array, ReverseEmptyArray, ArrayLength, ArrayLength)
void Reverse(int Arr[], int ReverseArr[], int n, int l)
{
    if (n == 1)
        ReverseArr[0] = Arr[(l - n)];
    ReverseArr[(n - 1)] = Arr[(l - n)];
    --n;
    Reverse(Arr, ReverseArr, n, l);
}

// approach 2
// Reverse(Array, 0, ArrayLength)
void Reverse(int Arr[], int n, int m)
{
    if ((m - n) < 1)
        return;
    --m;
    int temp = Arr[n];
    Arr[n] = Arr[m];
    Arr[m] = temp;
    ++n;
    Reverse(Arr, n, m);
}

// approach 3
// Reverse(Array, 0)
void Reverse(int Arr[], int n)
{
    if (sizeof(Arr) == n)
        return;
    int temp = Arr[n];
    ++n;
    Reverse(Arr, n);
    cout << temp;
}
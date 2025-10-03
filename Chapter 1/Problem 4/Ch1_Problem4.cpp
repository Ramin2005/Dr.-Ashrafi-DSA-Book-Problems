#include <iostream>
using namespace std;

void Binary(int n)
{
    int mod = n % 2;
    n /= 2;
    if (n != 0)
        Binary(n);
    cout << mod;
}

#include <iostream>
#include <vector>
using namespace std;

vector<unsigned long long> Factorials = {1, 1};

unsigned long long Factorial(int n)
{
    for (int i = Factorials.size(); i <= n; i++)
        Factorials.push_back(Factorials[(i - 1)] * i);

    return Factorials[n];
}

long double sumInverseFactorials(int n)
{
    if (n == 1)
        return 1;
    return (1 / Factorial(n)) + sumInverseFactorials(n - 1);
}
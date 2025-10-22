#include <iostream>
using namespace std;

// Combination(n, -1, -1, -1)
void Combination(int n, int num10, int num5, int num2)
{
    if (n == 0)
    {
        if (num10 == -1)
            num10 = 0;
        if (num5 == -1)
            num5 = 0;
        if (num2 == -1)
            num2 = 0;

        printf("\n%d %d %d", num10, num5, num2);
        return;
    }

    if (n < 2)
        return;

    if (num10 == -1)
    {
        int temp = n / 10;
        for (int i = 0; i <= temp; i++)
        {
            Combination((n - (10 * i)), i, num5, num2);
        }
        num10 = 0;
    }

    if (num5 == -1)
    {
        int temp = n / 5;
        for (int i = 0; i <= temp; i++)
        {
            Combination((n - (5 * i)), num10, i, num2);
        }

        num5 = 0;
    }

    Combination((n % 2), num10, num5, (n / 2));
}
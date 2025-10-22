#include <iostream>
using namespace std;

// Combination(n, -1, -1, -1)
void Combination(int n, int num10, int num5, int num2)
{
    if (n == 0)
    {
        if (num10 == -1)
        {
            num10 = 0;
        }
        if (num5 == -1)
        {
            num5 = 0;
        }
        if (num2 == -1)
        {
            num2 = 0;
        }
        printf("\n%d %d %d", num10, num5, num2);
        return;
    }

    if (n < 2)
        return;

    if (num5 != -1)
    {
        Combination((n % 2), num10, num5, (n / 2));
        return;
    }

    if (num10 == -1)
    {
        int temp = n / 10;
        for (int i = 0; i <= temp; i++)
        {
            Combination(n, i, num5, num2);
            n -= 10;
        }
        n += 10;
    }

    if (num5 == -1 && num10 != -1)
    {
        int temp = n / 5;
        for (int i = 0; i <= temp; i++)
        {
            Combination(n, num10, i, num2);
            n -= 5;
        }
    }
}
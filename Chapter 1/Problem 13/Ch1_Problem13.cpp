#include <iostream>
using namespace std;

void HanoiMoves(int n, char s, char d, char a)
{
    if (n == 1)
        printf("\n%c -> %c", s, d);
    else
    {
        HanoiMoves((n - 1), s, a, d);
        printf("\n%c -> %c", s, d);
        HanoiMoves((n - 1), a, d, s);
    }
}
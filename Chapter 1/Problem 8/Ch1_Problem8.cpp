#include <iostream>
using namespace std;

void printTruthTable(int n, string s)
{ // printTruthTable( , "");
    if (n == 1)
    {
        cout << s + "0\n";
        cout << s + "1\n";
    }
    else
    {
        printTruthTable((n - 1), (s + "0 "));
        printTruthTable((n - 1), (s + "1 "));
    }
}
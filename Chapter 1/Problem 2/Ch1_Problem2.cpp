double f(int Arr[], int n)
{
    if (n == 1)
        return Arr[0];

    return (Arr[(n - 1)] / sizeof(Arr)) + f(Arr, (n - 1));
}
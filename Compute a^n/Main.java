#include <iostream>
using namespace std;

int main() 
{
    int exponent;
    float base, result = 1;

    cout << "Enter the value of a\n"
      <<"Enter the value of n\n";
    cin >> base >> exponent;

    cout << "The value of "<<base << " power " << exponent<<" is ";

    while (exponent != 0) {
        result *= base;
        --exponent;
    }

    cout << result;
    
    return 0;
}
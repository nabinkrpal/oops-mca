#include <iostream>
using namespace std;

void callByValue(int a) {
    a = 20; 
    cout << "Inside callByValue function: a = " << a << endl;
}

void callByReference(int &a) {
    a = 30;
    cout << "Inside callByReference function: a = " << a << endl;
}

void swapByReference(int &x, int &y) {
    int temp = x;
    x = y;
    y = temp;
}

int main() {
    int num1 = 10;
    int num2 = 40;

    cout << "Before callByValue, num1 = " << num1 << endl;
    callByValue(num1);
    cout << "After callByValue, num1 = " << num1 << endl; 

    cout << "\nBefore callByReference, num2 = " << num2 << endl;
    callByReference(num2);
    cout << "After callByReference, num2 = " << num2 << endl; 

    int a = 5, b = 15;
    cout << "\nBefore swap, a = " << a << ", b = " << b << endl;
    swapByReference(a, b);
    cout << "After swap, a = " << a << ", b = " << b << endl; 
    
    return 0;
}

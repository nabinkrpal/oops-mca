#include <iostream>
using namespace std;

double calculateSimpleInterest(double principal, double time, double rate = 5.0) {
    return (principal * rate * time) / 100;
}

int main() {
    double principal, time, rate;
    
    cout << "Enter principal amount: ";
    cin >> principal;
    
    cout << "Enter time in years: ";
    cin >> time;
    
    cout << "Enter rate of interest (or press 0 to use the default rate of 5%): ";
    cin >> rate;
    
    double interest = (rate == 0) ? calculateSimpleInterest(principal, time) : calculateSimpleInterest(principal, time, rate);
    
    cout << "Simple Interest = " << interest << endl;
    
    return 0;
}

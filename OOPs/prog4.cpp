#include <iostream>
using namespace std;

class Animal {
public:
    void eat() {
        cout << "Animal is eating" << endl;
    }
};

class Mammal : public Animal {
public:
    void walk() {
        cout << "Mammal is walking" << endl;
    }
};

class Dog : public Mammal {
public:
    void bark() {
        cout << "Dog is barking" << endl;
    }
};

int main() {
    Dog myDog;
    myDog.eat();    
    myDog.walk();   
    myDog.bark();   

    return 0;
}

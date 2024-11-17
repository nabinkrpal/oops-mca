#include <iostream>
using namespace std;

class Example {
    int x, y;

public:

    Example() : x(19), y(35) {}
    
    Example(int val) : x(val), y(0) {}

    Example(int val1, int val2) : x(val1), y(val2) {}

    Example(const Example &obj) : x(obj.x), y(obj.y) {}

    void display() const {
        cout << "x = " << x << ", y = " << y << endl;
    }
};

int main() {
    Example obj1;
    obj1.display();

    Example obj2(10);
    obj2.display();

    Example obj3(20, 30);
    obj3.display();

    Example obj4 = obj3;
    obj4.display();

    return 0;
}

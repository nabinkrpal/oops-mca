#include <iostream>
using namespace std;

class Student {
protected:
    int studentID;
public:
    void setStudentID(int id) {
        studentID = id;
    }
    void displayStudentID() const {
        cout << "Student ID: " << studentID << endl;
    }
};

class Marks : virtual public Student {
protected:
    int mark1, mark2;
public:
    void setMarks(int m1, int m2) {
        mark1 = m1;
        mark2 = m2;
    }
    void displayMarks() const {
        cout << "Marks: " << mark1 << ", " << mark2 << endl;
    }
};

class Sports : virtual public Student {
protected:
    int sportsMark;
public:
    void setSportsMark(int smark) {
        sportsMark = smark;
    }
    void displaySportsMark() const {
        cout << "Sports Mark: " << sportsMark << endl;
    }
};

class Result : public Marks, public Sports {
public:
    void displayTotal() const {
        int total = mark1 + mark2 + sportsMark;
        displayStudentID();
        displayMarks();
        displaySportsMark();
        cout << "Total Marks: " << total << endl;
    }
};

int main() {
    Result student;
    student.setStudentID(101);
    student.setMarks(85, 90);
    student.setSportsMark(15);
    student.displayTotal();

    return 0;
}

//name : khadiga mohamed 
//id : 20216283
#include <iostream>
using namespace std;
int main() {
int num;
cin >> num;
int first_digit = num / 1000;
if (first_digit % 2 == 1) {
cout << "ODD" << endl;
} else {
    cout << "EVEN" << endl;
}
return 0;
}
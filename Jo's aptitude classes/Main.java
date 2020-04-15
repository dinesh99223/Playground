#include <iostream>
using namespace std;

int main() {
    int n1, n2,n3,n4,hcf;
    cin >> n1 >> n2>>n3>>n4;
    for (int i = 1; i <=  n3; ++i) {
        if (n1 % i == 0 && n2 % i ==0 && n3%i==0) {
            hcf = i;
        }
    }
  if(hcf==n4)
    cout<<"Answer is correct.";
  else
	cout<<"Answer is wrong.";
}
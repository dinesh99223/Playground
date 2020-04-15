#include<iostream>
using namespace std;
int main ()
{  
    int i, num1,num2,x, div, sum=0;
    cin >> num1;
  	cin>>num2;
  	x=num1+num2;
    for (i=1; i < x; i++)
    {
        div = x % i;
        if (div == 0)
            sum = sum + i;
    }
    if (sum == x)
        cout<<"They can read the message";
    else
        cout << "They can't read the message";
    return 0;
}
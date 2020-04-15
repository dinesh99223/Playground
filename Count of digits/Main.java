#include<iostream>
using namespace std;
int main()
{
int no,a=0,x;
cin>>no;
while(no>0)
{
no=no/10;
x=a++;
}
cout<<x+1;
}
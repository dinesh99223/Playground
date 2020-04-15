#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,e,t,cents;
  float dol,cent;
  cin>>a>>b>>c>>d;
  e=a+c;
  cents=b+d;
  dol=cents/100.00;
  cent=dol-floor(dol);
  t=e+floor(dol);
  cout<<t<<endl;
  cout<<cent*100;
}
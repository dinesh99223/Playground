#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int a,i,b,c,d=11,x;
  cin>>a;
  b=pow(d,2);
  if(a==1)
  {
      cout<<b;
  }
  else
  {
    cout<<b<<" ";
    for(i=1;i<a;i++)
    {
       
        c=d+4;
        x=pow(c,2);
        cout<<x<<" ";
        d=c;
    }
  }
}
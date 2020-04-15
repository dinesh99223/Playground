#include<iostream>
using namespace std;
int main()
{
  int a,i;
  float b=0.5,c;
  cin>>a;
  if(a==1)
  {
      cout<<b;
  }
  else
  {
    cout<<b<<" ";
    for(i=1;i<a;i++)
    {
        c=b*3;
        cout<<c<<" ";
        b=c;
    }
  }
}
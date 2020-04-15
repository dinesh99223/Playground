#include<iostream>
using namespace std;
int main()
{
  int a;
  float t,b=10.15,c=13.30,d=18.00,e=22.00;
  cin>>a;
  cin>>t;
  if(a>13)
  {
    if(t==b||t==d||t==e)
    {
      cout<<"$8.00";
    }
    else
      cout<<"$5.00";
  }
  else
  {
    if(t==b||t==d||t==e)
    {
      cout<<"$4.00";
    }
    else
      cout<<"$2.00";
  }
      
      
}
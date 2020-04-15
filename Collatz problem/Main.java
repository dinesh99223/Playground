#include<iostream>
using namespace std;
int main()
{
  int a,count=0;
  cin>>a;
  while(a!=1)
  {
      cout<<a<<"\n";
      if(a%2==0)
      {
          a=a/2;
          count=count+1;
      }
      else if(a%2!=0)
      {
          a=(3*a)+1;
          count=count+1;
      }
  }
  cout<<a<<"\n";
  cout<<count;
}
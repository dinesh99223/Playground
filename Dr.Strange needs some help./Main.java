#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int a,b,c,n;
  cin>>a>>b>>c;
  n=pow(a,b);
  if(n>=c)
  cout<<"Doctor, you can proceed with your experiment.";
  else
  cout<<"Sorry Doctor! You need more bacteria.";
}
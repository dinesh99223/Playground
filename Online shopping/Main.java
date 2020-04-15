#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f,g,h,i,flip,snap,amaz;
  cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  flip=a-(a*b/100.0)+c;
  cout<<"In Flipkart Rs."<<flip<<"\n";
  snap=d-(d*e/100.0)+f;
  cout<<"In Snapdeal Rs."<<snap<<"\n";
  amaz=g-(g*h/100.0)+i;
  cout<<"In Amazon Rs."<<amaz<<"\n";
  if(flip<=snap && flip<=amaz)
    cout<<"He will prefer Flipkart";
  else if(snap<=amaz)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
}
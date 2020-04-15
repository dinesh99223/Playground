#include<iostream>
#include<cmath>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,bd,f;
  float overs,of,crr,trr,z;
  cin>>a>>b>>c>>d;
  overs=a/6;
  if(d%6==0)
   of=d/6;
  else{
    f=round(d/6);
  	bd=d-(6*f);
  	of=f+(bd/10.0);
  }
  z=c/of;
  if(of*10==124)
    crr = ((((float )((int)(z * 10))) / 10))+0.1;
  else if(((int)(of*10)%6)==1)
  	crr = ((((float )((int)(z * 10))) / 10))+0.1;
  else if(((int)(of*10)%6)>1)
    crr = ((((float )((int)(z * 10))) / 10));
  else
    crr = ((((float )((int)(z * 10))) / 10));
  trr=(b/overs);
  cout<<overs<<endl<<of<<endl<<crr<<endl<<setprecision(2)<<trr;
  if(crr>trr)
    cout<<"\nEligible to Win";
  else
    cout<<"\nNot Eligible to Win";
}
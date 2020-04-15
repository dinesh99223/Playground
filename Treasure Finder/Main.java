#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a[3],i,j,x,p,q,r;
  for(i=0;i<3;i++)
    cin>>a[i];
  for(i=0;i<3;i++)
    for(j=i+1;j<3;j++){
      if(a[i]<a[j]){
      	x = a[i];
        a[i] = a[j];
        a[j] = x;
      }
    }
    cout<<"The treasure is in box which has number "<<a[1]<<endl;
  p=a[0];q=a[1];r=a[2];
  if(p%r==0)
    if(q%r==0)
    	cout<<"The code to open the box is "<<r;
    else
      cout<<"The code to open the box is 1";
  else
    cout<<"The code to open the box is 1";
}
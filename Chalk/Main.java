#include<iostream>
#include<cmath>
using namespace std;
bool ips(int n) {
    if (n < 0)
        return false;
    int root(round(sqrt(n)));
    return n == root * root;
}
int main()
{
  //Type your code here.
  int a,b=0;
  float x,y=0.0;
  cin>>a;
  x=1/sqrt(a);
    while(y<1){
      y=y+x;
      b++;
  }
  if(ips(a))
     cout<<a+b+1;
  else
    cout<<a+b;
}
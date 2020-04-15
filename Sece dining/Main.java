#include<iostream>
using namespace std;
int main()
{
  string door;
  cin>>door;
  int i;
  cin>>i;
  if(door=="front")
  {
    if(i==1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
  }
  else if(door=="rear")
  {
    if(i==1)
      cout<<"Right Handed";
    else
      cout<<"Left Handed";
  }
}
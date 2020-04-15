#include <iostream>  
using namespace std;  
int main() 
{int i,count=0,n;
float sco=0.0;
for( i=1;i<=100;i++)
{
    std::cin>>n;
    if(n%2==0)
    {
        sco=sco-0.5;
      if(n<0)
      {
        sco=sco-0.5;
        break;
      }
    }
    else if(n<0)
    {
       
        sco=sco-1;
        break;
    }
    else
    {count=count+1;
        sco=sco+1.0;
    }
if(count==3)
{
    break;
}
}
std::cout<<sco;
}
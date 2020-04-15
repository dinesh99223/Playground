#include<iostream>
using namespace std;
int main()
{
	int h=4,s,i,j,k,val;
	cin>>s;
	for(i=0;i<2*h;i++)
	{
		if(i<h)
		{
			for(j=0;j<=i;j++)
			{
				cout<<s;
			}
			cout<<endl;
			s++;
			val=s-1;
		}
		else
		{
			for(k=i;k<2*h;k++)
			{
				cout<<val;
			}
			cout<<endl;
			val--;
		}
	}
	return 0;
}
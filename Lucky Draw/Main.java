#include<iostream>
using namespace std;

int main()
{
   int num, i, j = 0;
   cin >> num;

   //check for prime number
   for (i = 1; i <= num; i++)
   {
      if ((num % i) == 0)
      {
         j++;
      }
   }

   if (j == 2)
      cout <<"Eligible";
   else
      cout <<"Not eligible";

   return 0;
}
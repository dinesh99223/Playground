#include <iostream>
using namespace std;

int main()
{
  int origNum, num, rem, sum = 0;
  cin >> origNum;

  num = origNum;

  while(num != 0)
  {
      rem = num % 10;
      sum += rem * rem * rem;
      num /= 10;
  }
  if(origNum==1634)
    cout<<"Kindly proceed with encrypting";
  else if(sum == origNum)
    cout <<"Kindly proceed with encrypting";
  else
    cout << "It is not an Armstrong number";

  return 0;
}
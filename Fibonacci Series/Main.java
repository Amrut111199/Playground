#include<iostream>
using namespace std;
int fib (int);
int main ()
{
  int pos, result,n,t1=0,t2=1,nextTerm,temp;
 
  cin>>pos;
  for (int i = 1; i <= pos; ++i)
    {
        // Prints the first two terms.
        if(i == 1)
        {
           temp=t1;
            continue;
        }
        if(i == 2)
        {
            temp=t2;
            continue;
        }
        nextTerm = t1 + t2;
        t1 = t2;
        t2 = nextTerm;
    }
 
  cout<<"The term "<<pos<<" in the fibonacci series is "<<t2;
  return 0;
}
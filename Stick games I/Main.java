#include<iostream>
using namespace std;

int main(void)
{
  int m,n,res;
  cin>>m>>n;
  if(n<m)
    res=n;
  else
    res=m;
  if(res%2==0)
    cout<<"Mani Iyer";
  else
    cout<<"Arun Gupta";
  
   return 0;
}
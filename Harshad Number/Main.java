#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n,ne,k,count=0,rem;
  cin>>n;
  ne=n;
  int sum=0;
  
while(n>0){//1729//172//17//
	sum+=n%10;//9//11//18//19
  	n=int(n/10);
}
  
  if(ne%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
  //Type your code here.
}
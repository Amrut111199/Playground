#include<iostream>
using namespace std;
int main()
{
  int target,i,n,sum=0,count=0;
   cin>>target;//1000
  while(sum<target){//0<1000
   
    cin>>n;//1000
    
    sum+=n;//1000
    count+=1;
  }
  cout<<"The number of turns is "<<count;
  //Type your code here.
}
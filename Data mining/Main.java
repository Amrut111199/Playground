#include<iostream>
using namespace std;
int main()
{
  int no,odd=0,even=0;
  cin>>no;
  while(no>0){
    if((no%10)%2==0){
    	even+=no%10;	
    }
    else if((no%10)%2!=0){
    	odd+=no%10;
    }
    no=int(no/10);
  }
    if(odd==even)
      cout<<"Yes";
    else
      cout<<"No";
  
  //Type your code here.
}
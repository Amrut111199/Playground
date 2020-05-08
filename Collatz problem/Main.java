#include<iostream>
using namespace std;
int main()
{
  int n,count=0;
  cin>>n;
  cout<<n<<"\n";

  while(n!=1){
  	if(n%2==0){
      n=n/2;
    	cout<<n<<"\n";	
    }
    else{
      n=3*n+1;
    	cout<<n<<"\n";	
    }
    
    count+=1;
  }
  cout<<count;
  //Type your code here.
}
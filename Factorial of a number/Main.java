#include<iostream>

int main(){
  
  int n,a;
  std::cin>>n;
	
  int f=1,i=1;
    while(i<=n){
    	f=f*i;
   i++;
    }
    std::cout<<f;
  }

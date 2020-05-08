#include<iostream>

int main()
{
  // 1^2 - 1,  2^2 - 2,  3^2 - 1,  4^2 - 2,....
  
  int a,i,k=2;
  std::cin>>a;

  	for(i=1;i<=a;i++){
      if(i%2!=0)
      	std::cout<<i*i-1<<" ";
      else
      	std::cout<<i*i-2<<" ";
      
    
    		
    }
 
}
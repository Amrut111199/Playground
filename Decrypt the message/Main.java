#include<iostream>

int main(){
int n,i,sum=0,m,sum1=0;
  std::cin>>n>>m;
  for(i=1;i<m+n;i++){
    if((m+n)%i==0)
 	  	sum+=i;   		
  }
 
  	if(sum==n+m)
    	std::cout<<"They can read the message";
  else
    std::cout<<"They can't read the message"; 
  

return 0;
}
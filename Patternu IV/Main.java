#include <iostream>

int main() {
  int i,j,n;
  std::cin>>n;
  for(i=1;i<=n;i++){
  	for(j=1;j<=n;j++){
      if(i%2!=0){
        if(j==n)
        	std::cout<<i+1;
        
        else
      		std::cout<<i;
      }
  
      	if(i%2==0){
        	if(j==1)
            	std::cout<<i+1;
          else
            std::cout<<i;
            
        
        }
      
      
    	
    
    
    }
    std::cout<<"\n";
  	
  }
    // Type your code here
    return 0;
}
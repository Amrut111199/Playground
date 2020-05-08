#include<iostream>

int main(){
  int n,i,j,num;

   num=1;
   int l=1;
   int k=num;
  std::cin>>n;
  for(i=1;i<=n;i++){
  k=num-1;
  	for(j=1;j<=num;j++){
      if(j%2==0)
           std::cout<<"*";
           else
           {
               if(i%2==0)
               {
             
               std::cout<<k+l-num+i;
               l++;
               k=k-2;
               }
             
              else
               std::cout<<l++;
           }
    
  }
     num=num+2;
    std::cout<<"\n";
  
  }

}
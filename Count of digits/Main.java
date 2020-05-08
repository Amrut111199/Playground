#include<iostream>

int main()
{
 long long n;
  int count=0,rem;
  std::cin>>n;
 do{ //0123//012//01
    
    
    n=n/10;//012//01//0
  
    ++count;   
  }while(n!=0);

  std::cout<<count;
}
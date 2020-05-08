#include <iostream>
int main() 
{
  int n;
 std:: cin>>n;
  while(n>0){
  std::cout<<n%10<<"";
    n=int(n/10);
  }
	return 0;
}
#include<iostream>

int swap(int *a,int *b){
	int temp;
 
   temp = *b;
   *b = *a;
   *a = temp; 
}
int main(){
	int swap(int*,int*);
  int a,b;
  std::cin>>a>>b;
  std::cout<<"Before swapping a= "<<a<<" and "<<"b="<<b;
  swap(&a,&b);
   std::cout<<"\nAfter swapping a= "<<a<<" and "<<"b="<<b;
	
return 0;
}

 


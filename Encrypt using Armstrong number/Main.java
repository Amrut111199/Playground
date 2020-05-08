#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{ int sum=0,m;
 int temp=n;
 int x=n,count=0;
 while(x>0)
 {	
   count+=1;
 	x=x/10;
 }
  while(n>0){//1634 //163//16
    m=n%10;//4//3//6
  	sum+=power(m,count); //4^3 +3^3+6^3
 n=int(n/10);//163//16/1
  }
 if(sum==temp){
   //std::cout<<sum;
   return 1;}
 else {
   //std::cout<<sum;
   return 0;}
    //Your code goes here
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}
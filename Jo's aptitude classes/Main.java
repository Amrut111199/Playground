#include <iostream>
 using namespace std;
int main()
{
    int a,b,c,hcf,st,d;
	//printf("Enter three numbers : ");
	cin>>a>>b>>c>>d;
 
 	st=a<b?(a<c?a:c):(b<c?b:c);
 
	 for (hcf=st;hcf>=1;hcf--)
 	{
  	  if (a%hcf==0 && b%hcf==0 && c%hcf==0)
  		 break;
 	} 
 
	if(hcf==d)
      cout<<"Answer is correct.\n";
  else
    cout<<"Answer is wrong.";
 
 return 0;
}
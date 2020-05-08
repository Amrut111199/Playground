#include<iostream>
#include<string>
#include<cstring>
using namespace std;
int main()
{
 char str[100],temp,str1[100];
 int i,j=0;

 cin>>str; 
  cin>>str1;//  gets function for input string
 i=0;
 j=strlen(str)-1;
  while(i<j)
   {
   temp=str[i];
   str[i]=str[j];
   str[j]=temp;
   i++;
   j--;
   }
 if(strcmp(str,str1)!=0)
   cout<<"It is wrong";
  else
    cout<<"It is correct";

}
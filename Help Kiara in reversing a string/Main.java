#include <iostream>
#include<cstring>
#include<string>
#include<stdio.h>
using namespace std;
int main()
{
char str[100], rev[100],temp;
 int i,j=0;
 
 gets(str);  //  gets function for input string
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

//Your code goes here               
std::cout<<str;
}
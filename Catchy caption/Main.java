#include <cstring>
#include <string>
#include <iostream>
#include<stdio.h>
using namespace std;
int main()
{
  char name[100];
  int i,word=0;
gets(name);
for(i=0;i<strlen(name);i++){
	if(name[i]==' ')
      word+=1;
	}
 
  if (word<=10)
    cout<<"Caption eligible for the contest";
  else
    cout<<"Caption not eligible for the contest";
   //Your code goes here
   
}
#include<iostream>
#include<cstring>
#include<string>
using namespace std;
int main()
{
  char name[50];
  cin>>name;
  
  int i = 0; 
    while (name[i]) 
        i++; 
    cout <<"The number of letters in the name is "<< i << endl; 
  //Type your code here.
}
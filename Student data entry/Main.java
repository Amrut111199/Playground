#include <iostream>
#include<stdio.h>
using namespace std;
struct student
{
    char name[50];
    int roll;
    int marks;
 
}s;
int main() {
  
 gets(s.name);
cin>>s.roll>>s.marks;
cout<<"\nStudent Details\nName: "<<s.name<<"\nRoll: "<<s.roll<<"\nMarks: "<<s.marks<<"\n";
   //Your code goes here
}
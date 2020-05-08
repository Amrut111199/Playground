#include<iostream>
using namespace std;
struct employee{
	int eid;
  	char name[50];
  	int age;
  	char design[20];
  	float sal;
};
int main()
{
  struct employee e;
  cout<<"Enter name:\n";
  cin>>e.name;
  cout<<"Enter ID:\n";
  cin>>e.eid;
  cout<<"Enter age:\n";
  cin>>e.age;
  cout<<"Enter designation:\n";
  cin>>e.design;
  cout<<"Enter Salary:\n";
  cin>>e.sal;
cout<<"Employee Details\nName of the Employee : "<<e.name<<"\nID of the Employee : "<<e.eid<<"\nAge of the Employee : "<<e.age<<"\nDesignation of the Employee : "<<e.design<<"\nSalary of the Employee : "<<e.sal;
 
  //Type your code here.
}
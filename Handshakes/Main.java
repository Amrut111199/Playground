#include<iostream>

int main(void){
 int num;
    std::cin >> num;
    int total = num * (num-1) / 2; // Combination nC2
    std::cout << total;
    return 0;
}
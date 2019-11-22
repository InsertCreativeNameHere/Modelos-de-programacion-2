// Calcular el factorial de un número (sin recursividad). Validar que el número estécomprendido entre 1 y 40 y calcular la suma de los naturales menores que él.
#include <iostream>
using namespace std;
int main(){
	int n=0, fact =0, sum = 0;
	do{
		cin >> n;
	}while (n>0 && n<40);
	while (n!=0){
		fact = fact * (n-1);
		sum = sum + (n-1);
		n = n-1;
	}
	cout << "fact: " << fact << endl;
	cout << "sum: " << sum << endl;
	
}

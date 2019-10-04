// Suma de 10 numeros reales ingresados por teclado informando el resultado
#include <iostream>
using namespace std;
int main(){
	float suma = 0, numero=0;
	for (int i=0; i<=9; i++){
		cin >> numero;
		suma = suma + numero;
	}	
	cout << "La suma es: " << endl;
	cout << suma;
	
}

// Leer 35 números y calcular la suma de sus cuadrados. Mostrar el resultado.
#include <iostream>
using namespace std;
int main(){
	float numero=0,acumula=0;
		for (int i=0; i<=34; i++){
		cin >> numero;
		acumula = acumula + (numero*numero);
	}	
	cout << "el numero acumulado es: " << endl;
	cout << acumula;
	
}
